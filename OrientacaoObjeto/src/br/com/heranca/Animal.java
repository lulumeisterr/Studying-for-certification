package br.com.heranca;

/**
 * Classes abstratas não é instanciada e o metodo nao possui corpo
 * Não é necessario implementar o metodos caso a mesma classe for abstrata , caso ao contrario deve-se implementar o metodo a ser herdado
 * @author lrodrina
 *
 */
public abstract class Animal {

	private String nome;
	private String idade;
	private Double peso;
	
	public Animal() {
		
	}
	
	public Animal(String nome, String idade, Double peso) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}
	
	/**
	 * Metodo abstrato
	 */
	public abstract void fazerBarulho();

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	
}
