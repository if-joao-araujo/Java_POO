package lista1_poo.exercicio1;
/*Você foi contratado para implementar um sistema de clínica médica, crie uma classe 
 * “Paciente” com os atributos e o construtor descritos e depois realize os passos definidos
 *  a seguir:
ATRIBUTOS: 
codigo, nome, dataNascimento, sexo, planoSaude, alergia, tipoSanguineo.

CONSTRUTOR: 
Deve receber os parâmetros para iniciar os atributos: codigo, nome, dataNascimento, sexo, planoSaude, alergia, tipoSanguineo.

PASSOS: 
Instanciar um objeto paciente com o seu nome, data de nascimento, sexo, alergia (caso você tenha) e tipo sanguíneo. 
Imprimir cada um dos dados do objeto (acessando os atributos). 
Modificar cada um dos dados do objeto com os valores correspondentes aos dados da sua mãe ou seu pai (modificando os atributos). 
Imprimir dados do objeto novamente.
*/
public class paciente {
	String codigo,nome,data_nascimento,sexo,plano_saude,alergia,tipo_saguineo;
	
	public paciente(String codigo,String nome,String data,String sexo,
			String plano_saude,String alergia,String tipo_saguineo) {
		this.codigo = codigo;
		this.nome = nome;
		this.data_nascimento = data;
		this.sexo = sexo;
		this.plano_saude = plano_saude;
		this.tipo_saguineo = tipo_saguineo;
		
		
	}
	
	
	

}
