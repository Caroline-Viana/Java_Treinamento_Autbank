package br.com.autbank.treinamentojava.testes;

import br.com.autbank.treinamentojava.animal.cachorro.Cachorro;
import br.com.autbank.treinamentojava.animal.cachorro.Labrador;
import br.com.autbank.treinamentojava.dt.FalhaAoCriarCachorroException;

public class TesteCachorroException {

	public static void main(String[] args) throws FalhaAoCriarCachorroException {
		
		try {
			
			Cachorro meuCachorro = new Labrador("", -2, "", null);
			
		}catch (Exception  e) {
			System.out.println(e.getMessage());
			throw new FalhaAoCriarCachorroException("Falha Ao Criar Cachorro");
		}
		
	}
	
	//O que acontece caso ocorra uma Exception não prevista?
	// A Exception não será capturada e nem tratada
}
