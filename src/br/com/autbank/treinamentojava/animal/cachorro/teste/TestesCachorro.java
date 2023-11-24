package br.com.autbank.treinamentojava.animal.cachorro.teste;

import br.com.autbank.treinamentojava.animal.cachorro.Labrador;

public class TestesCachorro {

	public static void main(String[] args) throws Exception {
		
		/*
		 * Exercício 2
		 * 
		 * -> Crie o pacote “br.com.autbank.treinamentojava.animal.cachorro.teste”
		 * -> Neste pacote, crie uma classe TestesCachorro
		 * -> Adicione o método main na classe TestesCachorro
		 * -> No método main, adicione uma variável do tipo <SeuCachorro> e a associe a uma nova instância do tipo <SeuCachorro>
		 */
		
		/*
		 * Exercício 3
		 * 
		 * -> Através da variável de referência, atribua alguns valores aos atributos do seu cachorro
		 */
		
		Labrador doPaulo = new Labrador("Amarelo", 7, "Luis", new String[] {"v1", "v2"});
		
		/*
		 * No método main da classe TesteCachorros, crie uma variável local
		 * do tipo String[] e atribua uma nova instância de String[] com 4
		 * posições. Popule esse array com 4 nomes de vacinas
		 */
		
		String[] tiposDeVacinas = {"v1", "v2", "v3", "v4"};
		
		Labrador cachorroVacinado = new Labrador(tiposDeVacinas);
		
		//Crie em TestesCachorros uma nova variável do tipo <SeuCachorro> e utilize o novo construtor (<SeuCachorro>(String[]))
		
		Labrador cachorroImunizado = new Labrador(new String[] {"v1", "v2"});

		//Imprima no console os valores atribuídos
		System.out.println("O Labrador do Paulo é " + doPaulo.cor + ", ele tem " + doPaulo.idade + " anos e se chama " + doPaulo.nome);
		
		//Faça chamadas a esses métodos no método main da classe TestesCachorros e execute-a
		doPaulo.comer();
		doPaulo.latir();
		doPaulo.dormir();
		
		/*
		 * Exercício 6
		 * 
		 * Para o modificador protected e dafault tem que ser acessado do mesmo pacote,
		 * para o private dá para acessar somente se estiver na mesma classe
		 */
	}

}
