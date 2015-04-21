package romannumerals;

public class RomanNumerals {

	private static int[] VALUES = {20, 10,9, 5, 4 };
	private static String[] SYMBOLS = {"XX","X", "IX", "V", "IV"};
	
	public static String numberToRoman(int number) {
		StringBuilder result = new StringBuilder();
		int remainder = number;
		for (int i = 0; i < VALUES.length; i++) {
			remainder = collectRomanNumerals(result, remainder, VALUES[i],SYMBOLS[i]);	
		}
		for (int i = 0; i < remainder; i++) {
			result.append("I");
			}
		return result.toString();
	}

	private static int collectRomanNumerals(StringBuilder result,int remainder, int arabicNumber, String romanDigits) {
		if (remainder >= arabicNumber){
			result.append(romanDigits);
			remainder -= arabicNumber;
		}
		return remainder;
	}
	

}
