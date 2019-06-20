package negocio;

public class Turma {
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





	private void setId(int id) {
		this.id = id;
	}


	private int getCapacidade() {
		return capacidade;
	}


	private void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
}
