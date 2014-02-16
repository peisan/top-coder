import org.junit.Test;
import static org.junit.Assert.*;

public class VocaloidsAndSongsTest {

	@Test
	public void test0() {
		int S = 3;
		int gumi = 1;
		int ia = 1;
		int mayu = 1;
		assertEquals(6, new VocaloidsAndSongs().count(S, gumi, ia, mayu));
	}
	
	@Test
	public void test1() {
		int S = 3;
		int gumi = 3;
		int ia = 1;
		int mayu = 1;
		assertEquals(9, new VocaloidsAndSongs().count(S, gumi, ia, mayu));
	}
	
	@Test
	public void test2() {
		int S = 50;
		int gumi = 10;
		int ia = 10;
		int mayu = 10;
		assertEquals(0, new VocaloidsAndSongs().count(S, gumi, ia, mayu));
	}
	
	@Test
	public void test3() {
		int S = 18;
		int gumi = 12;
		int ia = 8;
		int mayu = 9;
		assertEquals(81451692, new VocaloidsAndSongs().count(S, gumi, ia, mayu));
	}
	
	@Test
	public void test4() {
		int S = 50;
		int gumi = 25;
		int ia = 25;
		int mayu = 25;
		assertEquals(198591037, new VocaloidsAndSongs().count(S, gumi, ia, mayu));
	}

    @Test
	public void test5() {
		int S = 10;
		int gumi = 3;
		int ia = 3;
		int mayu = 3;
		assertEquals(0, new VocaloidsAndSongs().count(S, gumi, ia, mayu));
	}

}
