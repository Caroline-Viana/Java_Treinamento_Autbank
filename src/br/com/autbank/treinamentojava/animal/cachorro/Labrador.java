package br.com.autbank.treinamentojava.animal.cachorro;

import br.com.autbank.treinamentojava.animal.cachorro.dt.Animal;

public class Labrador extends Cachorro implements Animal{
	
	/*
	 * Exercício 2
	 * 
	 * -> No projeto “br.com.autbank.treinamentojava”, crie um pacote “br.com.autbank.treinamentojava.animal.cachorro”
	 * -> No pacote, crie uma classe com um nome de uma raça de cachorro (Beagle, Boxer, Pastor, Labrador, …)
	 * -> 
	 */
	
	/*
	 * Exercício 3
	 * 
	 * -> Altere a classe <SeuCachorro>, adicionando as seguintes variáveis de instância:
	 * 	public String cor, public int idade e public String nome;
	 * -> 
	 */

	public String cor;
	public int idade;
	public String nome;
	
	// Na classe <SeuCachorro>, adicione uma variável de instância do tipo String[] e dê a ela o nome vacinas
	
	public String[] vacinas;
	
	/*
	 * Adiciona outro construtor e faça com que ele receba a idade como 
	 * parâmetro. Neste construtor, faça com que seja impressa a frase
	 * “Dentro do construtor com parâmetro idade”
	 */
	
	public Labrador(String cor, int idade, String nome, String[] vacinas) throws Exception {
		super(cor, idade, nome);
		this.vacinas = vacinas;
	}
	
	/*
	 * Adicione na classe <SeuCachorro> um novo construtor que deverá
	 * receber como parâmetro uma String[] e atribuí-la à variável de
	 * instância vacinas
	 */
	
	public Labrador(String[] vacinas) throws Exception {
		super("", 0, "");
		this.vacinas = vacinas;
	}
	
	/*
	 * Crie, em <SeuCachorro>, um construtor public e sem parâmetros. Dentro desse construtor, 
	 * faça com que seja impressa a frase “Dentro do construtor default”
	 */
	
	public Labrador() throws Exception {
		super("", 0, "");
		System.out.println("Dentro do construtor default");
	}
	
	/*
	 * Crie os métodos public void latir(), public void comer() e public void dormir()
	 * dentro da classe <SeuCachorro>. Implemente esses métodos,
	 * fazendo com que cada um imprima a ação do método
	 * System.out.println(nome + “ está latindo!”);
	 */
	
	@Override
	public String toString() {
		
		return "Ficha do " + nome + "\nVacinas: \n" + String.join("\n", vacinas);
	}
	
	public boolean equals(Object object) {
		
		if(object != null && object instanceof Labrador) {
			return (getNome() == ((Labrador) object).getNome());
		} else {
			return false;
		}
	}

	@Override
	public void latir(String nome) {
		System.out.println(nome + " está latindo!");
		
	}

	@Override
	public void comer(String nome) {
		System.out.println(nome + " está comendo!");
		
	}

	@Override
	public void dormir(String nome) {
		System.out.println(nome + " está dormindo!");
		
	}

	@Override
	public void latir() {
		System.out.println(nome + " está latindo!");
		
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void latir1(String som) {
		System.out.println(som);
	}

	@Override
	public void latir2(String som, String volume) {
		System.out.println("O latido é " + som + " e " + volume);
		
	}
}
