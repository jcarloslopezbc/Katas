package romannumerals;

public class RomanNumerals {

	public static String numberToRoman(int number) {
		StringBuilder result = new StringBuilder();
		if (number == 5){
			result.append("V");
		} else if (number == 4) {
			return "IV";
		} else{
			for (int i = 0; i < number; i++) {
			result.append("I");
			}
		}
		return result.toString();
	}
	

}
