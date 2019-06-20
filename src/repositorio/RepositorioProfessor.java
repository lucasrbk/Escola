package repositorio;

import negocio.Professor;

public interface RepositorioProfessor {
	public void adicionarProfessor(Professor a);
	public void removerProfessor(String nome);
	public Professor procurarProfessor(String nome);
	public void alterarSenhaProfessor(String senha,String usuario);
	public Professor[] listarProfessor();
	
}
