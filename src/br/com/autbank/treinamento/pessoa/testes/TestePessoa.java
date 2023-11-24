package br.com.autbank.treinamento.pessoa.testes;

import br.com.autbank.treinamentojava.pessoa.impl.Pessoa;

public class TestePessoa {

	public static void main(String[] args) {
		/*
		 * Crie uma classe TestePessoa com um método main e a instancie
		 * com o uso do construtor default. Imprima a ficha desta pessoa.
		 */
		
		Pessoa novaPessoa = new Pessoa();
		
		novaPessoa.setNome("Valeria");
		novaPessoa.setCpf("12345678910");
		novaPessoa.setIdade(30);
		
		System.out.println("Nome: " + novaPessoa.getNome() + " CPF: " + novaPessoa.getCpf() + " Idade: " + novaPessoa.getIdade());

		// Instancie uma outra Pessoa com o construtor completo e imprima a ficha desta pessoa.
		
		Pessoa pessoa1 = new Pessoa("Carol", 22, "12345678926");
		
		System.out.println("Nome: " + pessoa1.getNome() + " CPF: " + pessoa1.getCpf() + " Idade: " + pessoa1.getIdade());
		
		/*
		 * Execute o método de Pessoa para avaliar o CPF das duas pessoas.
		 * Caso o CPF não possua 11 dígitos, imprima “O CPF deve ter 11
		 * dígitos!” caso contrário imprima “CPF correto!” . Utilize o operador
		 * ternário.
		 */
		
		String msg1 = novaPessoa.verificaCpf(novaPessoa.getCpf()) ? "CPF correto!" : "O CPF deve ter 11 dígitos!”";
		System.out.println(msg1);
		
		String msg2 = pessoa1.verificaCpf(pessoa1.getCpf()) ? "CPF correto!" : "O CPF deve ter 11 dígitos!”";
		System.out.println(msg2);
		
		/*Dados os métodos:
		 * metodoA();
		 * public metodoB();
		 * private metodoC();
		 * protected metodoD();
		 * 
		 * Explique onde esses métodos seriam visíveis, supondo que a classe que os contém fosse:
		 * 
		 * Public:
		 *  No metodoA(): Pode ser acessado de qualquer Lugar.
		 *  No public metodoB(): Pode ser acessado de qualquer lugar.
		 *  No private metodoC(): Pode ser acessado somente dentro da classe.
		 *  No protected metodoD(): Pode ser acessado de qualquer lugar.
		 *  
		 *  Default
		 *  No metodoA(): Pode ser acessado somente pelas classes do mesmo pacote.
		 *  No public metodoB(): Pode ser acessado somente pelas classes do mesmo pacote.
		 *  No private metodoC(): Pode ser acessado somente pelas classes do mesmo pacote.
		 *  No protected metodoD(): Pode ser acessado somente pelas classes do mesmo pacote.
		 */
	}

}
