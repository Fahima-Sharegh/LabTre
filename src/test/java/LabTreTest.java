import org.junit.Assert;
import org.junit.Test;
public class LabTreTest {
    @Test
    public void testSumOfNumbersWhenPositiveValue() {
        int actual = 8+1;
        Assert.assertEquals(9, actual);

    }

    @Test
    public void testSubOfNumbersWhenNegativeValue() {
        int expected = 2-3;
        int actual = -1;
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testOfNumberWhenPositiveValue() {
        int actual = 9-5;
        Assert.assertEquals(4, actual);

    }

        @Test
        public void testOfNumbersWhenNegativeValue() {
            int actual = 5*2;
            Assert.assertEquals(-12, actual);

        }
    @Test
    public void testToDivideTwoNumbers() {
        double actual = 6/2;
        // double expected = 3.0;
        Assert.assertEquals(3.0, actual, 0.0001);


    }

    @Test
    public void toMultiTwoNumbers() {
        int expected = 4*2;
        int actual = 8;
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void testToMultiTwoNumbers() {
        int expected = 43*2;
        int actual =12;
        Assert.assertEquals(expected,actual);

    }
}

