package stringCalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void emptyString() {
		StringCalculator calculator = new StringCalculator();
		assertEquals(0, calculator.add(""));
		assertEquals(1, calculator.add("1"));
		assertEquals(2, calculator.add("2"));
		assertEquals(4, calculator.add("2,2"));
	}
		
	
}
