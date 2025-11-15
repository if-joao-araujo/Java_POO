package lista1_poo.exercicio5;

public class Aluno {
	String nome;
	int cpf;
	private double [] notas = new double[4];
	
	public Aluno(String nome, int cpf) {
		this.nome = nome;
		this.cpf = cpf;
		for (int c = 0; c<4;c++) {
			this.notas[c] = 0;
		}
	}
	public void adicionarNota(double nota1,double nota2,double nota3,double nota4) {
		this.notas[0] = nota1;
		this.notas[1] = nota2;
		this.notas[2] = nota3;
		this.notas[3] = nota4;
		
	}
	public void exibirnota() {
		double somador = 0;
	    System.out.println("Notas do aluno: "+this.nome);
		for (int contador =0; contador<4;contador++) {
			somador += notas[contador];
			System.out.println("Nota da unidade {"+contador+"} -> "+this.notas[contador]);
		}
		
		System.out.println("A media de "+this.nome+" é -> "+(somador/4));
	}
	
}


