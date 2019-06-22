package controle;
import excecoes.TurmaException;
import negocio.Turma;
import repositorio.RepositorioTurma;
import repositorio.RepositorioTurmaArray;

public class ControleTurma {

	RepositorioTurma Turmas = RepositorioTurmaArray.getInstance();

	public void adicionarTurma(Turma a) throws TurmaException {
		if (a.getId() != 0) {
		
			Turmas.adicionarTurma(a);
			RepositorioTurmaArray.getInstance().salvarArquivo();
			System.out.println("Turma Cadastrada com Sucesso");
		} else {
			TurmaException e;
			e = new TurmaException();
			throw e;
		}
	}

	public void removerTurma(int id) {
		
		Turmas.removerTurma(id);
		RepositorioTurmaArray.getInstance().salvarArquivo();
	}

	public Turma procurarTurma(int id) {

		if (id != 0) {

			RepositorioTurmaArray.getInstance();
			Turmas.procurarTurma(id);

		}

		return Turmas.procurarTurma(id);
	}

	public Turma[] listarTurma() {
		RepositorioTurmaArray.getInstance();
		Turmas.listarTurma();
		return Turmas.listarTurma();
	}

}
