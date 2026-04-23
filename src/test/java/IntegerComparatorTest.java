import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class IntegerComparatorTest {
    @Test
    public void compareGreater() { assertEquals(IntegerComparator.compare(5, 3), "5 > 3"); }
    @Test
    public void compareLess() { assertEquals(IntegerComparator.compare(2, 4), "2 < 4"); }
    @Test
    public void compareEqual() { assertEquals(IntegerComparator.compare(7, 7), "7 = 7"); }
}
