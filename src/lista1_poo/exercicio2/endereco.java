package lista1_poo.exercicio2;

public class endereco {
	public String rua,  complemento, bairro, cidade, uf;
	public int numero,cep;

	
	public endereco( String rua,int numero,String complemento,String bairro,
			String cidade,String uf,int cep ) {
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;	
	}
	public void exibirEndereco() {
		System.out.println(" Rua:"+this.rua+
				            " Numero: "+this.numero+
				            " complemento "+this.complemento+
				            " Bairro: "+this.bairro+
				            " Cidade: "+this.cidade
				            +" Uf: "+this.uf
				            +" CEP: "+this.cep);
	}
	

}
