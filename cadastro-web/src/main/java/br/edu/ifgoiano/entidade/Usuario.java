package br.edu.ifgoiano.entidade;

import java.util.Date;

public class Usuario {
	private static Integer incremento = 1;
	private Integer id;
	private String email;
	private String nome;
	private String senha;
	private Date dataNascimento;

	public Usuario() {
		this.id = incremento++;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Integer obterIdade() {

		return 0;
	}

}
