package negocio;

public class Rendimento {
	private Turma turma;
	private Aluno aluno;
	private int nota1;
	private int nota2;
	private int[] NotasTrabalhos;
	private String[] trabalhos;
	
	
	public Rendimento(Turma turma, Aluno aluno, int nota1, int nota2, int[] notasTrabalhos, String[] trabalhos) {
		super();
		this.turma = turma;
		this.aluno = aluno;
		this.nota1 = nota1;
		this.nota2 = nota2;
		NotasTrabalhos = notasTrabalhos;
		this.trabalhos = trabalhos;
	}


	public Turma getTurma() {
		return turma;
	}


	public void setTurma(Turma turma) {
		this.turma = turma;
	}


	public Aluno getAluno() {
		return aluno;
	}


	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}


	public int getNota1() {
		return nota1;
	}


	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}


	public int getNota2() {
		return nota2;
	}


	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}


	public int[] getNotasTrabalhos() {
		return NotasTrabalhos;
	}


	public void setNotasTrabalhos(int[] notasTrabalhos) {
		NotasTrabalhos = notasTrabalhos;
	}


	public String[] getTrabalhos() {
		return trabalhos;
	}


	public void setTrabalhos(String[] trabalhos) {
		this.trabalhos = trabalhos;
	}
	
	
	
	
	
}
