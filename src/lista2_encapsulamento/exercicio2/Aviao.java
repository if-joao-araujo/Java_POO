package lista2_encapsulamento.exercicio2;
/*
Você foi contratado para desenvolver um game de simulador de vôo. 
Modele a classe “Avião” usando os conceitos de abstração e
encapsulamento.Após modelar a classe siga os seguintes passos:
1 Instanciar um objeto Avião com altitude inicial 10 Km e velocidade 
2 900 Km/h
3 Mostrar na tela a altitude e velocidade atual do avião
4 Reduzir a altitude do avião em 1Km
5 Reduzir a velocidade do avião em 100 Km/h
6 Mostrar na tela a altitude e velocidade atual do avião
7 Reduzir a altitude do avião em 10Km
8 Reduzir a velocidade do avião em 200 Km/h
9 Mostrar na tela a altitude e velocidade atual do avião
*/
public class Aviao {
	private int velocidade;
	private double altitude;
	
	public Aviao() {
		this.altitude = 10;
		this.velocidade = 900;
	}//geters e seters
	private void setVelocidade(int velo) {
		this.velocidade = velo;
	}
	private int getVelocidade() {
		return this.velocidade;
	}
	private void SetAltitude(double alt) {
		this.altitude = alt;
	}
	private double getAltitude() {
		return this.altitude;
	}//metodos
	
	public void aumentarVelocidade(int velo) {
		setVelocidade(getVelocidade()+velo);
		System.out.println(" Velocidade aumentada em "+velo+"km/h");
	}
	
	public void diminuirVelocidade(int velo) {
		if (getVelocidade()<0) {
			System.out.println("Não dá para diminuir a velocidade, pois o avião está em\n"
					+"velocidade minima");
		}else {
			setVelocidade(getVelocidade() - velo);
			System.out.println(" Velocidade diminuida em "+velo+"km/h");
		}
   }

	public void aumentarAltitude(double alt) {
		SetAltitude(getAltitude()+ alt);
		System.out.println("Altitude aumentada em "+alt+"KM");
	}
	
	public void diminuirAltitude(double alt) {
		if (getVelocidade()<0) {
			System.out.println("Não dá para diminuir a velocidade, pois o avião está em\n"
					+"velocidade minima");
		}else {
			SetAltitude(getAltitude()-alt);
			System.out.println(" Altitude diminuida em "+alt+"KM");
		}
	}

	public void status() {
		System.out.println("====================================");
		System.out.println("Velocidade atual: "+getVelocidade());
		System.out.println("Altitude atual: "+getAltitude());
		
	}
	

}
