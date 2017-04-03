import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BubbleSortTest {

    private BubbleSort bubbleSort;

    @Before
    public void setUp() {
        bubbleSort = new BubbleSort;
    }

    @Test
    public void  testBubbleSortCanSortTwoLetters() {
        char[] input = {'b', 'a'};
        char[] output = {'a', 'b'};

        Assert.assertEquals(output, bubbleSort.sort(input));
    }

}