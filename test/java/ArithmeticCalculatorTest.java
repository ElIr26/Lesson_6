import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticCalculatorTest {
    @Test
    public void testAdd() {
        assertEquals(7, ArithmeticCalculator.add(3, 4));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, ArithmeticCalculator.subtract(5, 4));
    }

    @Test
    public void testMultiply() {
        assertEquals(20, ArithmeticCalculator.multiply(4, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2.5, ArithmeticCalculator.divide(5, 2));
    }

    @Test
    public void divideByZeroThrows() {
        assertThrows(IllegalArgumentException.class, () -> ArithmeticCalculator.divide(5, 0));
    }
}
