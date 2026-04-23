import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class TriangleAreaCalculatorTest {
    @Test
    public void areaValid() {
        assertEquals(TriangleAreaCalculator.area(5, 4), 10.0, 0.001);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void areaThrowsForZero() {
        TriangleAreaCalculator.area(0, 5);
    }
}
