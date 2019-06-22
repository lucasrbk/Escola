package negocio;

import java.io.Serializable;
import java.util.Date;

public class Aluno implements Serializable{
	int id;
	String nome;
	Date nascimento;
	int periodo;
	String usuario;
	String senha;
	public Aluno(int id, String nome, Date nascimento, int periodo, String usuario, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.nascimento = nascimento;
		this.periodo = periodo;
		this.usuario = usuario;
		this.senha = senha;
	}
	public Aluno(){
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
