import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialCalculatorTest {
    @Test
    public void factorialOfZero() {
        assertEquals(1, FactorialCalculator.factorial(0));
    }

    @Test
    public void factorialOfPositive() {
        assertEquals(120, FactorialCalculator.factorial(5));
    }

    @Test
    public void factorialThrowsForNegative() {
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.factorial(-1));
    }
}
