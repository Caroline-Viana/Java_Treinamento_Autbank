package br.com.autbank.treinamentojava.animal.cachorro;

import br.com.autbank.treinamentojava.animal.cachorro.dt.Animal;

public class Labrador extends Cachorro implements Animal{
	
	/*
	 * Exerc�cio 2
	 * 
	 * -> No projeto �br.com.autbank.treinamentojava�, crie um pacote �br.com.autbank.treinamentojava.animal.cachorro�
	 * -> No pacote, crie uma classe com um nome de uma ra�a de cachorro (Beagle, Boxer, Pastor, Labrador, �)
	 * -> 
	 */
	
	/*
	 * Exerc�cio 3
	 * 
	 * -> Altere a classe <SeuCachorro>, adicionando as seguintes vari�veis de inst�ncia:
	 * 	public String cor, public int idade e public String nome;
	 * -> 
	 */

	public String cor;
	public int idade;
	public String nome;
	
	// Na classe <SeuCachorro>, adicione uma vari�vel de inst�ncia do tipo String[] e d� a ela o nome vacinas
	
	public String[] vacinas;
	
	/*
	 * Adiciona outro construtor e fa�a com que ele receba a idade como 
	 * par�metro. Neste construtor, fa�a com que seja impressa a frase
	 * �Dentro do construtor com par�metro idade�
	 */
	
	public Labrador(String cor, int idade, String nome, String[] vacinas) throws Exception {
		super(cor, idade, nome);
		this.vacinas = vacinas;
	}
	
	/*
	 * Adicione na classe <SeuCachorro> um novo construtor que dever�
	 * receber como par�metro uma String[] e atribu�-la � vari�vel de
	 * inst�ncia vacinas
	 */
	
	public Labrador(String[] vacinas) throws Exception {
		super("", 0, "");
		this.vacinas = vacinas;
	}
	
	/*
	 * Crie, em <SeuCachorro>, um construtor public e sem par�metros. Dentro desse construtor, 
	 * fa�a com que seja impressa a frase �Dentro do construtor default�
	 */
	
	public Labrador() throws Exception {
		super("", 0, "");
		System.out.println("Dentro do construtor default");
	}
	
	/*
	 * Crie os m�todos public void latir(), public void comer() e public void dormir()
	 * dentro da classe <SeuCachorro>. Implemente esses m�todos,
	 * fazendo com que cada um imprima a a��o do m�todo
	 * System.out.println(nome + � est� latindo!�);
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
		System.out.println(nome + " est� latindo!");
		
	}

	@Override
	public void comer(String nome) {
		System.out.println(nome + " est� comendo!");
		
	}

	@Override
	public void dormir(String nome) {
		System.out.println(nome + " est� dormindo!");
		
	}

	@Override
	public void latir() {
		System.out.println(nome + " est� latindo!");
		
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
		System.out.println("O latido � " + som + " e " + volume);
		
	}
}
