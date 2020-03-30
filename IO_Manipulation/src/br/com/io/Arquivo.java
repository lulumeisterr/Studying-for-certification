package br.com.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 
 * @author lrodrina
 *
 *Biblioteca IO
 *Path introduzida apartir do java 7
 *
 *
 *
 */
public class Arquivo {

	public static void main(String[] args) {
		
		int array[] = new int [-2];
		
		 
		
		//Obtendo caminho do arquivo
		Path path = Paths.get("C:/Users/Lrodrina/Desktop/Java estudo/IO_Manipulation/Files/texto.txt");
		
		System.out.println(path.toAbsolutePath());
		System.out.println(path.getParent());
		System.out.println(path.getRoot());
		System.out.println(path.getFileName());
		
		
		try {
			/* Criando o diretorio */
			Files.createDirectories(path.getParent());
			
			/* escrever e ler arquivos */
			/* Metodo write()
			 * Criar o arquivo
			 * Limpa o arquivo
			 * escreve no arquivo
			 */
			byte[] bytes = "Meu Texto".getBytes();
			Files.write(path.toAbsolutePath(), bytes);
			
			
			/* Ler arquivo */
			
			byte [] retorno = Files.readAllBytes(path.toAbsolutePath());
			System.out.println(new String(retorno));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
