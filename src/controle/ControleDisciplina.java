package controle;
import excecoes.DisciplinaException;
import negocio.Disciplina;
import repositorio.RepositorioDisciplina;
import repositorio.RepositorioDisciplinaArray;

public class ControleDisciplina {

	RepositorioDisciplina Disciplinas = RepositorioDisciplinaArray.getInstance();

	public void adicionarTurma(Disciplina a) throws DisciplinaException {
		if (a.getId() != 0) {
		
			Disciplinas.adicionarDisciplina(a);
			RepositorioDisciplinaArray.getInstance().salvarArquivo();
			System.out.println("Turma Cadastrada com Sucesso");
		} else {
			DisciplinaException e;
			e = new DisciplinaException();
			throw e;
		}
	}

	public void removerDisciplina(int id) {
		
		Disciplinas.removerDisciplina(id);
		RepositorioDisciplinaArray.getInstance().salvarArquivo();
	}

	public Disciplina procurarDisciplina(int id) {

		if (id != 0) {

			RepositorioDisciplinaArray.getInstance();
			Disciplinas.procurarDisciplina(id);

		}

		return Disciplinas.procurarDisciplina(id);
	}

	public Disciplina[] listarTurma() {
		RepositorioDisciplinaArray.getInstance();
		Disciplinas.listarDisciplina();
		return Disciplinas.listarDisciplina();
	}

}
