package lista1_poo.exercicio3;

public class principal {
	public static void main(String[] args) {
		Lutador l1 = new Lutador("Ryo");
		
		Lutador l2 = new Lutador("bison");
		System.out.println(l1.energia);
		System.out.println(l2.energia);
		l1.atacar(l2);
		l1.atacar(l2);
		l1.atacar(l2);
		System.out.println("Vida atual de bison: "+l2.energia);
		l2.atacar(l1);
		l2.atacar(l1);
		l2.atacar(l1);
		l2.atacar(l1);
		l2.atacar(l1);
		l2.atacar(l1);
		l2.atacar(l1);
		l2.atacar(l1);
		System.out.println("Vida atual de ryo: "+l1.energia);
	}
	

}
