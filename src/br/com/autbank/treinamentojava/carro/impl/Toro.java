package br.com.autbank.treinamentojava.carro.impl;

public class Toro extends Carro{
	
	/*
	 * Criem variáveis de instância “nome, cor, ano, modelo, potencia,
	 * kilometragem e nomeDosProprietarios” (2 proprietários). Todos os
	 * modificadores com modificador protected
	 */
	
	protected String nome;
	protected String cor;
	protected int ano;
	protected String modelo;
	protected double potencia;
	protected double kilometragem;
	protected String[] nomeDosProprietarios = new String[2];
	protected boolean carroNovo;
	protected Proprietario dono;
	protected int qtdCriada = 0;
	
	//Crie um construtor com todas as variáveis de carro.
	
	public Toro(String nome, String cor, int ano, String modelo, double potencia, double kilometragem,
			String[] nomeDosProprietarios, boolean carroNovo, Proprietario dono) {
		super(modelo, ano, kilometragem);
		
		if(nome == null || nome == "") {
			this.nome = dono.getNome();
		}else {
			this.nome = nome;
		}
		
		this.cor = cor;
		this.ano = ano;
		this.modelo = modelo;
		this.potencia = potencia;
		
		if(carroNovo == true) {
			this.kilometragem = 0.0;
		}else {
			this.kilometragem = kilometragem;
		}
		
		this.nomeDosProprietarios = nomeDosProprietarios;
		this.carroNovo = carroNovo;
		this.dono = dono;
		qtdCriada++;
	}
	
	/*
	 * Crie getters e setters para as variáveis potencia e cor
	 */
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getKilometragem() {
		return kilometragem;
	}

	public void setKilometragem(double kilometragem) {
		this.kilometragem = kilometragem;
	}

	public String[] getNomeDosProprietarios() {
		return nomeDosProprietarios;
	}

	public void setNomeDosProprietarios(String[] nomeDosProprietarios) {
		this.nomeDosProprietarios = nomeDosProprietarios;
	}

	//Crie um método que fará a soma da kilometragem na variável kilometragem
	
	public void somaKilometragem(double valor) {
		this.kilometragem += valor;
	}
	
	public void ligarSom() {
		System.out.println("Som ligado");
	}
	
}
