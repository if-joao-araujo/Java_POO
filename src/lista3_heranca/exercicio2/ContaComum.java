package lista3_heranca.exercicio2;

public class ContaComum {
	private int numConta;
	private double saldo;
	
	public ContaComum(int numConta) {
		this.numConta = numConta;
		
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;	
	}
	public void adicionarSaldo(double saldo) {
		setSaldo(getSaldo()+saldo);
		System.out.println("Valor adicionado -> "+saldo);
	}
	public void sacar(double saldo) {
		if (saldo > getSaldo()) {
			System.out.println("Não foi possivel sacar, poís você não tem saldo disponivel!");
		}else {
			setSaldo(getSaldo()-saldo);
			System.out.println("Você sacou: "+saldo);
		}
	}
		
	public void virsualizarSaldo(){
		System.out.println("Seu saldo é de: "+getSaldo());
	}
	

}
