package estrutura_repeticao;
import java.util.*;

//Faça um algoritmo que calcule e exiba a nota de um aluno em uma prova 
//de 10 questões. Para calcular a nota do aluno deve-se ler do usuário a resposta 
//de cada uma das 10 questões e comparar com o gabarito abaixo.
//01 - A 02 – B 03 - C 04 - D 05 - E 06 - E 07 - D 08 - C 09 - B 10 - A

public class exercicio1 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int contador = 0;
		int acertos = 0;
		String[] gabarito = {"A","B","C","D","E","E","D","C","B","A"};
	
		for (int c = 0; c<10; c+=1) {
			System.out.println("Digite a resposta -> "+contador);
			String resposta = leitor.next().toUpperCase();;
			if (resposta.equals(gabarito[contador])) {
			acertos +=1;	
			}
			contador +=1;
		}
       System.out.println("Total de acertos: "+acertos+
    		   " Gabarito oficial: "+Arrays.toString(gabarito));
       leitor.close();
	}
}
