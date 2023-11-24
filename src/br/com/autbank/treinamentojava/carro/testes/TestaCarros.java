package br.com.autbank.treinamentojava.carro.testes;

import br.com.autbank.treinamentojava.carro.impl.Proprietario;
import br.com.autbank.treinamentojava.carro.impl.Toro;

public class TestaCarros {

	public static void main(String[] args) {
		
		// Crie duas variáveis de referência para o carro.
		// Crie dois objetos do tipo do seu carro e os atribua as variáveis.
		Proprietario carol = new Proprietario("carol", 22, 'F', 2022);
		
		Toro car1 = new Toro("Toro", "Vermelho", 2023, "Fiat", 150.0, 200.0, new String[] {"Carlos", "Rafael"}, true, carol);
		Toro car2 = new Toro("Toro", "Branco", 2023, "Fiat", 150.0, 200.0, new String[] {"Vera", "Clara"}, true, carol);
		
		String[] proprietarios = car1.getNomeDosProprietarios();
		String[] proprietarios2 = car2.getNomeDosProprietarios();
		
		// Adicione, utilizando o método somaKilometragem valores para os dois carros
		
		car1.somaKilometragem(150.0);
		car2.somaKilometragem(200.0);
		
		//Imprima a “ficha” dos carros, utilizando o padrão (nome, cor, ano, modelo, potencia, kilometragem, proprietario1, proprietario2)
		
		System.out.println("Carro 1 - Nome: " + car1.getNome() + " Cor: " + car1.getCor() + 
				" Ano: " + car1.getAno() + " Modelo: " + car1.getModelo() + " Potencia: " + car1.getPotencia() + 
				" Kilometragem: " + car1.getKilometragem() + " Proprietario 1: " + proprietarios[0] +
				" Proprietario 2: " + proprietarios[1]);
		
		System.out.println("Carro 2 - Nome: " + car2.getNome() + " Cor: " + car2.getCor() + 
				" Ano: " + car2.getAno() + " Modelo: " + car2.getModelo() + " Potencia: " + car2.getPotencia() + 
				" Kilometragem: " + car2.getKilometragem() + " Proprietario 1: " + proprietarios2[0] +
				" Proprietario 2: " + proprietarios2[1]);
	}

}
