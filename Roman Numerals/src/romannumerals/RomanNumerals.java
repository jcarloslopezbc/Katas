package romannumerals;

public class RomanNumerals {

	public static String numberToRoman(int number) {
		StringBuilder result = new StringBuilder();
		int remainder = 0;
		remainder = number;
		if (remainder >= 5){
			result.append("V");
			remainder -= 5;
		}
		if (remainder == 4) {
			result.append("IV");
			remainder -= 4;
		}
		for (int i = 0; i < remainder; i++) {
			result.append("I");
			}
		return result.toString();
	}
	

}
