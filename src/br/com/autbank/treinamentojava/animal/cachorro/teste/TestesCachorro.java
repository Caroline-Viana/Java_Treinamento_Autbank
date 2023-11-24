package br.com.autbank.treinamentojava.animal.cachorro.teste;

import br.com.autbank.treinamentojava.animal.cachorro.Labrador;

public class TestesCachorro {

	public static void main(String[] args) throws Exception {
		
		/*
		 * Exerc�cio 2
		 * 
		 * -> Crie o pacote �br.com.autbank.treinamentojava.animal.cachorro.teste�
		 * -> Neste pacote, crie uma classe TestesCachorro
		 * -> Adicione o m�todo main na classe TestesCachorro
		 * -> No m�todo main, adicione uma vari�vel do tipo <SeuCachorro> e a associe a uma nova inst�ncia do tipo <SeuCachorro>
		 */
		
		/*
		 * Exerc�cio 3
		 * 
		 * -> Atrav�s da vari�vel de refer�ncia, atribua alguns valores aos atributos do seu cachorro
		 */
		
		Labrador doPaulo = new Labrador("Amarelo", 7, "Luis", new String[] {"v1", "v2"});
		
		/*
		 * No m�todo main da classe TesteCachorros, crie uma vari�vel local
		 * do tipo String[] e atribua uma nova inst�ncia de String[] com 4
		 * posi��es. Popule esse array com 4 nomes de vacinas
		 */
		
		String[] tiposDeVacinas = {"v1", "v2", "v3", "v4"};
		
		Labrador cachorroVacinado = new Labrador(tiposDeVacinas);
		
		//Crie em TestesCachorros uma nova vari�vel do tipo <SeuCachorro> e utilize o novo construtor (<SeuCachorro>(String[]))
		
		Labrador cachorroImunizado = new Labrador(new String[] {"v1", "v2"});

		//Imprima no console os valores atribu�dos
		System.out.println("O Labrador do Paulo � " + doPaulo.cor + ", ele tem " + doPaulo.idade + " anos e se chama " + doPaulo.nome);
		
		//Fa�a chamadas a esses m�todos no m�todo main da classe TestesCachorros e execute-a
		doPaulo.comer();
		doPaulo.latir();
		doPaulo.dormir();
		
		/*
		 * Exerc�cio 6
		 * 
		 * Para o modificador protected e dafault tem que ser acessado do mesmo pacote,
		 * para o private d� para acessar somente se estiver na mesma classe
		 */
	}

}
