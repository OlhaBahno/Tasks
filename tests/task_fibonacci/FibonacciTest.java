package task_fibonacci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FibonacciTest {

    Fibonacci f;
    @BeforeEach
    void setUp() {
        f = new Fibonacci();
    }

    @ParameterizedTest
    @MethodSource("BySegment")
    void numFib_BySegment(int min, int max, int [] res) {
        f.setBorder1(min);
        f.setBorder2(max);
        assertArrayEquals(res,f.numFib_BySegment());
    }

    public static Stream BySegment() {

        return Stream.of(Arguments.of(4,100,new int [] {5, 8, 13, 21, 34, 55, 89}),
                Arguments.of(8,1000,new int [] {8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987}),
                Arguments.of(100,600,new int [] {144, 233, 377}),
                Arguments.of(1900,17000,new int[] {2584, 4181, 6765, 10946})
        );
    }

    @ParameterizedTest
    @MethodSource("ByLength")
    void numFib_ByLength(int length, int [] res) {
        f.setLength(length);
        assertArrayEquals(res,f.numFib_ByLength());
    }

    public static Stream ByLength() {

        return Stream.of(Arguments.of(2,new int [] {13, 21, 34, 55, 89}),
                Arguments.of(5,new int [] {10946,17711,28657,46368,75025}),
                Arguments.of(3,new int [] {144, 233, 377, 610, 987}),
                Arguments.of(4,new int[] {1597, 2584, 4181, 6765})
        );
    }
}