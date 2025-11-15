package lista3_heranca.exercicio2;

public class ContaPoupansa extends ContaComum{
	 public ContaPoupansa(int numconta) {
		 super(numconta);
		 this.setSaldo(5000);
		 
			}
	 public double olharRendimento(double meses) {
		 double saldoAtual = getSaldo();
		 double rendimento = 0;
		 for (int c = 1; c<=meses;c++) {
			double rendimentoMensal = (saldoAtual*0.05) ;
			rendimento += rendimentoMensal;
			saldoAtual += rendimentoMensal;
		 }
	 return rendimento;
		
	} 
}

