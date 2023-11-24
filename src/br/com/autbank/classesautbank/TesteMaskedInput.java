package br.com.autbank.classesautbank;

import br.com.autbank.gen.util.Formatador;
import br.com.autbank.gen.util.MaskedInput;

public class TesteMaskedInput {

	public static void main(String[] args) {
		String cep = "04114040";
		String teste = "TREINAMENTO";
		
		String cepFormatado = MaskedInput.maskInput(cep, "AAAAA-AAA");
		System.out.println(cepFormatado);
		
		String testeFormatado = MaskedInput.maskInput(teste, "A*A*A*A*A*A*A*A*A*A*A");
		System.out.println(testeFormatado);
		
		String cepNormal = Formatador.tiraCaracterDeNumeros(cepFormatado);
		System.out.println(cepNormal);
		
		String retiraMascara = MaskedInput.unMaskInput(testeFormatado, "A*A*A*A*A*A*A*A*A*A*A");
		System.out.println(retiraMascara);
	}

}
