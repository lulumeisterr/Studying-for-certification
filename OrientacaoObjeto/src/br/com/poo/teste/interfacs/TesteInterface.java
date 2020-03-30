package br.com.poo.teste.interfacs;

import br.com.enums.interfaces.IQuadrado;
import br.com.heranca.interfcs.exemplo.Quadrado;

/**
 * Existem Tipos e ações ja definidas , as classes são tipos pois podem conter implementacoes de diversas variedades
 * pelo desenvolvedor , pois oque voce considera no seu projeto é tipo de dado ou seja a classe
 * é uma mistura de projeto e implementacoes, ja as interfaces sao puras contem apenas aquilo.
 * @author lrodrina
 *
 */
public class TesteInterface {
	
	public static void area(IQuadrado a) {
		System.out.println(a.calcularAreaQuadrado());
	}
	
	public static void extraindoAtributo(IQuadrado a) {
		System.out.println(a.valor);
	}
	public static void main(String[] args) {
		
		/*
		 * Definir um tipo sem necessariamente precisar de implementar a classe 
		 */
		area(new Quadrado());
		extraindoAtributo(new Quadrado());
	}

}
