package br.com.autbank.treinamentojava.testesdeclasses;

public class TestaStrings {

	public static void main(String[] args) {
		String s = "   Teste de String";
		
		// Replace
		String replaceS = s.replace("Teste", "Métodos");
		System.out.println(replaceS);

		// Substring
		String sub = s.substring(8);
		System.out.println(sub);
		
		// toLowerCase
		String lower = s.toLowerCase();
		System.out.println(lower);
		
		// toString
		String st = s.toString();
		System.out.println(st);
		
		// trim
		String tr = s.trim();
		System.out.println(tr);
		
		// charAt
		char ch = s.charAt(9);
		System.out.println(ch);
		
		// length
		int tamanho = s.length();
		System.out.println(tamanho);
		
	}

}
