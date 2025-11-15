package lista4_polimorfismo.exercicio2;

public class Retangulo extends Formas{
	private double base;
	private double altura;
	public Retangulo(double base,double area) {
		super("retangulo");
		this.base = base;
		this.altura = area;
	}
	@Override
	public double calcularArea() {
		return this.base*this.altura;
	}
	@Override
	public double calcularPerimetro() {
		
		return this.base*3;
	}
	public double getAltura() {
		return this.altura;
	}
		public double getBase() {
			return this.base;
	}


}
