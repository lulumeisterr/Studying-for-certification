package br.com.garbage.collectors;

public class Garbage {
	
	/**
	 * Variavel de referencia , é toda variavel que aponta para um objeto
	 *
	 *Qual a diferenca de dados primitivos e dados de objeto (variavel de referencia) ?
	 *
	 *R: Na variavel de referencia(objeto) não contem um conteudo explicito e sim uma referencia ao valor onde a VM que controla essas ações
	 * em variavel primitiva o conteudo é explicito a variavel , dentro do valor existe um binario daquele conteudo para ser exibido;
	 */
	
	
	/**
	 * Quando o garbageCollector age ? no momento em que a variavel permanece na memoria sem referencia e associações
	 * Exemplo : String  y = "LUCAS";
	 *  y = "JOSE"
	 *  
	 *  nesse momento nos desativamos a variavel y que continha uma referencia ao valor lucas passando a ser ativa o valor JOSE
	 *  mas LUCAS ainda esta na memoria porem sem referencias , nesse momento ó garbage Collector age
	 *  
	 *  -------------[ Garbage Collector gerencia as variaveis que não estao sendo utilizadas no seu programa ]------------
	 *  y = null <- quando isso acontece o garbage collector limpa esses objetos que ocupa espaco na memoria
	 */

	
	//Primitivo
	int a = 1;

	
	//variavel de referencia -> Objeto
	Integer b = 1;
}
