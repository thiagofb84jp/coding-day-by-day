package oo.composicao;

public class Motor {

	Carro carro;
	
	boolean ligado = false;
	
	double fatorInjecao = 1;

	//Passando dessa forma, há uma relação bidirecional entre carro e motor
	Motor(Carro carro){
		this.carro = carro;
	}
	
	int giros() {
		if (!ligado) {
			return 0;
		}
		
		return (int) Math.round(fatorInjecao * 3000);
	}
}