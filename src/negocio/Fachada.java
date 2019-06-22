package negocio;

import controle.ControleAluno;
import controle.ControleDisciplina;
import controle.ControleProfessor;
import controle.ControleRendimento;
import controle.ControleTurma;
import excecoes.AlunoException;
import excecoes.DisciplinaException;
import excecoes.ProfessorException;
import excecoes.RendimentoException;
import excecoes.TurmaException;

public class Fachada{

	private ControleTurma turmas;
	private static Fachada instance;
	private ControleProfessor professores;
	private ControleDisciplina disciplinas;
	private ControleRendimento rendimentos;
	private ControleAluno alunos;

	public Fachada() {
		turmas = new ControleTurma();
		professores = new ControleProfessor();
		disciplinas = new ControleDisciplina();
		rendimentos = new ControleRendimento();
		alunos = new ControleAluno();
		
	}

	public static Fachada getInstance() {
		if (Fachada.instance == null) {
			Fachada.instance = new Fachada();
		}
		return Fachada.instance;
	}

	
	//Alunos
	public void adicionarAluno(Aluno aluno) throws AlunoException {
		alunos.adicionarAluno(aluno);
	}

	public void removerAluno(String nome) {
		alunos.removerAluno(nome);
	}

	public Aluno[] listarAluno() {
		return alunos.listarAluno();
	}

	public Aluno procurarAluno(String nome) {
		return alunos.procurarAluno(nome);
	}

	// Professor

	public void adicionarProfessor(Professor aluno) throws ProfessorException {
		professores.adicionarProfessor(aluno);
	}

	public void removerProfessor(String nome) {
		professores.removerProfessor(nome);
	}

	public Professor[] listarProfessor() {
		return professores.listarProfessor();
	}

	public Professor procurarProfessor(String nome) {
		return professores.procurarProfessor(nome);
	}
	
	// Rendimento
	public void adicionarRendimento(Rendimento aluno) throws RendimentoException {
		rendimentos.adicionarRendimento(aluno);
	}

	public void removerRendimento(String nome) {
		professores.removerProfessor(nome);
	}

	public Rendimento[] listarRendimento() {
		return rendimentos.listarRendimento();
	}

	public Rendimento procurarRendimento(String nome) {
		return rendimentos.procurarRendimento(nome);
	}
	//Turma
	public void adicionarTurma(Turma aluno) throws TurmaException {
		turmas.adicionarTurma(aluno);
	}

	public void removerTurma(int id) {
		turmas.removerTurma(id);
	}

	public Turma[] listarTurma() {
		return turmas.listarTurma();
	}

	public Turma procurarTurma(int id) {
		return turmas.procurarTurma(id);
	}
	//Disciplina
	public void adicionarDisciplina(Disciplina aluno) throws DisciplinaException {
		disciplinas.adicionarDisciplina(aluno);
	}

	public void removerDisciplina(int id) {
		turmas.removerTurma(id);
	}

	public Disciplina[] listarDisciplina() {
		return disciplinas.listarTurma();
	}

	public Disciplina procurarDisciplina(int id) {
		return disciplinas.procurarDisciplina(id);
	}
}
