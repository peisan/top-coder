import org.junit.Test;
import static org.junit.Assert.*;

public class FoxAndWordTest {
	
	@Test
	public void test0() {
		String[] words = new String[] {"tokyo", "kyoto"};
		assertEquals(1, new FoxAndWord().howManyPairs(words));
	}
	
	@Test
	public void test1() {
		String[] words = new String[] {"aaaaa", "bbbbb"};
		assertEquals(0, new FoxAndWord().howManyPairs(words));
	}
	
	@Test
	public void test2() {
		String[] words = new String[] {"ababab","bababa","aaabbb"};
		assertEquals(1, new FoxAndWord().howManyPairs(words));
	}
	
	@Test
	public void test3() {
		String[] words = new String[] {"eel", "ele", "lee"};
		assertEquals(3, new FoxAndWord().howManyPairs(words));
	}
	
	@Test
	public void test4() {
		String[] words = new String[] {"aaa", "aab", "aba", "abb", "baa", "bab", "bba", "bbb"};
		assertEquals(6, new FoxAndWord().howManyPairs(words));
	}
	
	@Test
	public void test5() {
		String[] words = new String[] {"top","coder"};
		assertEquals(0, new FoxAndWord().howManyPairs(words));
	}

    @Test
    public void test6() {
        String[] words = new String[] {"a","a"};
        assertEquals(0, new FoxAndWord().howManyPairs(words));
    }
}
