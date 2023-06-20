import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NewReqsTest {
    private StringCalculator calc;
    private String input;
    @BeforeEach

    public void setUp() {
        calc = new StringCalculator();
        input = new String();
    }

    @AfterEach
    public void tearDown() {
        calc = null;
        input = null;
    }

    @Test
    public void detectNegativeNum() {
        input = "-3,5";
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> calc.add(input));
        assertEquals("Negatives not allowed.", exception.getMessage());
    }

    @Test
    public void detectGreaterThanThousand1() {
        input = "5,1000";
        assertEquals(5,calc.add(input));
    }
    @Test
    public void detectGreaterThanThousand2() {
        input = "5,1001";
        assertEquals(5,calc.add(input));
    }
    @Test
    public void detectGreaterThanThousand3() {
        input = "5,1000,1001";
        assertEquals(5,calc.add(input));
    }
}
