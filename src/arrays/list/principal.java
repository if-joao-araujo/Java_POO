package arrays.list;

import java.util.ArrayList;

public class principal {
	public static void main(String[] args) {
		String[] ArrayEstatico = new String[5];
		ArrayEstatico[0] = "pedro";
		ArrayEstatico[1] = "maria";
		ArrayEstatico[2] = "joao";
		ArrayEstatico[3] = "fulano";
		ArrayEstatico[4] = "gui";
		
		//arraylist
		ArrayList<String > arraydinamico = new ArrayList<String>();
		arraydinamico.add("goku"); //facilita adicionar elementos na lista 
		arraydinamico.add("Vegeta");
		arraydinamico.add("fernando");
		
		//mostrar arraystatico
		System.out.println("Mostrando o Array estatico:");
		for (int indice = 0; indice < ArrayEstatico.length; indice++) {
			System.out.println(ArrayEstatico[indice]);
		}
		// mostrar arrayDinamico
		System.out.println("Mostrando o Array dinamico:");
        System.out.println("Tamanho do arraylist: "+arraydinamico.size()); // usamos o size em vez do leight
		for (int indice = 0; indice < arraydinamico.size(); indice++) {
			System.out.println(arraydinamico.get(indice)); // usamos o get para pegar a posição
			//Para acessar a ultima posição, basta fazer tamanho - 1, ou seja
			// int ultimaP = array.size - 1,  array.get(ultimaP)
		}
		// para remover usamos o remove
		System.out.println("Removendo o fernando:");
		arraydinamico.remove(2);
		System.out.println(arraydinamico);
		// para limpar o array usamos o .clear
		arraydinamico.clear();
		System.out.println(arraydinamico);
	
	 /* arrayList de tipos primitivos, usamos wraper class
	  * int -> Intenger
	  * float -> Float
	  * Double -> Double
	  * Ex:
     */
	ArrayList<Integer> numero = new ArrayList<Integer>();
	numero.add(5);
    
	}
}
