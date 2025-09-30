package lista3_heranca.exercicio3;


public class ContaPoupansa extends ContaComum{
	 private double taxa = 0.005;
		 public ContaPoupansa(int numconta) {
			 super(numconta);
			 this.setSaldo(5000);
			 
				}
		  protected double getTaxa() {
		    	return this.taxa;
		    	
		    }
		    protected void setTaxa(double taxa) {
		    	this.taxa = taxa;
		    }
		    public double olharRendimento(double meses) {
		    	double saldoAtual = getSaldo();
		    	double rendimento = saldoAtual * Math.pow(1 + getTaxa(), meses);
		    	return rendimento;
}
		 
		
			
		
	}




