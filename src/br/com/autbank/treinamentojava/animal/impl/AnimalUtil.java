package br.com.autbank.treinamentojava.animal.impl;

import br.com.autbank.treinamentojava.animal.cachorro.Cachorro;
import br.com.autbank.treinamentojava.animal.cachorro.dt.Animal;
import br.com.autbank.treinamentojava.animal.gato.impl.Gato;

public class AnimalUtil {
	
	public static void verificaAnimal(Animal animal) {
		if(animal instanceof Cachorro) {
			System.out.println("Cachorro");
			animal.latir("Toro");
		} else if(animal instanceof Gato) {
			System.out.println("Gato");
			((Gato) animal).miar();
		} else {
			System.out.println("Objeto não pertence a nenhum dos grupos");
		}
	}
}
