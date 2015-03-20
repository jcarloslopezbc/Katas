import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class StringCalculatorTest {
	
	private StringCalculator calculadora = new StringCalculator();
	
	@Test
	public void cadenaVacia(){
		
		
		assertEquals(0, calculadora.add(""));
				
	}
	
	 @Test
	 public void cadenaUnNumero(){
		 
		 assertEquals(1, calculadora.add("1"));
		 assertEquals(2, calculadora.add("2"));
	 }
	 
	 @Test
	 public void cadenaDosNumerosOMas() {
		 
		 assertEquals(3, calculadora.add("1,2"));
		 assertEquals(3, calculadora.add("1%2"));
		 assertEquals(2, calculadora.add("2,1001"));
		 assertEquals(8, calculadora.add("1,3%4"));
		 assertEquals(6, calculadora.add("1\n2,3"));
		 assertEquals(3, calculadora.add("//;\n1;2"));
		 assertEquals(5, calculadora.add("//*\n3%2"));
		 
	}
	 
	 @Test
	 public void cadenaNNumerosNDelimitadores(){
			
			assertEquals(6, calculadora.add("//;\n1,2,3"));
			
		}
	 
	  @Test
	  public void numeroNegativo(){
		  
		  try {
			  calculadora.add("1,-4,-2,3");
			  
		} catch (Exception e) {
			System.out.println(e);
		}
	  }

	
	 
	 

}
