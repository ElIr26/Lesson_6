import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FactorialCalculatorTest {
    @Test
    public void factorialOfZero() {
        assertEquals(FactorialCalculator.factorial(0), 1);
    }

    @Test
    public void factorialOfPositive() {
        assertEquals(FactorialCalculator.factorial(5), 120);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void factorialThrowsForNegative() {
        FactorialCalculator.factorial(-1);
    }
}