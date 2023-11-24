package br.com.autbank.treinamentojava.testesdeclasses;

public class TestaWrapper {

	public static void main(String[] args) {
		int i = 10;
		
		String st = Integer.toString(i);
		System.out.println(st);
		
		Float numFloat = Float.valueOf(st);
		System.out.println(numFloat);
		
		Double numDouble = Double.valueOf(numFloat);
		System.out.println(numDouble);
		
		double numDouble2 = numDouble;
		System.out.println(numDouble2);
		
		String stDouble = Double.toString(numDouble2);
		System.out.println(stDouble);
		
		int num = Integer.parseInt(st);
		System.out.println(num);
	}

}
