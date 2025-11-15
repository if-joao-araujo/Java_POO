package exercicio_basico;
import java.util.*;
//Tendo como dados de entrada a altura de uma pessoa, construa um 
//programa em Java que calcule seu peso ideal, usando a seguinte fórmula: 
//(72.7*altura) – 58.

public class exercicio4_e_5 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite sua altura: ");
		double a = leitor.nextDouble();
		double peso_ideal = (72.78*a) - 58;
		System.out.println("Seu peso ideal é: "+peso_ideal);
	}

}
