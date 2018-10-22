package task_ticket;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PackageTest {

    Package p;
    @BeforeEach
    void setUp() {
        p = new Package();
    }

    @ParameterizedTest
    @MethodSource("data")
    void winnerIsSimple(String min, String max, String res) {
        p.setMin(min);
        p.setMax(max);
        p.Sort();

        assertEquals(res,p.winner());
    }

    public static Stream data(){

        return Stream.of(Arguments.of("100000","100003","\nSimple method is winner"),
                Arguments.of("200020","200025","\nSimple method is winner"),
                Arguments.of("900007","900009","\nSimple method is winner"));

    }

    @ParameterizedTest
    @MethodSource("data1")
    void winnerIsComplicated(String min, String max, String res) {
        p.setMin(min);
        p.setMax(max);
        p.Sort();

        assertEquals(res,p.winner());
    }

    public static Stream data1(){

        return Stream.of(Arguments.of("456712","897865","\nComplicated method is winner"),
                Arguments.of("541678","598642","\nComplicated method is winner"),
                Arguments.of("197065","479403","\nComplicated method is winner"));

    }
}