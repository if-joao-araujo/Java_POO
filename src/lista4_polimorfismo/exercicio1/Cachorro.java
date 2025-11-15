package lista4_polimorfismo.exercicio1;

public class Cachorro extends Animal {
	public Cachorro(String n) {
		super(n);
		
	}

	@Override
	public  void fazerSom() {
		System.out.println("AU AU AU");
		
	};

}
