package br.estudo.tipagem;


public class Tipagem {

	public static void main(String[] args) {
		
		/**
		 * 
		 * 
		 * 
		 * PADRAO IEEE754 para definir como esses numeros flutuantes devem ser 
		 * tratados pela CPU
		 * 	
		 * Tipos primitivos
		 * 2bilhoes 1.797E    127cem 32MIL    9Quintilhoes	      
		 * int ,    double ,  byte , short ,  long ,        float , char , void , boolean
		 * 1	    1.23	  1000	 1000	  1000 ,        1000	 'L'			'TRUE'
		
		 */
		
		//CAST implicito -> Conversoes de tipos primitivos de tipagem que aceitam valores de outros tipos
		short s = 32767;
		int i = 2000000000;
		long l = 900000000000000000L;	
		
		i = s;
		System.out.println(i + " CAST implicito");
		
		//CAST explicito -> necessita forçar o java a receber esse valor mesmo que contenha perda de informacao
		
		i = (int)l;
		System.out.println(i + " CAST explicito");
	}
	
}

