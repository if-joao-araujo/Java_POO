package lista1_poo.exercicio3;

public class Lutador {
	String nome;
	int energia, forca;
	
	public Lutador(String nome) {
		this.nome = nome;
		this.energia = 100;
		this.forca = 10;
		if (this.nome.equals("bison")) {
			this.forca = 12;
		}
	};
	public void atacar(Lutador inimigo) {
		inimigo.energia -= forca;
		 System.out.println(nome + " atacou " + 
		inimigo.nome + " causando " + forca + " de dano!");
	}
}


