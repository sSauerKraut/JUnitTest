import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void additionBetweenNumbers() {
        assertEquals(6, Calculator.addition(3, 3));
    }

    @Test
    public void additionAssertFalse() {
        assertFalse(Calculator.addition(3, 2) == 6);
    }
}