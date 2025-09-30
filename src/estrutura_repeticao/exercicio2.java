package estrutura_repeticao;
import java.util.*;

/*Faça um algoritmo para que um usuário tente acertar um
número informado por outro usuário.
*Inicialmente um usuário fornece um número para o algoritmo,
depois o outro usuário deve informar
* números ao algoritmo até acertar (obviamente o segundo
* usuário não deve ver o número informado
* pelo primeiro). Para ajudar, a cada tentativa o computador
deve exibir as seguintes mensagens:
* “Seu número é maior do que o meu” ou “Seu número é menor
do que o meu”. Ao acertar imprima
* quantas tentativas foram necessárias.
*/
public class exercicio2 {
	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	System.out.println("Digite um numero para ser adivinhado:");
	int num = leitor.nextInt();
	int tentativas = 0;
	while (true) {
	System.out.println("chute o numero correto:");
	int num_correto = leitor.nextInt();
	if (num_correto > num) {
	System.out.println("Seu numero é maior que o numero correto!");
	tentativas +=1;

	}else if (num_correto < num) {
	System.out.println("Seu numero é menor que o numero correto!");
	tentativas +=1;
	}else {
	System.out.println("Parabéns! você acertou!!! Quantidades detentativas -> "+tentativas);
	break;
	
	}

  }
	leitor.close();}
	
}


