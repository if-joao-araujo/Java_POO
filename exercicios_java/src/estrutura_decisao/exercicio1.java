package estrutura_decisao;
import java.util.*;

//Faça um programa em Java que peça dois números e imprima o maior deles.

public class exercicio1 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o numero A: ");
		double a = leitor.nextDouble();
		System.out.println("Digite o numero B: ");
		double b = leitor.nextDouble();
		
		if (a>b) {
			System.out.println("O numero "+a+" é maior que o numero "+b);
		}else if(b>a) {
			System.out.println("O numero "+b+" é maior que o numero "+a);
		}
		else {
			System.out.println("Ambos numeros são iguais");
		}
		
		
	}

}
