package br.com.enums;

/**
 * São Conjunto de variaveis constantes do tipo static e final
 * @author lrodrina
 *
 */
public enum Constante {

	MM("Medida") , CM("Centimetro") , M("Metro");
	
	public String titulo;
	Constante(String titulo){
		this.titulo = titulo;
	}
	
}
