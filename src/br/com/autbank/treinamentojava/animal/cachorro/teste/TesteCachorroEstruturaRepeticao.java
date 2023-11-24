package br.com.autbank.treinamentojava.animal.cachorro.teste;

import br.com.autbank.treinamentojava.animal.cachorro.Labrador;

public class TesteCachorroEstruturaRepeticao {

	public static void main(String[] args) throws Exception {
		Labrador meuCachorro = new Labrador("Caramelo", 5, "Carlos", new String[] {"v1", "v2", "v3"});
		Labrador cachorroDoPaulo = new Labrador("Preto", 5, "Iris", new String[] {"v1", "v2"});
		int inicio = 0;
		int j = 0;
		
		System.out.println("Ficha do " + meuCachorro.nome);
		System.out.println("Vacinas: ");
		for(int i = 0; i < meuCachorro.vacinas.length; i++) {
			System.out.println("-> " + meuCachorro.vacinas[i]);
		}
		
		System.out.println("\nFicha da " + cachorroDoPaulo.nome);
		System.out.println("Vacinas: ");
		
		while(inicio < cachorroDoPaulo.vacinas.length) {
			System.out.println("-> " + cachorroDoPaulo.vacinas[inicio]);
			inicio++;
		}
		
		System.out.println("\nFicha do " + meuCachorro.nome);
		System.out.println("Vacinas: ");
		do {
			System.out.println("-> " + meuCachorro.vacinas[j]);
			j++;
		}while(j < meuCachorro.vacinas.length);
		
		System.out.println(meuCachorro);
	}

}
