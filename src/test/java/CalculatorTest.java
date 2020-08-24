import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAddNumbers() {
        assertEquals(7, calculator.addNumbers(3, 4));
    }

    @Test
    public void canSubtractNumbers() {
        assertEquals(5, calculator.subtractNumbers(10, 5));
    }

    @Test
    public void canMultiplyNumbers() {
        assertEquals(20, calculator.multiplyNumbers(4, 5));
    }
}
