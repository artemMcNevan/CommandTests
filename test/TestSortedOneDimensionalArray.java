import org.junit.Before;
import test1.SortedOneDimensionalArray;

public class TestSortedOneDimensionalArray {
    private SortedOneDimensionalArray sortedOneDimensionalArray = new SortedOneDimensionalArray();

    @Before
    public void setUpSortedOneDimensionalArray() {
        for (int i = -1000; i < 1000; i++) {
            sortedOneDimensionalArray.add(i);
        }
    }
}
