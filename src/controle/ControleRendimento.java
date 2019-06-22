package controle;

import excecoes.RendimentoException;
import negocio.Rendimento;
import repositorio.RepositorioRendimento;
import repositorio.RepositorioRendimentoArray;

public class ControleRendimento {

	RepositorioRendimento Rendimentos = RepositorioRendimentoArray.getInstance();

	public void adicionarRendimento(Rendimento a) throws RendimentoException {
		if (a.getAluno().getNome() != null || a.getAluno().getNome()  !="") {
		
			Rendimentos.adicionarRendimento(a);
			RepositorioRendimentoArray.getInstance().salvarArquivo();
			System.out.println("Turma Cadastrada com Sucesso");
		} else {
			RendimentoException e;
			e = new RendimentoException();
			throw e;
		}
	}

	public void removerRendimento(String nomeAluno) {
		
		Rendimentos.removerRendimento(nomeAluno);
		RepositorioRendimentoArray.getInstance().salvarArquivo();
	}

	public Rendimento procurarRendimento(String nomeAluno) {

		if (nomeAluno != null || nomeAluno !="") {

			RepositorioRendimentoArray.getInstance();
			Rendimentos.procurarRendimento(nomeAluno);

		}

		return Rendimentos.procurarRendimento(nomeAluno);
	}

	public Rendimento[] listarRendimento() {
		RepositorioRendimentoArray.getInstance();
		Rendimentos.listarRendimento();
		return Rendimentos.listarRendimento();
	}

}
