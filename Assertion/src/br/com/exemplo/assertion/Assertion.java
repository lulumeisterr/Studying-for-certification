package br.com.exemplo.assertion;

import java.util.Scanner;

/**
 * Assertion é um verificador(testador) usado em tempo de desenvolvimento que garante ações que nunca podem ocorrer no sistema
 * @author lrodrina
 *
 */
public class Assertion {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.println("Informe um numero de 0 a 10");
		int num1 = a.nextInt();
		
		assert(num1 >= 0  && num1 <= 10) : "Numero invalido";
		System.out.println("Voce entrou no numero : "  + num1);
	}
	
}
