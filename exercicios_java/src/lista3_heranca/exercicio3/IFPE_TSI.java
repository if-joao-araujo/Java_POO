package lista3_heranca.exercicio3;

public class IFPE_TSI {public static void main(String[] args) {

	    boolean metasAlcancadas = false;
	    int totalMetas = 5;
	    int concluidas = 0;
	    while (!metasAlcancadas) {
	          definirFoco();
	          executar();
	          alcancar();
	          concluidas++;

	          if (concluidas == totalMetas) {
	              metasAlcancadas = true;
	            }
	        }
	    System.out.println("🎯 " + concluidas + " metas alcançadas! 🚀");
	    }
	    static void definirFoco() { }
	    static void executar()    { }
	    static void alcancar()    { }
}
