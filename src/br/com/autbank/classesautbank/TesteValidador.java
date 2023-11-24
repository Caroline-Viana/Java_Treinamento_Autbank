package br.com.autbank.classesautbank;

import br.com.autbank.gen.util.Validador;

public class TesteValidador {

	public static void main(String[] args) {
		String cpf = "49724700895";
		String cnpj = "33451397000197";
		String email = "treinamento@autbank.com.br";
		
		boolean ehCpf = Validador.ehCpfValido(cpf);
		System.out.println(ehCpf);
		
		boolean ehCnpj = Validador.ehCnpjValido(cnpj);
		System.out.println(ehCnpj);
		
		boolean ehEmail = Validador.ehEmailValido(email);
		System.out.println(ehEmail);

	}

}
