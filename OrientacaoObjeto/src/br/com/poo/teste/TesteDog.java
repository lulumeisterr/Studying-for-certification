package br.com.poo.teste;

import br.com.heranca.Animal;
import br.com.heranca.Cachorro;
import br.com.heranca.Galinha;

public class TesteDog {

	public static void main(String[] args) {
		
		Animal cc = new Cachorro();
		cc.setIdade("10");
		cc.setNome("Jose");
		cc.setPeso(55.5);
		//System.out.println(cc.getNome());
		cc.fazerBarulho();
		
		Animal ga = new Galinha();
		ga.setIdade("10");
		ga.setNome("Galinha");
		ga.setPeso(55.5);
		//System.out.println(ga.getNome());
		ga.fazerBarulho();
		
		/**
		 * Verificar instancias de objetos
		 */
		if(ga instanceof Galinha) {
			System.out.println("Este objeto é instancia de Galinha");
		};
		
	}
}
