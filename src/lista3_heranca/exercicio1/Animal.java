package lista3_heranca.exercicio1;

public class Animal {
	private String nome;
	
	public Animal(String nome) {
		this.nome = nome;
	}
	public void comer() {
		System.out.println(this.nome+" comeu ");
	}
	public void beber() {
		System.out.println(this.nome+" bebeu ");
	}
	public String getNome() {
		return this.nome;
	}


}
