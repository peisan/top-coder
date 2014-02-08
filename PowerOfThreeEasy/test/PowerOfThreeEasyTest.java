import org.junit.Test;
import static org.junit.Assert.*;

public class PowerOfThreeEasyTest {
	
	@Test
	public void test0() {
		int x = 1;
		int y = 3;
		assertEquals("Possible", new PowerOfThreeEasy().ableToGet(x, y));
	}
	
	@Test
	public void test1() {
		int x = 1;
		int y = 1;
		assertEquals("Impossible", new PowerOfThreeEasy().ableToGet(x, y));
	}
	
	@Test
	public void test2() {
		int x = 3;
		int y = 0;
		assertEquals("Impossible", new PowerOfThreeEasy().ableToGet(x, y));
	}
	
	@Test
	public void test3() {
		int x = 1;
		int y = 9;
		assertEquals("Impossible", new PowerOfThreeEasy().ableToGet(x, y));
	}
	
	@Test
	public void test4() {
		int x = 3;
		int y = 10;
		assertEquals("Possible", new PowerOfThreeEasy().ableToGet(x, y));
	}
	
	@Test
	public void test5() {
		int x = 1093;
		int y = 2187;
		assertEquals("Possible", new PowerOfThreeEasy().ableToGet(x, y));
	}
	
	@Test
	public void test6() {
		int x = 0;
		int y = 0;
		assertEquals("Possible", new PowerOfThreeEasy().ableToGet(x, y));
	}

    @Test
    public void test7() {
        int x = 30;
        int y = 10;
        assertEquals("Possible", new PowerOfThreeEasy().ableToGet(x, y));
    }

}
