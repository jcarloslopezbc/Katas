package stringCalculator;

public class StringCalculator {
	
	
	
	public int add(String string){
		if (string.length() == 0)
		return 0;
		String delimitador = ",|\n";
		if (string.startsWith("//"))
			delimitador = string.substring(2,3);
		String valores = string;
		if (string.startsWith("//"))
			valores  = string.substring(4);
		
	return suma(valores.split(delimitador));
	}

	private int suma(String[] valorescadena) {
		int total = 0;
		for (String valor : valorescadena) {
			total += Integer.valueOf(valor);
		}
		return total;
	}
	

}
