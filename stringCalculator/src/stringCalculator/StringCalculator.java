package stringCalculator;

public class StringCalculator {
	
	private String delimitador = ",|\n";
	
	public int add(String string){
		if (string.length() == 0)
		return 0;
		asignarDelimitador(string);
		String valores = string;
		valores = determinarValores(string, valores);
		
	return suma(valores.split(delimitador));
	}

	private String determinarValores(String string, String valores) {
		if (string.startsWith("//"))
			valores  = string.substring(4);
		return valores;
	}

	private void asignarDelimitador(String string) {
		if (string.startsWith("//"))
			delimitador = string.substring(2,3);
	}

	private int suma(String[] valorescadena) {
		int total = 0;
		for (String valor : valorescadena) {
			total += Integer.valueOf(valor);
		}
		return total;
	}
	

}
