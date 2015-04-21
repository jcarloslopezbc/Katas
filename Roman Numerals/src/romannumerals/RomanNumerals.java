package romannumerals;

public class RomanNumerals {

	public static String numberToRoman(int number) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < number; i++) {
			result.append("I");
		}
		return result.toString();
		
	}

}
