package br.com.autbank.treinamentojava.classesautbank;

import java.io.IOException;
import java.util.Date;

import br.com.autbank.gen.util.Formatador;
import br.com.autbank.gen.util.ManipulaArquivos;
import br.com.autbank.gen.util.ManipulaJavaUtilDate;
import br.com.autbank.gen.util.MaskedInput;
import br.com.autbank.gen.util.Validador;

public class TestesAutbank {

	public static void main(String[] args) throws IOException {
		
		//Na classe criada, leia o arquivo, utilizando a classe ManipulaArquivos
		
		String[] arquivo = ManipulaArquivos.leArquivo("C:\\Users\\autbank\\ExercicioFinal.txt");
		
		for(int i = 0; i < arquivo.length; i++) {
			System.out.println(arquivo[i]);
		}
		
		// Crie variáveis para armazenar cada linha (identificadores claros!)
		
		String linha1 = arquivo[0];
		String linha2 = arquivo[1];
		String linha3 = arquivo[2];
		String linha4 = arquivo[3];
		String linha5 = arquivo[4];
		
		//Mascare o conteúdo da linha 4 (cep) e guarde em uma variável. (MaskedInput)
		String cepMascara = MaskedInput.maskInput(linha4, "AAAAA-AAA");
		
		//Mascare o conteúdo da linha 5 (telefone) para que seja exibido no formato (55 11) 3283 5666
		String telMascara = MaskedInput.maskInput(linha5, "(AA AA) AAAA AAAA");
		
		/*
		 * Dada um date com valor “2014/01/07”, converta para String
		 * (ManipulaJavaUtilDate) no formato DIA_MES_ANO e guarde-a
		 * numa variável
		 */
		
		Date valorData = new Date("2014/01/07");
		
		String dataConvertida = ManipulaJavaUtilDate
				.getInstance(valorData, ManipulaJavaUtilDate.ANO_MES_DIA)
				.imprimeData(ManipulaJavaUtilDate.DIA_MES_ANO);
		
		//Guarde seu nome completo em uma Variável do tipo String
		String meuNome = "Caroline Viana de Medeiros";
		
		/*Verifique a validade de seu cpf (Validador) e, caso seja válido,
		 * guarde o valor formatado (Formatador) em uma variável
		*/
		
		String meuCpf = "49724700895";
		boolean ehCpf = Validador.ehCpfValido(meuCpf);
		
		if(ehCpf == true) {
			meuCpf = Formatador.aplicaMascaraCPF(meuCpf);
		}
		
		/*
		 * Criem um novo arquivo (ManipulaArquivos)
		 */
		
		String dataNiver = "26/02/2001";
		
		String[] arquivoFinal = {linha1, linha2, linha3, cepMascara, telMascara, dataConvertida, meuNome, dataNiver, meuCpf};
		
		String caminho = "C:\\Users\\autbank\\arquivoFinal.txt";
		
		ManipulaArquivos.criaArquivo(caminho, arquivoFinal);
	}

}
