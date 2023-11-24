package br.com.autbank.classesautbank;

import br.com.autbank.gen.util.Formatador;

public class TesteFormatador {

	public static void main(String[] args) {
		String cpf = "49724700965";
		String cnpj = "33451397000197";
		String s = "1234";
		
		String mascaraCpf = Formatador.aplicaMascaraCPF(cpf);
		System.out.println(mascaraCpf);
		
		String mascaraCnpj = Formatador.aplicaMascaraCNPJ(cnpj);
		System.out.println(mascaraCnpj);
		
		String preenche = Formatador.preencheZeros(s, 10);
		System.out.println(preenche);
		
		String preencheF = Formatador.preenche(s, 10, 'f');
		System.out.println(preencheF);
		
		String fPreenche = Formatador.preenche(s, 10, 'f', 10);
		System.out.println(fPreenche);
	}

}
