package repositorio;

import negocio.Aluno;

public interface RepositorioAluno {

	public void adicionarAluno(Aluno a);
	public void removerAluno(String nome);
	public Aluno procurarAluno(String nome);
	public void alterarSenhaAluno(String senha,String usuario);
	public Aluno[] listarAluno();
	

}