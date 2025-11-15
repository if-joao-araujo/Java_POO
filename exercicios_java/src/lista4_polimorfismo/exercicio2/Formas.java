package lista4_polimorfismo.exercicio2;

public abstract  class Formas {
	private String nome;
	public Formas(String n) {
		this.nome = n;
		
	}
    public abstract double calcularArea();
    
    public abstract double calcularPerimetro();
    
	public String getNome() {
		return this.nome;
	}
		
	
	

}
