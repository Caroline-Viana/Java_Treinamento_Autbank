package br.com.autbank.classesautbank;

import java.math.BigDecimal;

import br.com.autbank.gen.util.CalculoMat;

public class TesteCalculoMat {

	public static void main(String[] args) {
		String s = "2347234823323,123456789";
		BigDecimal sDecimal = CalculoMat.getBigDecimal(s);
		BigDecimal zeroDecimal = CalculoMat.getBigDecimal("0");
		BigDecimal soma = BigDecimal.ZERO;
		
		System.out.println(sDecimal);
		System.out.println(zeroDecimal);
		
		
		
		BigDecimal[] arrayDecimal = new BigDecimal[]{
				CalculoMat.getBigDecimal("12.48999"),
				CalculoMat.getBigDecimal("9.47999"),
				CalculoMat.getBigDecimal("10.48999")
		};
		
		for (BigDecimal elemento : arrayDecimal) {
            soma = soma.add(elemento);
        }
		
		System.out.println(soma);
		
		boolean ehMenor =  CalculoMat.ehMenor(arrayDecimal[0], arrayDecimal[1]);
		
		System.out.println(ehMenor);
		
	}

}
