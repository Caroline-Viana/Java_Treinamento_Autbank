package br.com.autbank.treinamentojava.pessoa.impl;

public class Pessoa {
	
	//No pacote criado, crie um classe Pessoa com os atributos protected: String nome, int idade, String cpf.
	
	protected String nome;
	protected int idade;
	protected String cpf;
	
	//Crie um construtor default e um construtor completo para esta classe.
	
	public Pessoa() {}

	public Pessoa(String nome, int idade, String cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}

	// Crie getters e setters para os atributos da classe.
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	/*
	 * Crie um método static na classe para verificar se o CPF informado
	 * possui 11 dígitos. O método deve retornar true caso o CPF tenha 11
	 * digitos ou false caso contrário
	 */

	public static boolean verificaCpf(String cpf) {
		return cpf.length() == 11;
	}
}
