package br.com.autbank.treinamentojava.animal.cachorro.teste;

import br.com.autbank.treinamentojava.animal.cachorro.Cachorro;
import br.com.autbank.treinamentojava.animal.cachorro.Labrador;

public class TestaCachorroSobrecarga {

	public static void main(String[] args) throws Exception {
		Cachorro meuCachorro = new Labrador("Preto", 2, "lili", null);
		
		meuCachorro.latir();
		meuCachorro.latir1("Fino");
		meuCachorro.latir2("Forte", "Alto");

	}

	/*
	 * Se existisse dois métodos:
	 * public void latir(long par) e public void latir(int par)
	 * qual método seria chamado no caso latir(1234); ?
	 */
}
