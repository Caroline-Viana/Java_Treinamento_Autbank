package br.com.autbank.treinamentojava.testesdeclasses;

import java.math.BigDecimal;

import br.com.autbank.gen.util.CalculoMat;

public class TesteBigDecimal {

	public static void main(String[] args) {
		
		BigDecimal num = CalculoMat.getBigDecimal("14.8888888888");
		BigDecimal num2 = CalculoMat.getBigDecimal("12.666666666");
		
		boolean ehMaior = CalculoMat.ehMaiorIgual(num, num2);
		System.out.println(ehMaior);
		
		boolean ehMenor =  CalculoMat.ehMenor(num, num2);
		System.out.println(ehMenor);
		
		BigDecimal numMultiplica = CalculoMat.multiplica(num, num2);
		System.out.println(numMultiplica);
		
		
	}

}
