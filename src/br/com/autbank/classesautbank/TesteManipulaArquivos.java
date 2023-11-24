package br.com.autbank.classesautbank;

import java.io.File;
import java.io.IOException;

import br.com.autbank.gen.util.ManipulaArquivos;

public class TesteManipulaArquivos {

	public static void main(String[] args) throws IOException{
		String[] arquivo = {"criacao", "de", "arquivo"};
		String caminho = "C:\\Users\\autbank\\arquivo.txt";
		String caminho2 = "C:\\Users\\autbank\\arquivo2.txt";
		String caminho3 = "C:\\Users\\autbank\\arquivo3.txt";

		ManipulaArquivos.criaArquivo(caminho, arquivo);
		ManipulaArquivos.criaArquivo(caminho2, arquivo);
		
		boolean existe = ManipulaArquivos.existe(caminho);
		System.out.println(existe);
		
		File arquivoAtual = new File(caminho);
		
		arquivoAtual.renameTo(new File(caminho3));
		
		System.out.println(arquivoAtual.getName());
	}

}
