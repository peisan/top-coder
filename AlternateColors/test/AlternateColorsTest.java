import org.junit.Test;
import static org.junit.Assert.*;

public class AlternateColorsTest {
	
	@Test
	public void test0() {
		long r = 1L;
		long g = 1L;
		long b = 1L;
		long k = 3L;
		assertEquals("BLUE", new AlternateColors().getColor(r, g, b, k));
	}
	
	@Test
	public void test1() {
		long r = 3L;
		long g = 4L;
		long b = 5L;
		long k = 4L;
		assertEquals("RED", new AlternateColors().getColor(r, g, b, k));
	}
	
	@Test
	public void test2() {
		long r = 7L;
		long g = 7L;
		long b = 1L;
		long k = 7L;
		assertEquals("GREEN", new AlternateColors().getColor(r, g, b, k));
	}
	
	@Test
	public void test3() {
		long r = 1000000000000L;
		long g = 1L;
		long b = 1L;
		long k = 1000000000002L;
		assertEquals("RED", new AlternateColors().getColor(r, g, b, k));
	}
	
	@Test
	public void test4() {
		long r = 653L;
		long g = 32L;
		long b = 1230L;
		long k = 556L;
		assertEquals("BLUE", new AlternateColors().getColor(r, g, b, k));
	}

    @Test
    public void test5() {
        long r = 33L;
        long g = 38L;
        long b = 18L;
        long k = 85L;
        assertEquals("GREEN", new AlternateColors().getColor(r, g, b, k));
    }
}
