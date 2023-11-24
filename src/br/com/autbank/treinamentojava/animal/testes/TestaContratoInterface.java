package br.com.autbank.treinamentojava.animal.testes;

import br.com.autbank.treinamentojava.animal.cachorro.dt.Animal;
import br.com.autbank.treinamentojava.animal.gato.impl.Siames;

public class TestaContratoInterface {
	
	public static void testaAnimal(Animal animal) {
		animal.comer("vilma");
		animal.dormir("vilma");
		animal.latir("vilma");
	}
	
	public static void main(String[] args) {
		Animal gato = new Siames();
		
		testaAnimal(gato);
	}
}
