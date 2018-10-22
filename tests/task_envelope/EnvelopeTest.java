package task_envelope;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EnvelopeTest {
    Analyze analyze;


    @BeforeEach
    void setUp() {
        analyze = new Analyze();
    }

    @ParameterizedTest
    @MethodSource("data1")
    void compareEnvelopes_isFirstLarger(double ev1H, double ev1W, double ev2H,double ev2W) {
        assertTrue(analyze.compareEnvelopes(new Envelope(ev1H,ev1W), new Envelope(ev2H,ev2W)));
    }

    public static Stream data1() {
        return Stream.of(Arguments.of(8.0,7.0,7.0,1.0),
                Arguments.of(5.5,5.0,2.3,2.8),
                Arguments.of(56.0,65.1,45.4,11.7),
                Arguments.of(10.0,10.0,6.0,6.0),
                Arguments.of(14.7,18.0,14.6,16.9)
        );
    }

    @ParameterizedTest
    @MethodSource("data2")
    void compareEnvelopes_isFirstSmaller(double ev1H, double ev1W, double ev2H,double ev2W) {
        assertFalse(analyze.compareEnvelopes(new Envelope(ev1H,ev1W), new Envelope(ev2H,ev2W)));
    }

    public static Stream data2() {
        return Stream.of(Arguments.of(6.0,6.0,7.0,7.0),
                Arguments.of(55.5,5.0,75.3,9.8),
                Arguments.of(10.0,12.1,13.4,17.7),
                Arguments.of(1.0,1.0,6.0,6.0),
                Arguments.of(14.7,18.0,15.6,18.1)
        );
    }
}