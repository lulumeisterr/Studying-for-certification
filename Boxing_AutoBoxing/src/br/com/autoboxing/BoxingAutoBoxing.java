package br.com.autoboxing;

public class BoxingAutoBoxing {
	
	public static void main(String[] args) {
		
		
		/**
		 * AutoBoxing � a conversao automatica de tipos primitivos de uma classe wrapper
		 * 
		 * Unboxing � criar um tipo primitivo encapsulado atraves de uma classe wraper e ter que desencapsular esse valor 
		 * caso sofra altera��es
		 */
		//Criando tipo primitivo encapsulado atraves de uma classe wrapper integer
		Integer  x = new Integer(555); //empacotado
		
		//desencapsulando o valor primitivo
		int y = x.intValue();
		
		//incrementando
		y++;
		
		//reempacotando o valor
		x = new Integer(y);
		System.out.println(x.intValue());
		
		
		
	}

}
