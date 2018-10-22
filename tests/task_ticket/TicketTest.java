package task_ticket;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TicketTest {

    Ticket t;

    @BeforeEach
    void setUp() {
        t = new Ticket();
    }

    @Test
    void isLucky_BySimple() {
    }



    @ParameterizedTest
    @ValueSource (strings = {"100001","123321","902533","559676","806455"})
    void IsLucky_BySimple(String number) {
       t.setNumber(number);
       assertTrue(t.isLucky_BySimple());
    }

    @ParameterizedTest
    @ValueSource (strings = {"111246","982152","753624","543210","806555"})
    void IsLucky_ByComplicated(String number) {
        t.setNumber(number);
        assertTrue(t.isLucky_ByComplcatited());
    }


}