package romannumerals;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanNumeralsTest {
	
	@Test
	public void oneTwoThreeToRoman(){
		assertEquals("I", RomanNumerals.numberToRoman(1));
		assertEquals("II", RomanNumerals.numberToRoman(2));
		assertEquals("III", RomanNumerals.numberToRoman(3));
	}
	
	@Test
	public void four() throws Exception {
		assertEquals("IV", RomanNumerals.numberToRoman(4));
	}

}
