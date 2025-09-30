package arrays;
import java.util.*;
/*
Faça um programa em Java que leia 30 números em um array e imprima os números 
localizados nas posições ímpares do array.
*/
public class exercicio3 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
        int [] num = new int[10];
        
        for (int  c = 0; c<10; c++) {
        	System.out.println("Digite o numero "+c+"-> ");
        	num[c] = leitor.nextInt();       
        	}
        for (int i = 0; i<num.length;i++) {
        	 if (i % 2 != 0) {
        	System.out.println("Numeros nas posições impares: "+num[i]);
        }
        }
       leitor.close();

	}

}
