package br.com.autbank.treinamentojava.animal.testes;

import br.com.autbank.treinamentojava.animal.cachorro.Labrador;
import br.com.autbank.treinamentojava.animal.cachorro.dt.Animal;
import br.com.autbank.treinamentojava.animal.gato.impl.Siames;
import br.com.autbank.treinamentojava.animal.impl.AnimalUtil;

public class TestePolimorfismo {

	public static void main(String[] args) throws Exception {
		Animal a = new Siames();
		
		//métodos acessíveis através da variável de referência Animal
		a.comer("Lara");
		a.dormir("Lara");
		a.latir("Lara");
		
		AnimalUtil.verificaAnimal(a);
	
		a = new Labrador();
		
		//métodos acessíveis através da variável de referência Animal
		a.comer("Maite");
		a.dormir("Maite");
		a.latir("Maite");
		
		AnimalUtil.verificaAnimal(a);
	}

}
