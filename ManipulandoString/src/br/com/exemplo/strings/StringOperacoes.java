package br.com.exemplo.strings;

public class StringOperacoes {

	public static void main(String[] args) {
		
		
		//Operações
		
		String nome = "Lucas Rodrigues do Nascimento";
		
		int tamanhoNome = nome.length();
		System.out.println(tamanhoNome);
		
		//Retornando letra por posicao
		char letra = nome.charAt(0);
		System.out.println(letra);
		
		//Localizacao de caracter e strings no texto
		//Retornando a posicao que a letra se inicia , retorna essa letra
		int posicaoLetra = nome.indexOf("Rodrigues");
		System.out.println(posicaoLetra);
		
		//Encontrando a ultima ocorrencia da string
		int ultimaOcorrenciaDaString = nome.lastIndexOf("u");
		System.out.println(ultimaOcorrenciaDaString);
	
		boolean stringVazia = nome.isEmpty();
		System.out.println(stringVazia);
		
		//Verificar se comeca com X valor ou termina com Y valor
		boolean verificarSeIniciaComL = nome.startsWith("Lu");
		System.out.println(verificarSeIniciaComL);
		
		//Comparar tamanho de string se ela é maior ou menor em ordem alfabetica
		int compararString = "Lucas".compareTo("Rodrigues");
		System.out.println(compararString);
		
		//Encontrar um pedaco de um texto em um texto maior
		String pegarUmaParteDaString = nome.substring(20);
		System.out.println(pegarUmaParteDaString);
		
		//Pegar da posicao x ate a posicao y
		String pegarDeXaY = nome.substring(0,5);
		System.out.println(pegarDeXaY);
		
		//Trocar a primeira letra do caracter
		String trocarPrimeiraLetraNome = nome.replaceFirst("L", "J");
		System.out.println(trocarPrimeiraLetraNome);
		
		
		
		
	}
	
}
