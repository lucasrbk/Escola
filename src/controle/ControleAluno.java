package controle;

import excecoes.AlunoException;
import negocio.Aluno;
import repositorio.RepositorioAluno;
import repositorio.RepositorioAlunoArray;

public class ControleAluno {

	RepositorioAluno alunos = RepositorioAlunoArray.getInstance();

	public void adicionarAluno(Aluno a) throws AlunoException {
		if (a.getNome() != null & a.getNome() != "") {
		
			alunos.adicionarAluno(a);
			RepositorioAlunoArray.getInstance().salvarArquivo();
			System.out.println("Aluno Cadastrado com Sucesso");
		} else {
			AlunoException e;
			e = new AlunoException();
			throw e;
		}
	}

	public void removerAluno(String nome) {
		
		alunos.removerAluno(nome);
		RepositorioAlunoArray.getInstance().salvarArquivo();
	}

	public Aluno procurarAluno(String nome) {

		if (nome != null & nome != "") {

			RepositorioAlunoArray.getInstance();
			alunos.procurarAluno(nome);

		}

		return alunos.procurarAluno(nome);
	}

	public void alterarSenhaAluno(String senha, String a) {
		RepositorioAlunoArray.getInstance();
		alunos.alterarSenhaAluno(senha, a);
		RepositorioAlunoArray.getInstance().salvarArquivo();
	}

	public Aluno[] listarAluno() {
		RepositorioAlunoArray.getInstance();
		alunos.listarAluno();
		return alunos.listarAluno();
	}

}
