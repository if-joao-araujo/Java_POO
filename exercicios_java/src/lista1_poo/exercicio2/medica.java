package lista1_poo.exercicio2;

public class medica {
	public String codigo, nome, sexo, especialidade;
	public endereco endereco ; 
	
	public  medica (String codigo,String nome,String sexo, String especialidade, endereco endereco) {
		this.codigo = codigo;
		this.nome = nome;
		this.sexo = sexo;
		this.especialidade = especialidade;
		this.endereco = endereco;
		
		
	}

    public void exibirDados() {
        System.out.println("=== DADOS DO MÉDICO ===");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("\n=== ENDEREÇO ===");
        endereco.exibirEndereco();
        System.out.println("=======================");
    }
}


