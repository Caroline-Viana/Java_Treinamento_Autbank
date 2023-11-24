package br.com.autbank.treinamentojava.animal.gato.impl;

import br.com.autbank.treinamentojava.animal.cachorro.dt.Animal;

public class Siames extends Gato implements Animal{

	@Override
	public void latir(String nome) {
		System.out.println(nome + " está latindo!");
		
	}

	@Override
	public void comer(String nome) {
		System.out.println(nome + " está comendo!");
		
	}

	@Override
	public void dormir(String nome) {
		System.out.println(nome + " está dormindo!");
		
	}
	
	@Override
	public void miar() {
		System.out.println("O gato está miando");
	}

}
