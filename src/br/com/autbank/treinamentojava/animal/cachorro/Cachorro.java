package br.com.autbank.treinamentojava.animal.cachorro;

import br.com.autbank.treinamentojava.dt.FalhaAoCriarCachorroException;

public abstract class Cachorro {
	public String cor;
	public int idade;
	public String nome;
	
	public Cachorro(String cor, int idade, String nome) throws FalhaAoCriarCachorroException {
		super();
		if(cor == null || cor == "") {
			throw new FalhaAoCriarCachorroException("Cor inválida!");
		}else {
			this.cor = cor;
		}
		
		this.idade = idade;
		
		if(nome == null || nome == "") {
			throw new FalhaAoCriarCachorroException("Nome inválido!");
		}else {
			this.nome = nome;
		}
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) throws Exception {
		
		if(idade < 0) {
			throw new Exception("Idade inválida!");
		} 
		
		this.idade = idade;
		
	}
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) throws Exception {
		if(nome == null || nome == "") {
			throw new Exception("Nome inválido!");
		}else {
			this.nome = nome;
		}
	}
	
	public abstract void latir();
	
	public abstract void latir1(String som);
	
	public abstract void latir2(String som, String volume);
	
	public abstract void comer();
	
	public abstract void dormir();
	
	
}
