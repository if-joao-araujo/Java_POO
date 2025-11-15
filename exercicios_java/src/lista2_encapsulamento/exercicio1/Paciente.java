package lista2_encapsulamento.exercicio1;
//Faça novamente a questão 1 do exercício de fixação da aula anterior,
//dessa vez usado o conceito de encapsulamento.

public class Paciente {
	public String nome,data_nascimento,sexo,codigo,tipo_saguineo;
	private String plano_saude,alergia;
	
	public Paciente(String codigo,String nome,String data,
			String sexo,
			String tipo_saguineo) {
		this.codigo = codigo;
		this.nome = nome;
		this.data_nascimento = data;
		this.sexo = sexo;
		this.tipo_saguineo = tipo_saguineo;
		
		
	}
	public void setPlano(String n) {
		this.plano_saude = n;
	}
	private String getPlano() {
		return this.plano_saude;
	}
	
	public void setAlergia(String n) {
		this.alergia = n;
	}
	private String getAlergia() {
		return this.alergia;
	}
	
	public void dadosPaciente() {
		System.out.println("=====================================");
		System.out.println(" Ficha do paciente: ");
		System.out.println("\n Codigo: "+this.codigo+
				" \n Nome do paciente: "+this.nome+
				" \n Data de nascimento: "+this.data_nascimento+
				" \n Sexo: "+this.sexo+
				" \n Plano de saúde: "+getPlano()+
				" \n Tipo sanguineo: "+this.tipo_saguineo+
				" \n Alergia: "+getAlergia());
	}
	

}

