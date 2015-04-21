package romannumerals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanNumeralsTest {
	
	@Test
	public void oneTwoThreeToRoman(){
		assertEquals("I", RomanNumerals.numberToRoman(1));
		assertEquals("II", RomanNumerals.numberToRoman(2));
	}

}
