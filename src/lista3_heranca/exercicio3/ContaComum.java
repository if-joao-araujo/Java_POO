package lista3_heranca.exercicio3;

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
    
  
	 //metodos
    
    public void adicionarSaldo(double saldo) {
        setSaldo(getSaldo() + saldo);
        System.out.println("Valor adicionado -> " + saldo);
    }
    
    public void sacar(double valor) {
        if (valor > getSaldo()) {
            System.out.println("Não foi possível sacar, pois você não tem saldo disponível!");
        } else {
            setSaldo(getSaldo() - valor);
            System.out.println("Você sacou: " + valor);
        }
    }
    
    public void visualizarSaldo() {
        System.out.println("Seu saldo é de: " + getSaldo());
    }
}
// Chave faltando estava aqui - agora a classe está completa