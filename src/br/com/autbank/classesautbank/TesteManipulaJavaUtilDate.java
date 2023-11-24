package br.com.autbank.classesautbank;

import java.util.Date;

import br.com.autbank.gen.util.ManipulaJavaUtilDate;
import br.com.autbank.gen.util.ManipulaPropriedades;

public class TesteManipulaJavaUtilDate {

	public static void main(String[] args) {
		String s = "23/01/2014";
		
		System.out.println(
				(ManipulaJavaUtilDate
						.getInstance(s,ManipulaJavaUtilDate.DIA_MES_ANO)
						.imprimeData(ManipulaJavaUtilDate.ANO_MES_DIA)
				)
		);
		
		System.out.println(ManipulaJavaUtilDate
				.getInstance(s, ManipulaJavaUtilDate.DIA_MES_ANO)
				.imprimeData(ManipulaJavaUtilDate.MES_DIA_ANO)
		);
		
		System.out.println(ManipulaJavaUtilDate
				.getInstance(s, ManipulaJavaUtilDate.DIA_MES_ANO)
				.imprimeData(ManipulaJavaUtilDate.DIA_MES_ANO)
		);
		
		
		ManipulaJavaUtilDate d = ManipulaJavaUtilDate.getInstance(s, ManipulaJavaUtilDate.DIA_MES_ANO);
		
		String diaMesAno = d.toString();
		
		System.out.println(diaMesAno);;
		
		System.out.println(ManipulaJavaUtilDate.getInstance(d.toDate()).getDia());

		
	}

}
