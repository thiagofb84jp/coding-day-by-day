package oo.heranca.desafio;

import oo.heranca.Esportivo;

public class Ferrari extends Carro implements Esportivo{

	public Ferrari() {
		this(315);
	}

	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 350;
	}

	@Override
	public void ligarTurbo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desligarTurbo() {
		// TODO Auto-generated method stub
		
	}

}