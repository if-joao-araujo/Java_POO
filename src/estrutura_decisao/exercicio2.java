package estrutura_decisao;
//Faça um algoritmo que leia o número de um canal de televisão e escreva o nome da 
//emissora correspondente. Caso o usuário forneça um canal sem emissora exibir a 
//mensagem “Canal inválido”. Considere as seguintes emissoras e seus respectivos 
//canais: 2=SBT, 4=BAND, 6=RedeTV!, 9=Record, 13=Globo.
import java.util.*;
public class exercicio2 {
	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in); 
	System.out.println("Digite o canal: ");
	int canal = leitor.nextInt();
	
	if (canal == 2) {
		System.out.println("Canal escolhido -> SBT");
	}
	else if (canal == 4) {
		System.out.println("Canal escolhido -> BAND");
	}
	else if (canal == 6) {
		System.out.println("Canal escolhido -> REDE TV");
	}
	else if (canal == 9) {
		System.out.println("Canal escolhido -> RECORD");
	}
	else if (canal == 13) {
		System.out.println("Canal escolhido -> GLOBO");
	}
	else {
		System.out.println("CANAL INVALIDO");
	}
	}
}
