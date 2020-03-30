package br.com.wrapers;

public class Wrappers {
	
	/**
	 * Classes Wrappers , sao classes empacotadoras dos tipos primitivos que
	 * Oferecem recursos de conversao para serem utilizados no java para convercoes de texto para um tipo double etc...
	 */
	
	public static void main(String[] args) {
		 Integer idade = new Integer(31);
		 
		 System.out.println(idade.intValue());
		 
		 
		 //CONVERSOES STATICAS
		 
		 int a = Integer.parseInt(idade.toString());
		 System.out.println(a);
	}
	 
}
