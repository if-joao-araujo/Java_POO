package lista1_poo.exercicio1;

public class principal {
	public static void main(String[] args) {
		paciente paciente = new paciente("123","João pedro","04/01/2005","M","SUS","rinite","A+");
		System.out.println("Dados do paciente: "+" Codigo: "+paciente.codigo+" Nome: "+paciente.nome+
				" Data de nascimento: "+paciente.data_nascimento+" sexo: "+paciente.sexo+" plano de saude:"+
				paciente.plano_saude+" Alergia: "+paciente.alergia+" tipo saguineo"+paciente.tipo_saguineo);
	}

}
