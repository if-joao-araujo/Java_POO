package lista3_heranca.exercicio2;

public class Principal {
	public static void main(String[] args) {
		
	
	ContaCorrente contac = new ContaCorrente(201);
	contac.virsualizarSaldo();
	contac.adicionarSaldo(500);
	contac.virsualizarSaldo();
	
	ContaPoupansa contap = new ContaPoupansa(205);
	System.out.println("Rendimento: "+contap.olharRendimento(3));

	}
}
