package controle;
import repositorio.RepositorioProfessor;
import repositorio.RepositorioProfessorArray;
import negocio.Professor;
import excecoes.ProfessorException;

public class ControleProfessor {

	RepositorioProfessor professores = RepositorioProfessorArray.getInstance();

	public void adicionarProfessor(Professor a) throws ProfessorException {
		if (a.getNome() != null & a.getNome() != "") {
		
			professores.adicionarProfessor(a);
			RepositorioProfessorArray.getInstance().salvarArquivo();
			System.out.println("Professor Cadastrado com Sucesso");
		} else {
			ProfessorException e;
			e = new ProfessorException();
			throw e;
		}
	}

	public void removerProfessor(String nome) {
		
		professores.removerProfessor(nome);
		RepositorioProfessorArray.getInstance().salvarArquivo();
	}

	public Professor procurarProfessor(String nome) {

		if (nome != null & nome != "") {

			RepositorioProfessorArray.getInstance();
			professores.procurarProfessor(nome);

		}

		return professores.procurarProfessor(nome);
	}

	public void alterarSenhaFuncionario(String senha, String a) {
		RepositorioProfessorArray.getInstance();
		professores.alterarSenhaProfessor(senha, a);
		RepositorioProfessorArray.getInstance().salvarArquivo();
	}

	public Professor[] listarProfessor() {
		RepositorioProfessorArray.getInstance();
		professores.listarProfessor();
		return professores.listarProfessor();
	}

}
