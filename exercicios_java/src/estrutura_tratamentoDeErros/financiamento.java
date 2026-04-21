package estrutura_tratamentoDeErros;
import java.util.*;
public class financiamento {
	public static void main(String[] args) {
	    Scanner leitor = new Scanner(System.in);
	   
	    try {
	    System.out.println("Digite um numero: ");
	    float num1 = leitor.nextFloat();
	    System.out.println("Digite ou numero: ");
	    float num2 = leitor.nextFloat();
	    if (Math.abs(num2) < 0.000001f) {  // Praticamente zero
	        throw new ArithmeticException("Divisão por zero!");
	    }else {
	    System.out.println("valor digitado: "+(num1/num2));	
	    }
	    }catch (Exception e) {
			System.out.println("Erro!! digite numeros validos");	
			 
		}finally {
			leitor.close();
		}
	   
	    }
		
	}


