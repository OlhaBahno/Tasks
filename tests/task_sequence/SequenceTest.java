package task_sequence;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SequenceTest {
    Sequence s;

    @BeforeEach
    void setUp() {

        s = new Sequence();
    }

    @ParameterizedTest
    @MethodSource("data")
    public void range(int min, int length, int [] res) {

        s.setMin_square(min);
        s.setLength_sequence(length);

        assertArrayEquals(s.range(),res);
    }

    public static Stream data() {

        return Stream.of(Arguments.of(50,6,new int [] {8,9,10,11,12,13}),
                Arguments.of(36,7,new int [] {6,7,8,9,10,11,12}),
                Arguments.of(11,8,new int [] {4,5,6,7,8,9,10,11}),
                Arguments.of(145,3,new int[] {13,14,15}),
                Arguments.of(400,2,new int[] {20,21})
        );
    }
}