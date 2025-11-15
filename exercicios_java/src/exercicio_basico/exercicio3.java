package exercicio_basico;
import java.util.*;
//Faça um programa em Java que leia do usuário quanto ele ganha por hora e o 
//número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no
//referido mês.


public class exercicio3 {
	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	
	System.out.println("Você ganha quanto por hora? ");
	double valor_horas = leitor.nextDouble();
	System.out.println("Você trabalha quantas horas no mẽs? ");
	double horas_mensais = leitor.nextDouble();
	
	System.out.println("Seu salario é de --> "+(valor_horas*horas_mensais));
	}

}
