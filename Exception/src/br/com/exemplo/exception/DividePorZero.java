package br.com.exemplo.exception;

public class DividePorZero {

	public static void main(String[] args) {
		
		try {
			int x = Integer.valueOf("A");
			x = 1 / 0;
		}catch(ArithmeticException  | java.lang.NumberFormatException e) {
			System.out.println(e.getLocalizedMessage() + " Não foi possivel realizar esta operação");
			e.getStackTrace();
//		}catch(java.lang.NumberFormatException e) {
//			System.out.println(e.getLocalizedMessage() +  " / " + " Letra no lugar de numero");
		}finally {
			/*
			 * Independete de ter acontecido erro no try , o finaly sempre vai ser executado
			 */
			System.out.println("Finally executado");
		}
		
	}

}
