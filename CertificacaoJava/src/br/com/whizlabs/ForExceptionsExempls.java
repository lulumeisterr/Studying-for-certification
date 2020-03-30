package br.com.whizlabs;

public class ForExceptionsExempls {
	
	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 0; i <= 10; i++)
			sum = sum + i;
			
		/*O for pode ser declarado nesta forma explicita porem apenas
		 * o statement a seguir sera processado o , [ i ] so existe dentro
		 * desse statement apos ele passa nao existir mais.
		 * */
		
//			System.out.println("Sum for 0 to : " + i);
			System.out.println(sum);
		
	}

}
