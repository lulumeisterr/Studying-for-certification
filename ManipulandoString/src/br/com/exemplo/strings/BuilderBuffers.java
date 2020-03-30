package br.com.exemplo.strings;

/**
 * Um texto de um objeto string nao pode ser modificado , mas com a classe string buffer pode permitir essa ação.
 * 
 * A utilizacao do SpringBuilder ou Buffer serve para melhorar a performace do sistema na criação de locação de memoria
 * na jvm pois cada String que vc cria e atribui um valor , é um objeto a ser criado e quando vc passa manipular esse valor
 * varias vezes você pode acabar tendo problemas na performace do seu sistema. 
 * 
 * @author lrodrina
 *
 *Utilizar a StringBuffer ou StringBuilder
 *StringBuffer serve para trabalhar com ambientes que possui muitos processos(threads)
 *
 *
 */
public class BuilderBuffers {
	
	public static void main(String[] args) {
	
		StringBuffer sbf = new StringBuffer();
		
		String [] lastName = {"DO","NASCIMENTO"};
		sbf.append("Lucas").append("Rodrigues").append(lastName[0]).append(lastName[1]);
		
		System.out.println(sbf.toString());
		
	}
}
