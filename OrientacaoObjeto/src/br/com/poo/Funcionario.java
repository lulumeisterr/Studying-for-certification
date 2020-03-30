package br.com.poo;

/**
 * 4 Pilares da Orientacao objeto
 * 
 * Abstracao
 * Encapsulamento
 * Heranca
 * Polimorfismo
 * 
 * @author lrodrina
 *
 */
public class Funcionario {

	//Modificadores de acesso
	private String nome;
	private Double salario;
	private Boolean ativo;
	private String senha;

	public String getNome(String nome) {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario(Double salario) {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Boolean isAtivo(Boolean ativo) {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	public String getSenha(String senha) {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}


