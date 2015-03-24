package stringCalculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class StringCalculatorTest {

	private StringCalculator calculator = new StringCalculator();
	@Test
	public void emptyString() {
		
		assertEquals(0, calculator.add(""));
		assertEquals(1, calculator.add("1"));
		assertEquals(2, calculator.add("2"));
		assertEquals(4, calculator.add("2,2"));
		assertEquals(7, calculator.add("2,2,3"));
		assertEquals(6, calculator.add("1\n2\n3"));
		assertEquals(6, calculator.add("1\n2\n3"));
		assertEquals(5, calculator.add("2000,2,3"));
		
	}
	
	@Test
	public void newDelimiter(){
		assertEquals(3, calculator.add("//,\n1,2"));
		assertEquals(3, calculator.add("//*\n1*2"));
	}
	
	@Test
	public void negativeException(){
		try {
			calculator.add("3,-1,2,2");
			fail();
		} catch (Exception e) {
			System.out.println(e);
			
		}
	}
	
	@Test
	public void multipleDelimiters(){
		
		assertEquals(6, calculator.add("//%%\n1%%2%%3"));
	}
		
	
}
