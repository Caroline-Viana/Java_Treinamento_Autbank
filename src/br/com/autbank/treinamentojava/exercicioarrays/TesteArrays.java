package br.com.autbank.treinamentojava.exercicioarrays;

public class TesteArrays {

	public static void main(String[] args) {
		String[] arrayTeste = {"el1", null, "", "el4"};
		
		trataArrays(arrayTeste);

	}
	
	public static void trataArrays(String[] array) {
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] != null && array[i] != "") {
				System.out.println(array[i].length());
			}
		}
	}

}
