import org.junit.Test;

import static org.junit.Assert.*;

public class MagicalStringDiv2Test {

    @Test
    public void test0() {
        String S = ">><<><";
        assertEquals(2, new MagicalStringDiv2().minimalMoves(S));
    }

    @Test
    public void test1() {
        String S = ">>>><<<<";
        assertEquals(0, new MagicalStringDiv2().minimalMoves(S));
    }

    @Test
    public void test2() {
        String S = "<<>>";
        assertEquals(4, new MagicalStringDiv2().minimalMoves(S));
    }

    @Test
    public void test3() {
        String S = "<><<<>>>>><<>>>>><>><<<>><><><><<><<<<<><<>>><><><";
        assertEquals(20, new MagicalStringDiv2().minimalMoves(S));
    }

    @Test
    public void test4() {
        String S = ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>";
        assertEquals(20, new MagicalStringDiv2().minimalMoves(S));
    }

    @Test
    public void test5() {
        String S = "<<";
        assertEquals(1, new MagicalStringDiv2().minimalMoves(S));
    }


}
