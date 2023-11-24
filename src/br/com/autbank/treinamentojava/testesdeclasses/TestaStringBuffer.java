package br.com.autbank.treinamentojava.testesdeclasses;

public class TestaStringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Teste");
		StringBuffer novoSb = new StringBuffer("Teste");

		sb.append(" de classe");
		System.out.println(sb);
		
		sb.delete(3, 5);
		System.out.println(sb);
		
		sb.insert(2, "p");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		novoSb.append(" de StringBuffer");
		System.out.println(novoSb);
		
		novoSb.delete(6, 9);
		System.out.println(novoSb);
		
		//Chame o método deleteCharAt(-20). O que acontece?
		novoSb.deleteCharAt(-20);
		System.out.println(novoSb);
	}

}


