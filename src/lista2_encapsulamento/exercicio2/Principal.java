package lista2_encapsulamento.exercicio2;

public class Principal {
	public static void main(String[] args) {
		Aviao aviao = new Aviao();
		
		aviao.status();
		aviao.diminuirAltitude(1);
		aviao.diminuirVelocidade(100);
		aviao.status();
		aviao.diminuirAltitude(10);
		aviao.diminuirVelocidade(200);
		aviao.status();
		
	}

}
