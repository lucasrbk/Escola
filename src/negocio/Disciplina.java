package negocio;

import java.io.Serializable;

public class Disciplina implements Serializable{
	private int id;
	private String nome;
	private String ementa;
	
	public Disciplina(int id, String nome, String ementa) {
		super();
		this.id = id;
		this.nome = nome;
		this.ementa = ementa;
	}
	public Disciplina() {
		
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

	public String getEmenta() {
		return ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}

	@Override
	public String toString() {
		return "Disciplina [id=" + id + ", nome=" + nome + ", ementa=" + ementa + "]";
	}

	
}
