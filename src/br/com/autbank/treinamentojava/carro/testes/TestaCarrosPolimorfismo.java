package br.com.autbank.treinamentojava.carro.testes;

import br.com.autbank.treinamentojava.carro.impl.Carro;
import br.com.autbank.treinamentojava.carro.impl.CarroUtil;
import br.com.autbank.treinamentojava.carro.impl.Gol;
import br.com.autbank.treinamentojava.carro.impl.Proprietario;
import br.com.autbank.treinamentojava.carro.impl.Toro;

public class TestaCarrosPolimorfismo {

	public static void main(String[] args) {
		Proprietario carol = new Proprietario("carol", 22, 'F', 2022);
		Carro meuGol = new Gol("Azul", 2023, 150.0);
		Carro meuToro = new Toro("Toro", "Cinza", 2010, "Fiat", 
				120.0, 70.0, new String[] {"Carol", "Clara"}, false, carol);
		
		//Crie um array do tipo Carro com 4 posições.
		Carro[] listaCar = {meuGol, meuToro};

		System.out.println("Ficha do carro: Toro");
		System.out.println("Cor: " + meuToro.cor + "\nAno: " + meuToro.ano + "\nKilometragem: " + meuToro.kilometragem);
		
		System.out.println("\nFicha do carro: Gol");
		System.out.println("Cor: " + meuGol.cor + "\nAno: " + meuGol.ano + "\nKilometragem: " + meuGol.kilometragem + "\n");
		
		CarroUtil.verificaCarro(meuToro);
		System.out.println("\n");
		CarroUtil.verificaCarro(meuGol);
	}

}
