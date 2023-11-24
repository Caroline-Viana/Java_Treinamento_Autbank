package br.com.autbank.treinamentojava.carro.impl;

public class CarroUtil {

	public static void verificaCarro(Carro car) {
		if(car instanceof Toro) {
			System.out.println("Esse carro é um Toro");
			((Toro) car).ligarSom();
		}else if(car instanceof Gol) {
			System.out.println("Esse carro é um Gol");
			((Gol) car).abrirVidros();
		}else {
			System.out.println("Esse carro é de outro modelo");
		}
	}
}
