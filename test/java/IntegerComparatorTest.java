import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IntegerComparatorTest {
    @Test
    public void compareGreater() {
        assertEquals("5 > 3", IntegerComparator.compare(5, 3));
    }

    @Test
    public void compareLess() {
        assertEquals("2 < 4", IntegerComparator.compare(2, 4));
    }

    @Test
    public void compareEqual() {
        assertEquals("7 = 7", IntegerComparator.compare(7, 7));
    }
}
