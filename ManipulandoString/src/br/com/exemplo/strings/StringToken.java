package br.com.exemplo.strings;

public class StringToken {

	public static void main(String[] args) {
	
		String x = "HTML , XHTML , CSS , JAVA , PYTHON , Jquery , Nodejs";
		String[] tokens = x.split(",");
		
		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		
	}
}
