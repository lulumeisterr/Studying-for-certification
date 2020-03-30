package br.com.exemplo.exception.object;

public class SenhaTeste {

	static void autentificar(String senha)throws SenhaInvalidaException {
		if("123".equals(senha)) {
			System.out.println("Entrou");
		}else {
			throw new SenhaInvalidaException("Senha Incorreta");
		}
	}

	public static void main(String[] args) {
		try {
			autentificar("321");
		} catch (SenhaInvalidaException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}


