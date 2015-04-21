package romannumerals;

import static org.junit.Assert.assertEquals;
import junit.framework.Assert;

import org.junit.Test;

public class RomanNumeralsTest {
	
	@Test
	public void one(){
		assertEquals("I", RomanNumerals.numberToRoman(1));
	}

}
