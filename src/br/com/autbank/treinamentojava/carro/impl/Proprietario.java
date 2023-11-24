package br.com.autbank.treinamentojava.carro.impl;

public class Proprietario {
	
	public String nome;
	public int idade;
	public char sexo;
	public int anoHabilitacao;
	
	public Proprietario(String nome, int idade, char sexo, int anoHabilitacao) {
		super();
		
		if(nome == null || nome == "") {
			System.out.println("Nome não informado");
		}else {
			this.nome = nome;
		}
		
		
		if(idade >= 18) {
			this.idade = idade;
		}else {
			this.idade = 18;
		}
		
		if(sexo == 'M' || sexo == 'm' || sexo == 'F' || sexo == 'f') {
			this.sexo = sexo;
		}else {
			this.sexo = 'M';
		}
		
		if(anoHabilitacao >= 1920 && anoHabilitacao <= 2014) {
			this.anoHabilitacao = anoHabilitacao;
		}else {
			this.anoHabilitacao = 1920;
		}
		
	}
	
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
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getAnoHabilitacao() {
		return anoHabilitacao;
	}
	public void setAnoHabilitacao(int anoHabilitacao) {
		this.anoHabilitacao = anoHabilitacao;
	}
	
	

}
