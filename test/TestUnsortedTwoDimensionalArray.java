import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import test1.UnsortedTwoDimensionalArray;

public class TestUnsortedTwoDimensionalArray {
    private static int[][] twoDimensionalArray = new int[100][100];
    private static final int MIN_VALUE = -569;
    private static final int MAX_VALUE = 543;

    @Before
    public void setUpArray() {
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                twoDimensionalArray[i][j] = UnsortedTwoDimensionalArray.randInt(MIN_VALUE, MAX_VALUE);
            }
        }
    }

    @Test
    public void testGetMinValueInUnsortedIntegerArray() {
        Assert.assertTrue(MIN_VALUE == UnsortedTwoDimensionalArray.getMinElementInUnsortedIntegerArray(twoDimensionalArray));
    }
}
