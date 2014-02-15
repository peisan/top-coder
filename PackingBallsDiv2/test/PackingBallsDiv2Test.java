import org.junit.Test;

import static org.junit.Assert.*;

public class PackingBallsDiv2Test {

    @Test
    public void test1() {
        int R = 1;
        int G = 7;
        int B = 1;
        assertEquals(3, new PackingBallsDiv2().minPacks(R, G, B));
    }

    @Test
    public void test2() {
        int R = 2;
        int G = 3;
        int B = 5;
        assertEquals(4, new PackingBallsDiv2().minPacks(R, G, B));
    }

    @Test
    public void test3() {
        int R = 78;
        int G = 53;
        int B = 64;
        assertEquals(66, new PackingBallsDiv2().minPacks(R, G, B));
    }

    @Test
    public void test4() {
        int R = 100;
        int G = 100;
        int B = 100;
        assertEquals(100, new PackingBallsDiv2().minPacks(R, G, B));
    }

    @Test
    public void test5() {
        int R = 4;
        int G = 4;
        int B = 4;
        assertEquals(4, new PackingBallsDiv2().minPacks(R, G, B));
    }


    @Test
    public void test6() {
        int R = 7;
        int G = 4;
        int B = 7;
        assertEquals(6, new PackingBallsDiv2().minPacks(R, G, B));
    }

    @Test
    public void test7() {
        int R = 7;
        int G = 4;
        int B = 6;
        assertEquals(6, new PackingBallsDiv2().minPacks(R, G, B));
    }

    @Test
    public void test8() {
        int R = 7;
        int G = 4;
        int B = 5;
        assertEquals(6, new PackingBallsDiv2().minPacks(R, G, B));
    }

    @Test
    public void test9() {
        int R = 100;
        int G = 101;
        int B = 100;
        assertEquals(101, new PackingBallsDiv2().minPacks(R, G, B));
    }

    @Test
    public void test10() {
        int R = 102;
        int G = 101;
        int B = 100;
        assertEquals(102, new PackingBallsDiv2().minPacks(R, G, B));
    }

    public void test11() {
        int R = 100;
        int G = 101;
        int B = 105;
        assertEquals(103, new PackingBallsDiv2().minPacks(R, G, B));
    }

    public void test12() {
        int R = 100;
        int G = 101;
        int B = 107;
        assertEquals(104, new PackingBallsDiv2().minPacks(R, G, B));
    }

    public void test13() {
        int R = 0;
        int G = 0;
        int B = 0;
        assertEquals(0, new PackingBallsDiv2().minPacks(R, G, B));
    }

    public void test14() {
        int R = 100;
        int G = 107;
        int B = 107;
        assertEquals(105, new PackingBallsDiv2().minPacks(R, G, B));
    }


}
