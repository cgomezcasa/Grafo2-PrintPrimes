import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import org.junit.Test;

public class PrintPrimesTest {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	//Arco 2 - 3
	@Test
	public void test1() {
		String[] arg = {"1"};
		PrintPrimes.main(arg);
		assertEquals("Prime: 2\n", outContent.toString());
	}
	
	@Test
	public void test2() {
		String[] arg = {"2"};
		PrintPrimes.main(arg);
		assertEquals("Prime: 2\n" + "Prime: 3\n", outContent.toString());
	}
	
	@Test
	public void test3() {
		String[] arg = {"0"};
		PrintPrimes.main(arg);
		assertEquals(" ", outContent.toString());
	}
	
	@Test
	public void test4() {
		String[] arg = {"3"};
		PrintPrimes.main(arg);
		assertEquals("Prime: 2\n" + "Prime: 3\n" + "Prime: 5\n", outContent.toString());
	}
	
	@Test
	public void test5() {
		String[] arg = {""};
		PrintPrimes.main(arg);
		assertEquals("Prime: 2\n", outContent.toString());
	}
}
