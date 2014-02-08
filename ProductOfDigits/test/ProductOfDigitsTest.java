import org.junit.Test;
import static org.junit.Assert.*;

public class ProductOfDigitsTest {
	
	@Test
	public void test0() {
		int N = 1;
		assertEquals(1, new ProductOfDigits().smallestNumber(N));
	}
	
	@Test
	public void test1() {
		int N = 10;
		assertEquals(2, new ProductOfDigits().smallestNumber(N));
	}
	
	@Test
	public void test2() {
		int N = 26;
		assertEquals(-1, new ProductOfDigits().smallestNumber(N));
	}
	
	@Test
	public void test3() {
		int N = 100;
		assertEquals(3, new ProductOfDigits().smallestNumber(N));
	}
	
	@Test
	public void test4() {
		int N = 2520;
		assertEquals(4, new ProductOfDigits().smallestNumber(N));
	}
	
	@Test
	public void test5() {
		int N = 864;
		assertEquals(4, new ProductOfDigits().smallestNumber(N));
	}
}
