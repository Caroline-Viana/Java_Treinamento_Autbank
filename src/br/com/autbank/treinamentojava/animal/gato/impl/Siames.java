package br.com.autbank.treinamentojava.animal.gato.impl;

import br.com.autbank.treinamentojava.animal.cachorro.dt.Animal;

public class Siames extends Gato implements Animal{

	@Override
	public void latir(String nome) {
		System.out.println(nome + " est� latindo!");
		
	}

	@Override
	public void comer(String nome) {
		System.out.println(nome + " est� comendo!");
		
	}

	@Override
	public void dormir(String nome) {
		System.out.println(nome + " est� dormindo!");
		
	}
	
	@Override
	public void miar() {
		System.out.println("O gato est� miando");
	}

}
