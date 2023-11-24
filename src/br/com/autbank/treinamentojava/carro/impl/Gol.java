package br.com.autbank.treinamentojava.carro.impl;

public class Gol extends Carro{

	public Gol(String cor, int ano, double kilometragem) {
		super(cor, ano, kilometragem);
	}
	
	public void abrirVidros() {
		System.out.println("Vidros abertos");
	}

}
