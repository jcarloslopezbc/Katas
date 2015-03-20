package stringCalculator;

public class StringCalculator {
	
	public int add(String string){
		if (string.length() == 0)
		return 0;
	int total = suma(string);
	return total;
	}

	private int suma(String string) {
		return suma(string.split(","));
	}

	private int suma(String[] valoresCadena) {
		int total = 0;
		for (String valor : valoresCadena) {
			total += Integer.valueOf(valor);
		}
		return total;
	}

}
