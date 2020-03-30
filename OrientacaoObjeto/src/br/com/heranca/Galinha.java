package br.com.heranca;

public class Galinha extends Animal {

	public void botar() {
		System.out.println("BOTANDO OVO");
	}

	public Galinha() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Galinha(String nome, String idade, Double peso) {
		super(nome, idade, peso);
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * Sobrescrita de metodo da Classe Animal
	 */
	@Override
	public void fazerBarulho() {
		System.out.println("COH COOHHHH");
	}
	
}
