package br.com.autbank.treinamentojava.pessoa.impl;

import br.com.autbank.treinamentojava.pessoa.dt.TECpfNaoInformadoException;
import br.com.autbank.treinamentojava.pessoa.dt.TEDataDeNascimentoNaoInformadaException;
import br.com.autbank.treinamentojava.pessoa.dt.TELogradouroNaoInformadoException;
import br.com.autbank.treinamentojava.pessoa.dt.TENomeNaoInformadoException;

public abstract class ATOPessoa {

	protected String nome;
	protected String dataNascimento;
	protected String cpf;
	protected String logradouro;
	
	protected ATOPessoa(String nome, String dataNascimento, String cpf, String logradouro) 
			throws TENomeNaoInformadoException, TEDataDeNascimentoNaoInformadaException, 
			TECpfNaoInformadoException, TELogradouroNaoInformadoException {
		
		if(nome == null || nome == "") {
			throw new TENomeNaoInformadoException("O nome não foi informado");
		}else {
			this.nome = nome;
		}
		
		if(dataNascimento == null || dataNascimento == "") {
			throw new TEDataDeNascimentoNaoInformadaException("A data de nascimento não foi informado");
		}else {
			this.dataNascimento = dataNascimento;
		}
		
		if(cpf == null || cpf == "") {
			throw new TECpfNaoInformadoException("O CPF não foi informado");
		}else {
			this.cpf = cpf;
		}
		
		if(logradouro == null || logradouro == "") {
			throw new TELogradouroNaoInformadoException("O Logradouro não foi informado");
		}else {
			this.logradouro = logradouro;
		}
		
	}
	
	protected ATOPessoa() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
}
