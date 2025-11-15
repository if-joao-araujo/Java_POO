package lista4_polimorfismo.exercicio1;

public class Gato extends Animal{

	public Gato(String n) {
		super(n);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void fazerSom() {
		System.out.println("MIAU MIAU ");
	}

}
