import static org.junit.Assert.*;
import org.junit.Test;
public class CalculatorTest {
	@Test
	public void testAdd()
	{
		Calculator c=new Calculator();
		assertEquals(10,c.add(7, 3));
		
	}
	@Test
	public void testsub()
	{
		Calculator c=new Calculator();
		assertEquals(4,c.sub(9, 5));
		
	}

}
