package br.com.exemplo.polimorfism.teste;

import br.com.exemplo.polimorfismo.sobrescrita.Matematica;
import br.com.exemplo.polimorfismo.sobrescrita.Soma;

public class Teste {

	public static void calcularValor(Matematica mat , double x , double y) {
		System.out.println(mat.calcular(x, y));
	}
	
	public static void main(String[] args) {
		calcularValor(new Soma(), 10, 5);
	}
}
