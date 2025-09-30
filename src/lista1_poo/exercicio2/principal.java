package lista1_poo.exercicio2;

public class principal {
	public static void main(String[] args) {

		endereco endMedico = new endereco( "Rua das Flores", 
	            123, "casa"
	            , 
	            "Centro", 
	            "São Paulo", 
	            "SP", 
	            01234567);
		medica medico = new medica( "101", 
            "Dr. João Silva", 
            "M", 
            "Cardiologia",endMedico);
		System.out.println("Exibindo dados do sistema da clinica:");
		medico.exibirDados();
		
	}

}
