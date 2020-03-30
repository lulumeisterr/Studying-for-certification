package br.com.enums.interfaces;

/**
 * 
 * A Interface é utilizada quando classes dispares(que nao esteja relacionadas entre si) precisam compartilhar metodos e constantes comum
 * entao permitem que seja processadas polimoformicamente
 * 
 * A Interface permite definir quais operacoes o seu sistema deve fazer , exemplo : cadastrar usuario , excluir usuario
 * calcular uma acao etc...
 * 
 * - Só pode ser declarado metodos abstratos
 * - Não necessita informar os modificadores na classes , todos os metodos de uma interface sao abstratos
 * - Nao precisa declarar o corpo e nem os modificadores 
 * 
 * A classe abstrata pode ter metodos abstratos mas tambem podem implementar metodos e
 * as interfaces são 100% abstrata
 * 
 * Usando classes abstratas você só pode herdar uma unica classe os metodos e os atributos;
 * Com a interface , voce pode herdar varias interfaces
 * 
 * 
 *Todos os atributos na interface sempre sera uma constante 
 *Todas as propriedades de uma interface são public , final static e constante
 * @author lrodrina
 *
 */
public interface IQuadrado {
	
	int valor = 1;
	
	double calcularAreaQuadrado();

}
