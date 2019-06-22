package repositorio;

import negocio.Turma;

public interface RepositorioTurma {
	public void adicionarTurma(Turma a);
	public void removerTurma(int id);
	public Turma procurarTurma(int id);
	public Turma[] listarTurma();
}
