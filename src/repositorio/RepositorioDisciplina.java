package repositorio;

import negocio.Disciplina;

public interface RepositorioDisciplina {
	public void adicionarDisciplina(Disciplina a);
	public void removerDisciplina(String nome);
	public Disciplina procurarDisciplina(String nome);
	public Disciplina[] listarDisciplina();
	
}
