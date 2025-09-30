package lista3_heranca.exercicio3;

public class Principal  {
	public static void main(String[] args) {
		ContaTesouroDireto contaT = new ContaTesouroDireto(241);
		ContaPoupansa contaP = new ContaPoupansa(321);
		
		contaT.adicionarSaldo(10000);
		contaP.adicionarSaldo(10000);
		contaT.adicionarSaldo(500);
		contaP.adicionarSaldo(500);
		
		
		System.out.println("Rendimento: "+contaP.olharRendimento(4));
		System.out.println("Rendimento: "+contaT.olharRendimento(4));
		
		
	}

}
