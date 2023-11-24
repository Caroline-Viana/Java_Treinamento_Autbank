package br.com.autbank.treinamentojava.testesdeclasses;

import java.util.ArrayList;

public class TestaArrayList {

	public static void main(String[] args) {
		ArrayList<String> novoArry = new ArrayList<>();

		novoArry.add("L1");
		novoArry.add("L2");
		novoArry.add("L3");
		novoArry.add("L4");
		novoArry.add("L5");
		
		novoArry.add(4, "V1");
		novoArry.add(5, "V2");
		
		boolean ehVazio = novoArry.isEmpty();
		System.out.println(ehVazio);
		
		novoArry.remove(1);
		novoArry.remove(3);
		
		novoArry.set(2, "S1");
		
		String[] arryStatic = (String[]) novoArry.toArray(new String[novoArry.size()]);
	}

}
