package br.com.autbank.treinamentojava.carro.impl;

public abstract class Carro {
	
	public String cor;
	public int ano;
	public double kilometragem;
	
	public Carro(String cor, int ano, double kilometragem) {
		super();
		this.cor = cor;
		this.ano = ano;
		
		if(kilometragem > 0) {
			this.kilometragem = kilometragem;
		}else {
			this.kilometragem = 0;
			System.out.println("Só é aceito valores maiores que Zero na Kilimetrgem");
		}
		
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getKilometragem() {
		return kilometragem;
	}

	public void setKilometragem(double kilometragem) {
		this.kilometragem = kilometragem;
	}
	
}
