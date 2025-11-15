package lista4_polimorfismo.exercicio2;
import java.util.*;
public class Principal {
	public static void main(String[] args) {
		ArrayList<Formas> formas = new ArrayList<>();
        
        // ✅ Adicionando formas diferentes na MESMA lista
        formas.add(new Circulo(5.0));
        formas.add(new Retangulo(4.0, 6.0));
  
        
        System.out.println("=== CALCULANDO TODAS AS FORMAS ===\n");
        
        // ✅ Loop único para todas as formas - POLIMORFISMO!
        for (Formas forma : formas) {
            System.out.println("Tipo: " + forma.getNome());
            System.out.printf("Área: %.2f\n", forma.calcularArea());
            System.out.printf("Perímetro: %.2f\n", forma.calcularPerimetro());
            System.out.println("-------------------");
        }
        
        // ✅ Método que recebe QUALQUER forma
        System.out.println("\n=== TOTAL GERAL ===");
        double areaTotal = calcularAreaTotal(formas);
        System.out.printf("Área total de todas as formas: %.2f\n", areaTotal);
    }
    
    // ✅ Método genérico que funciona com QUALQUER Formas
    public static double calcularAreaTotal(List<Formas> formas) {
        double total = 0;
        for (Formas forma : formas) {
            total += forma.calcularArea(); // 🎯 Polimorfismo em ação!
        }
        return total;
    }

	}

