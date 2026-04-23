import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleAreaCalculatorTest {
    @Test
    public void areaValid() {
        assertEquals(10.0, TriangleAreaCalculator.area(5, 4));
    }

    @Test
    public void areaThrowsForZero() {
        assertThrows(IllegalArgumentException.class, () -> TriangleAreaCalculator.area(0, 5));
    }
}
