package romannumerals;

public class RomanNumerals {

	public static String numberToRoman(int number) {
		StringBuilder result = new StringBuilder();
		int remainder = number;
		remainder = collectRomanNumerals(result, remainder, 9,"IX");
		remainder = collectRomanNumerals(result, remainder, 5,"V");
		remainder = collectRomanNumerals(result, remainder, 4,"IV");
		for (int i = 0; i < remainder; i++) {
			result.append("I");
			}
		return result.toString();
	}

	private static int collectRomanNumerals(StringBuilder result,
			int remainder, int arabicNumber, String romanDigits) {
		if (remainder >= arabicNumber){
			result.append(romanDigits);
			remainder -= arabicNumber;
		}
		return remainder;
	}
	

}
