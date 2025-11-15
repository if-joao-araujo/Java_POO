package estrutura_decisao;
import java.util.*;
//Um empresa resolveu dar um aumento de salário aos seus colaboradores
//e lhe contraram para desenvolver o programa que calculará os reajustes.
//Faça um programa em Java que recebe o salário de um colaborador e reajuste-o 
//segundo o seguinte critério:
//salários até R$ 280,00 (incluindo) : aumento de 20%
//salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
//salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
//salários de R$ 1500,00 em diante : aumento de 5%
//Após o aumento ser realizado, informe na tela:
//o salário antes do reajuste;
//o percentual de aumento aplicado;
//o valor do aumento;
//o novo salário, após o aumento.

public class exercicio4 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o salario: ");
		double salario = leitor.nextDouble();
		
		if (salario <1) {
			System.out.println("Salario invalido");
		}
		else if(salario <= 280) {
	       System.out.println("Houve um aumento de 20% no salário esse aumento foi de:"+
		(salario*0.2)+" Salario atual: "+(salario*1.2));
		}else if (salario <= 700) {
		       System.out.println("Houve um aumento de 15% no salário esse aumento foi de:"+
		    			(salario*0.15)+" Salario atual: "+(salario*1.15));
		}else if (salario <= 1500) {
		       System.out.println("Houve um aumento de 10% no salário esse aumento foi de:"+
		    			(salario*0.1)+" Salario atual: "+(salario*1.1));
		}else {
			  System.out.println("Houve um aumento de 5% no salário esse aumento foi de:"+
			  (salario*0.05)+" Salario atual: "+(salario*1.05));
		}
		
	}

}
