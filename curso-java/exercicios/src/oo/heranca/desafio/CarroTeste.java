package oo.heranca.desafio;

public class CarroTeste {

	public static void main(String[] args) {
		Carro c1 = new Civic();
		System.out.println("/************** CIVIC **************/");
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);

		Carro c2 = new Ferrari(400);
		System.out.println("\n/************** FERRARI **************/");
		
		c2.acelerar();
		c2.frear();
		System.out.println(c2);
		
		c2.acelerar();
		c2.frear();
		System.out.println(c2);
		
		c2.acelerar();
		System.out.println(c2);
	}
}