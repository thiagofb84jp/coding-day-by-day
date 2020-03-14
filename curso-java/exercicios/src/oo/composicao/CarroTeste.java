package oo.composicao;

public class CarroTeste {
	
	public static void main(String[] args) {
		/**
		 * Pontos Importantes: 
		 * 1. Inicialmente foi criada uma rela��o unidirecional (Um carro possui um motor);
		 * 2. Use as rela��es bidirecionais APENAS se forem necess�rias;
		 */
		Carro c1 = new Carro();
		System.out.println(c1.estahLigado()); //false
		
		c1.ligar();
		System.out.println(c1.estahLigado()); //true
		
		System.out.println(c1.motor.giros());
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		System.out.println(c1.motor.giros());
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		
		//Faltou encapsulamento!
		//c1.motor.fatorInjecao = -30;
		
		System.out.println(c1.motor.giros());
		
		//Rela��o bidirecional
		System.out.println(c1.motor.carro.motor.carro.motor.giros());
	}
}