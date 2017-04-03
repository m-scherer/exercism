import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BubbleSortTest {

    private BubbleSort bubbleSort;

    @Before
    public void setUp() {
        bubbleSort = new BubbleSort();
    }

    @Test
    public void testItCanSortTwo() {
        Character[] input = new Character[]{'b','a'};
        Character[] output = new Character[]{'a','b'};

        Assert.assertEquals(output, bubbleSort.sort(input));
    }

    @Test
    public void testItCanSortThree() {
        Character[] input = new Character[]{'b','a','c'};
        Character[] output = new Character[]{'a','b','c'};

        Assert.assertEquals(output, bubbleSort.sort(input));
    }

    @Test
    public void testItCanSortTheWholeAlphabet() {
        Character[] input = new Character[]{'z','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','a'};
        Character[] output = new Character[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        Assert.assertEquals(output, bubbleSort.sort(input));
    }

}
