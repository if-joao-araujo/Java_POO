package arrays;
import java.util.*;

//Faça um programa em Java que leia um array de 5 números inteiros e mostre-os.


public class exercicio1 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int[] num = new int[5];
		
		for (int c = 0;c <5;c++) {
			System.out.println("Digite o numero: "+c);
			num[c] = leitor.nextInt();
		}
		System.out.println("Numeros digitados: ");
		for (int c = 0; c<5; c++) {
		System.out.println(num[c]);
	}
		leitor.close();
	}
}
