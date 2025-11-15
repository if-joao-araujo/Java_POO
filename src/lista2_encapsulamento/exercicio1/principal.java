package lista2_encapsulamento.exercicio1;

public class principal {
	public static void main(String[] args) {
	Paciente joao = new Paciente("231","João pedro","04/01/2000","M","A+");	
	
	joao.dadosPaciente();
	joao.setPlano("SUS");
	joao.setAlergia("Rinite");
	joao.dadosPaciente();
	

	}

}

