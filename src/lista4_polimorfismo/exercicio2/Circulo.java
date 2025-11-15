package lista4_polimorfismo.exercicio2;

public class Circulo extends Formas {
	private double raio;
	public Circulo(double raio) {
		super("Circulo");
		this.raio = raio;
	}
	@Override
	public double calcularArea() {
		return Math.PI*this.raio*this.raio;
	}
	@Override
	public double calcularPerimetro() {
		
		return 2*Math.PI*this.raio;
	}
	public double getRaio() {
		return this.raio;
	}

}
