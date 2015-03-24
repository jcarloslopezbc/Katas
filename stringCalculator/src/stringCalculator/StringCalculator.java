package stringCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;


public class StringCalculator {
	
	private int inicio = 2;
	private int fin = 3;
	private int inicioValores = 4;
	
	private String delimitador = ",|\n|\\*";
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
			valores  = string.substring(inicioValores);
			
		return valores;
	}

	private void asignarDelimitador(String string) {
		String p = null;
		String delimitadorIncremental = null;
		
		if (string.startsWith("//")){
			delimitador = string.substring(inicio,fin);
			delimitadorIncremental = delimitador;
			delimitadorIncremental = delimitadorIncremental(string,delimitadorIncremental);
		delimitador = delimitadorIncremental;
		}
		
		if(delimitador.equals("*"))
			delimitador = "\\" + delimitador; 
	}

	private String delimitadorIncremental(String string,String delimitadorIncremental) {
			String p;
			do{
				p = string.substring(inicio+1,fin+1);
				delimitadorIncremental = condicionDelimitador(delimitadorIncremental, p);
			}while (delimitador.equals(p));
		return delimitadorIncremental;
	}

	private String condicionDelimitador(String delimitadorIncremental, String p) {
		if (delimitador.equals(p)){
			delimitadorIncremental = delimitadorIncremental + delimitador;
			System.out.println(delimitadorIncremental);
			inicioValores++;
			inicio++;
			fin++;
		}
		return delimitadorIncremental;
	}

	private int suma(String[] valorescadena) {
		int total = 0;
		total = sumaValidacionesNegativos(valorescadena, total);
		listaNegativos(negativos);
		return total;
	}

	private int sumaValidacionesNegativos(String[] valorescadena, int total) {
		for (String valor : valorescadena) {
			Integer valorNumerico = Integer.valueOf(valor);
			total = sumaTotal(total, valorNumerico);
			almacenarNegativos(negativos, valorNumerico);
		}
		return total;
	}

	private int sumaTotal(int total, Integer valorNumerico) {
		total += valorNumerico;
		if (valorNumerico > 1000)
			total -= valorNumerico;
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
