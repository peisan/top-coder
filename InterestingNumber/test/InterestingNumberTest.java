import org.junit.Test;

import static org.junit.Assert.*;

public class InterestingNumberTest {

    @Test
    public void test0() {
        String x = "2002";
        assertEquals("Interesting", new InterestingNumber().isInteresting(x));
    }

    @Test
    public void test1() {
        String x = "1001";
        assertEquals("Not interesting", new InterestingNumber().isInteresting(x));
    }


    @Test
    public void test2() {
        String x = "41312432";
        assertEquals("Interesting", new InterestingNumber().isInteresting(x));
    }

    @Test
    public void test3() {
        String x = "611";
        assertEquals("Not interesting", new InterestingNumber().isInteresting(x));
    }

    @Test
    public void test4() {
        String x = "64200246";
        assertEquals("Interesting", new InterestingNumber().isInteresting(x));
    }

    @Test
    public void test5() {
        String x = "631413164";
        assertEquals("Not interesting", new InterestingNumber().isInteresting(x));
    }

    @Test
    public void test6() {
        String x = "10100";
        assertEquals("Not interesting", new InterestingNumber().isInteresting(x));
    }

    @Test
    public void test7() {
        String x = "420024";
        assertEquals("Interesting", new InterestingNumber().isInteresting(x));
    }

    @Test
    public void test8() {
        String x = "0";
        assertEquals("Not interesting", new InterestingNumber().isInteresting(x));
    }


}
