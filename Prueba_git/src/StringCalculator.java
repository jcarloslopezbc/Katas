import java.util.ArrayList;
import java.util.List;

public class StringCalculator {

	private String delimitador = ";|,|%|\n|\\*";
	private List<Integer> negativos = new ArrayList<Integer>();
	
	
	public int add(String string){
		if (string.length() == 0)
			return 0;
		delimitador = inicioCon(string, delimitador);		
		String valores = string;
		valores = inicioCon2(string, valores);
		return suma(valores.split(delimitador));
	}
	
	private String inicioCon(String string, String delimitador) {
		if (string.startsWith("//"))
			delimitador += string.substring(2,3);
		return delimitador;
	}

	private String inicioCon2(String string, String valores) {
		if (string.startsWith("//"))
			valores = string.substring(4);
		return valores;
	}

	private int suma(String[] valores) {
		int total = 0;
		total = clicloSuma(valores, total, negativos);
		listaNegativos(negativos);
	
		
		return total;
	}

	private void listaNegativos(List<Integer> negativos) {
		if(!negativos.isEmpty()){
			throw new RuntimeException("No se soportan negativos" + negativos);
		}
	}

	private int clicloSuma(String[] valores, int total, List<Integer> negativos) {
		for (String valor : valores) {
			Integer valorEntero = Integer.valueOf(valor);
			total += valorEntero;
			numerosNegativos(negativos, valorEntero);
			total = numeroMayorMilUno(total, valorEntero);
		}
		return total;
	}

	private int numeroMayorMilUno(int total, Integer valorEntero) {
		if (valorEntero > 1000)
			total -= valorEntero;
		return total;
	}

	private void numerosNegativos(List<Integer> negativos, Integer valorEntero) {
		if( valorEntero < 0){
			negativos.add(valorEntero);
		}
	}

	
}
