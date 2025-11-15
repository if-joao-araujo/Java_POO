package lista4_polimorfismo.exercicio1;

public abstract class Animal {
	String nome;
	
	public Animal (String n) {
		this.nome = n;
	}
	public abstract void fazerSom();
	
	public void dormir() {
		System.out.println(this.nome+" está dormindo");
	}

}
