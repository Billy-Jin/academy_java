package junitTest.string.Calculator;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class LastCalculatorTest {

	static Calculator cal = null;
	
	@BeforeClass
	public static void Setup() {
		System.out.println("@BeforeClass");
		cal=new Calculator();
	}
	
	@Test
	public void testAdd() {
		System.out.println("@Test-testAdd()");
		//StringCalculator calc = new StringCalculator();
		int result = cal.add(10, 90); //예상값 100
//		assertEquals(예상값,실제값);
		assertEquals(100,result);
	}
	
	@Test
	public void testMinus() {
		System.out.println("@Test-testMinus()");
		//StringCalculator calc = new StringCalculator();
		int result=cal.minus(90, 90); //예상값 0
//		assertEquals(예상값,실제값);
		assertEquals(0,result);
	}
	
	@Test
	public void testMultiplication () {
		System.out.println("@Test-testMultiplication()");
		//StringCalculator calc = new StringCalculator();
		int result=cal.multi(3, 3); //예상값 100
//		assertEquals(예상값,실제값);
		assertEquals(9,result);
	}
	
	@Test
	public void testReset() {
		System.out.println("@Test-testReset()");
		String s=cal.reset("r");
		assertEquals("r",s);
	}
	
	@Test
	public void testClose() {
		System.out.println("@Test-testClose()");
		String s=cal.close("c");
		assertEquals("c",s);
	}
	
	
}
