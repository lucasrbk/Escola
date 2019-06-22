package negocio;

import java.io.Serializable;

public class Turma  implements Serializable{
	private Disciplina disciplina;
	private Professor professor;
	private int id;
	private int capacidade;
	
	
	public Turma(Disciplina disciplina, Professor professor, int id, int capacidade) {
		super();
		this.disciplina = disciplina;
		this.professor = professor;
		this.id = id;
		this.capacidade = capacidade;
	}

	public Turma() {
		
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}





	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}





	public Professor getProfessor() {
		return professor;
	}





	public void setProfessor(Professor professor) {
		this.professor = professor;
	}





	public int getId() {
		return id;
	}


	public int getCapacidade() {
		return capacidade;
	}


	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Turma [disciplina=" + disciplina + ", professor=" + professor + ", id=" + id + ", capacidade="
				+ capacidade + "]";
	}


}
