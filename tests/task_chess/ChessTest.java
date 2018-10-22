package task_chess;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChessTest {

    Analyze analyze;
    @BeforeEach
    void setUp() {
        analyze = new Analyze();
    }


    @ParameterizedTest
    @MethodSource("dataForString")
    void is_String(String s) {
        int actual = analyze.getParam(s);
        int expected = -1;

        assertEquals(expected,actual);
    }

    public static Stream dataForString() {
        return Stream.of(Arguments.of("Check this string"),
                Arguments.of("gh7th58"),
                Arguments.of("-6hgugh75jg"),
                Arguments.of("string75o5"),
                Arguments.of("80-_68696")
        );
    }

    @ParameterizedTest
    @MethodSource("dataForDigit")
    void is_Digit(String s) {
        int actual = analyze.getParam(s);
        int expected = Integer.parseInt(s);

        assertEquals(expected,actual);
    }

    public static Stream dataForDigit() {
        return Stream.of(Arguments.of("100"),
                Arguments.of("6"),
                Arguments.of("90"),
                Arguments.of("5"),
                Arguments.of("67")
        );
    }

    @ParameterizedTest
    @MethodSource("dataForNotDigit")
    void isNotPositiveDigit(String s) {
        int actual = analyze.getParam(s);
        int expected = 0;

        assertEquals(expected,actual);
    }

    public static Stream dataForNotDigit() {
        return Stream.of(Arguments.of("-100"),
                Arguments.of("-67"),
                Arguments.of("-62"),
                Arguments.of("-3"),
                Arguments.of("-4696")
        );
    }
}