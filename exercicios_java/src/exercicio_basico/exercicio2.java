package exercicio_basico;

//Faça um programa em Java que leia do usuário as 4 notas de um aluno e calcule a média.
import java.util.*;

public class exercicio2 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double soma= 0;
		int contador = 0;
		
		for (int c = 1 ; c <=4; c ++) {
			System.out.println("Digite o numero ("+contador+") --> ");
			double nota = leitor.nextDouble();
			soma += nota;
			contador ++;
			
		}
		double media = soma/ (double)contador;
		
		System.out.println("A média é igual a: "+ media);
		
	}

}
