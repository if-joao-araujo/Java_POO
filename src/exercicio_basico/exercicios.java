package exercicio_basico;
import java.util.*;
//Faça um programa em Java que leia do usuário dois números e calcule a soma.

public class exercicios {
	public static void main(String args[]) {
		Scanner leitor = new Scanner(System.in);
		int a,b;
		System.out.println("Digite o numero A: ");
		a = leitor.nextInt();
		System.out.println("Digite o numero B: ");
		b  = leitor.nextInt();
		System.out.println("A soma deu --> "+(a+b));
 	}

}
