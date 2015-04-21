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
	
	@Test
	public void five() throws Exception {
		assertEquals("V", RomanNumerals.numberToRoman(5));
	}
	
	@Test
	public void sixSevenEightToRoman() throws Exception {
		assertEquals("VI", RomanNumerals.numberToRoman(6));
		assertEquals("VII", RomanNumerals.numberToRoman(7));
		assertEquals("VIII", RomanNumerals.numberToRoman(8));
	}
	
	@Test
	public void nine() throws Exception {
		assertEquals("IX", RomanNumerals.numberToRoman(9));
	}
	
	@Test
	public void ten() throws Exception {
		assertEquals("XIX", RomanNumerals.numberToRoman(19));
	}

}
