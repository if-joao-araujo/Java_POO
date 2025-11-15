package arrays;
import java.util.*;
/*Faça um programa em Java que leia um array de 10 números
reais e mostre-os na ordem inversa.*/
public class exercicio2 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
        int [] num = new int[10];
        
        for (int c = 0; c <10; c++) {
        	System.out.println("Digite o numero {"+c+"} ->");
        	num[c] = leitor.nextInt();
        }

        for (int c = 9; c >-1; c-=1) {
        	System.out.println(num[c]);
        	
        }
	}
}
