import org.junit.Test;
import static org.junit.Assert.*;

public class AlternateColors2Test {
	
	@Test
	public void test0() {
		int n = 1;
		int k = 1;
		assertEquals(1L, new AlternateColors2().countWays(n, k));
	}
	
	@Test
	public void test1() {
		int n = 3;
		int k = 3;
		assertEquals(3L, new AlternateColors2().countWays(n, k));
	}
	
	@Test
	public void test2() {
		int n = 6;
		int k = 4;
		assertEquals(9L, new AlternateColors2().countWays(n, k));
	}
	
	@Test
	public void test3() {
		int n = 6;
		int k = 1;
		assertEquals(21L, new AlternateColors2().countWays(n, k));
	}
	
	@Test
	public void test4() {
		int n = 1000;
		int k = 2;
		assertEquals(1L, new AlternateColors2().countWays(n, k));
	}
	
	@Test
	public void test5() {
		int n = 100000;
		int k = 100000;
		assertEquals(1666700000L, new AlternateColors2().countWays(n, k));
	}
}
