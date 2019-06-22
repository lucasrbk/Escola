package repositorio;

import negocio.Disciplina;

public interface RepositorioDisciplina {
	public void adicionarDisciplina(Disciplina a);
	public void removerDisciplina(int id);
	public Disciplina procurarDisciplina(int id);
	public Disciplina[] listarDisciplina();
	
}
