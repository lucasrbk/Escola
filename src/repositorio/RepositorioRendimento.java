package repositorio;

import negocio.Rendimento;

public interface RepositorioRendimento {
	public void adicionarRendimento(Rendimento a);
	public void removerRendimento(String nomeAluno);
	public Rendimento procurarRendimento(String nomeAluno);
	public Rendimento[] listarRendimento();
}
