package stringCalculator;

import java.util.ArrayList;
import java.util.List;



public class StringCalculator {
	
	
	
	private String delimitador = ",|\n";
	private List<Integer> negativos = new ArrayList<Integer>();
	
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
			Integer valorNumerico = Integer.valueOf(valor);
			total += valorNumerico;
			almacenarNegativos(negativos, valorNumerico);
		}
		listaNegativos(negativos);
			
		return total;
	}

	private void listaNegativos(List<Integer> negativos) {
		if (!negativos.isEmpty())
			throw new RuntimeException("No se soportan negativos" + negativos);
	}

	private void almacenarNegativos(List<Integer> negativos,
			Integer valorNumerico) {
		if (valorNumerico < 0)
		negativos.add(valorNumerico);
	}
	

}
