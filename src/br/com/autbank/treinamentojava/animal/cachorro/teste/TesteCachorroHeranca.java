package br.com.autbank.treinamentojava.animal.cachorro.teste;

import br.com.autbank.treinamentojava.animal.cachorro.Labrador;

public class TesteCachorroHeranca {

	public static void main(String[] args) throws Exception {
		Labrador meuCao = new Labrador("Amarelo", 7, "Luis", new String[] {"v1", "v2"});
		
		meuCao.comer(meuCao.getNome());
		meuCao.dormir(meuCao.getNome());
		meuCao.latir(meuCao.getNome());

	}

}
