import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ArithmeticCalculatorTest {
    @Test
    public void testAdd() {
        assertEquals(ArithmeticCalculator.add(3, 4), 7);
    }

    @Test
    public void testSubtract() {
        assertEquals(ArithmeticCalculator.subtract(5, 4), 1);
    }

    @Test
    public void testMultiply() {
        assertEquals(ArithmeticCalculator.multiply(4, 5), 20);
    }

    @Test
    public void testDivide() {
        assertEquals(ArithmeticCalculator.divide(5, 2), 2.5);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void divideByZeroThrows() {
        ArithmeticCalculator.divide(5, 0);
    }
}
