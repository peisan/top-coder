import org.junit.Test;
import static org.junit.Assert.*;

public class MysticAndCandiesEasyTest {
	
	@Test
	public void test0() {
		int C = 10;
		int X = 10;
		int[] high = new int[] {20};
		assertEquals(1, new MysticAndCandiesEasy().minBoxes(C, X, high));
	}
	
	@Test
	public void test1() {
		int C = 10;
		int X = 7;
		int[] high = new int[] {3, 3, 3, 3, 3};
		assertEquals(4, new MysticAndCandiesEasy().minBoxes(C, X, high));
	}
	
	@Test
	public void test2() {
		int C = 100;
		int X = 63;
		int[] high = new int[] {12, 34, 23, 45, 34};
		assertEquals(3, new MysticAndCandiesEasy().minBoxes(C, X, high));
	}
	
	@Test
	public void test3() {
		int C = 19;
		int X = 12;
		int[] high = new int[] {12, 9, 15, 1, 6, 4, 9, 10, 10, 10, 14, 14, 1, 1, 12, 10, 9, 2, 3, 6, 1, 7, 3, 4, 10, 3, 14};
		assertEquals(22, new MysticAndCandiesEasy().minBoxes(C, X, high));
	}
	
	@Test
	public void test4() {
		int C = 326;
		int X = 109;
		int[] high = new int[] {9, 13, 6, 6, 6, 16, 16, 16, 10, 16, 4, 3, 10, 8, 11, 17, 12, 5, 7, 8, 7, 4, 15, 7, 14, 2, 2, 1, 17, 1, 7, 7, 12, 17, 2, 9, 7, 1, 8, 16, 7, 4, 16, 2, 13, 3, 13, 1, 17, 6};
		assertEquals(15, new MysticAndCandiesEasy().minBoxes(C, X, high));
	}

    	@Test
	public void test5() {
		int C = 326;
		int X = 109;
		int[] high = new int[] {9, 13, 6, 6, 6, 16, 16, 16, 10, 16, 4, 3, 10, 8, 11, 17, 12, 5, 7, 8, 7, 4, 15, 7, 14, 2, 2, 1, 17, 1, 7, 7, 12, 17, 2, 9, 7, 1, 8, 16, 7, 4, 16, 2, 13, 3, 13, 1, 17, 6};
		assertEquals(15, new MysticAndCandiesEasy().minBoxes(C, X, high));
	}
}
