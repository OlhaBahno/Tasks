package task_triangle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleTest {

    GetTriangle a;

    @BeforeEach
    void setUp(){
        a = new GetTriangle();
    }

    @ParameterizedTest
    @MethodSource("data1")
    void isEnough(boolean b, String [] your) {

        assertEquals(b,a.isEnough(your));
    }

    public static Stream data1() {

        return Stream.of(Arguments.of(true, new String [] {"t","5"}),
                Arguments.of(true, new String [] {"tr","5","","4"}),
                Arguments.of(false, new String [] {"triang","5","5","45"}),
                Arguments.of(true, new String [] {"t","12","5","6","12"}),
                Arguments.of(true, new String [] {"t","10",""}),
                Arguments.of(false, new String [] {"triangle","5","10","1"}));
    }

    @ParameterizedTest
    @MethodSource("data2")
    void isPossibleCreate(boolean b, String [] your) {

        assertEquals(b,a.isPossibleCreate(your));
    }

    public static Stream data2() {

        return Stream.of(Arguments.of(false, new String [] {"t","5","4","3"}),
                Arguments.of(false, new String [] {"tr","10","12","7"}),
                Arguments.of(true, new String [] {"triang","10","20","57"}),
                Arguments.of(true, new String [] {"t","12","5","6"}),
                Arguments.of(false, new String [] {"t","9","6","7"}),
                Arguments.of(true, new String [] {"triangle","5","10","1"}));
    }
}