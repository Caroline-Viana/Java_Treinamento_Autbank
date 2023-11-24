package br.com.autbank.treinamentojava.testesdeclasses;

import java.util.HashMap;

public class TesteHashMap {

	public static void main(String[] args) {
		HashMap<String, String> novoHash = new HashMap<String, String>();

		novoHash.put("chave 1", "Carol");
		novoHash.put("chave 2", "Adelane");
		novoHash.put("chave 3", "Alan");
		novoHash.put("chave 4", "Bruno");
		novoHash.put("chave 5", "Isaac");
		novoHash.put("chave 6", "Gabriel");
		novoHash.put("chave 7", "Joas");
		novoHash.put("chave 8", "Vitor");
		novoHash.put("chave 9", "Lucas");
		
		novoHash.get("chave 1");
		
		novoHash.remove("chave 1");
		
		for(String key : novoHash.keySet()) {
			System.out.println(key + " = " + novoHash.get(key));
		}
	}

}
