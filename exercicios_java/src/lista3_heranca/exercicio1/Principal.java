package lista3_heranca.exercicio1;

public class Principal {
	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro("Bob");
		Gato gato = new Gato("Kit");
		
		cachorro.beber();
		cachorro.latir();
		gato.comer();
		
	}

}
