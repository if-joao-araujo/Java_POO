package estrutura_decisao;
import java.util.*;
//Os ingressos de um cinema custam X reais. Na terça-feira há um desconto de 50% 
//e em qualquer dia menores de 14 anos também tem desconto de 50%. Os descontos são 
//cumulativos. Faça um programa em Java que leia do usuário o dia da semana, a idade 
//do espectador e o preço base do ingresso e escreva o valor a pagar. Considere que 1 
//é domingo, 2 é segunda, etc. 

public class exercicio3 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o preço do ingresso:");
		double preco_ingresso = leitor.nextDouble();
		System.out.println("Digite a idade:");
		int idade = leitor.nextInt();
		System.out.println("Digite o dia da semana: \n"
+ "1: domingo | 2: Segunda| 3: Terça | 4: quarta | 5: Quinta | 6: Sexta | Sabádo ");
		int dia_semana = leitor.nextInt();
		
		if(dia_semana == 3 || idade == 14) {
			System.out.println("Você tem 50% de desconto, então o preço do ingresso ficará:"
					+(preco_ingresso/2));
			
		}
		else {
			System.out.println("Você pagará o ingresso inteiro: "+preco_ingresso);
		}
		
	}

}
