import org.junit.Test;
import static org.junit.Assert.*;

public class OneDimensionalRobotEasyTest {
	
	@Test
	public void test0() {
		String commands = "RRLRRLLR";
		int A = 10;
		int B = 10;
		assertEquals(2, new OneDimensionalRobotEasy().finalPosition(commands, A, B));
	}
	
	@Test
	public void test1() {
		String commands = "RRRRR";
		int A = 3;
		int B = 4;
		assertEquals(4, new OneDimensionalRobotEasy().finalPosition(commands, A, B));
	}
	
	@Test
	public void test2() {
		String commands = "LLLLLLLLLLR";
		int A = 2;
		int B = 6;
		assertEquals(-1, new OneDimensionalRobotEasy().finalPosition(commands, A, B));
	}
	
	@Test
	public void test3() {
		String commands = "RRRRRRRLRRLRRRRRRRRRRRRLRLRRRRRRRRLRRRRRLRRRRRRRRR";
		int A = 5;
		int B = 20;
		assertEquals(20, new OneDimensionalRobotEasy().finalPosition(commands, A, B));
	}
	
	@Test
	public void test4() {
		String commands = "RLRLLLLLLLRLLLRLLLLLLLLRLLLLLRLLLRRLLLLLRLLLLLRLLL";
		int A = 34;
		int B = 15;
		assertEquals(-30, new OneDimensionalRobotEasy().finalPosition(commands, A, B));
	}
}
