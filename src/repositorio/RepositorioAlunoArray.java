package repositorio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


import negocio.Aluno;


public class RepositorioAlunoArray implements RepositorioAluno, Serializable{
	private static final long serialVersionUID = 1L;
	private Aluno[] alunos;
	private int indice;
	private final static int TAMANHO = 100;
	private static RepositorioAlunoArray instance;

	public static RepositorioAlunoArray getInstance() {
		if (instance == null) {
			instance = lerDoArquivo();
		}
		return instance;
	}
	
	public RepositorioAlunoArray() {
		this.alunos = new Aluno[TAMANHO];
		this.indice = 0;

	}
	@Override
	public void adicionarAluno(Aluno aluno) {
		this.alunos[indice] = aluno;
		this.indice = this.indice + 1;

	}
	
	
	public void removerAluno(String nome) {
		for (int i = 0; i < indice; i++) {
			if (alunos[i].getNome().equals(nome)) {
				alunos[i] = null;
				indice--;
				System.out.println("removeu na posição" + i);

				for (int j = 0; j < indice; j++) {
					System.out.println("chegou no 2 for");
					if (alunos[j] == null) {
						if (alunos[j + 1] != null) {
							alunos[j] = alunos[j + 1];
						}
						System.out.println("chegou no ao fim do for");

					}
				}

			}

		}
	}

	
	public Aluno[] listarAluno() {
		for (int i = 0; i < indice; i++) {
			System.out.println(indice + " " + alunos[i].getNome() + " " + alunos[i].getNome());
		}
		return alunos;
	}

	
	public Aluno procurarAluno(String nome) {
		Aluno a = null;
		for (int i = 0; i < indice; i++) {
			if (alunos[i].getNome().equals(nome)) {
				alunos[i].toString();
			} else
				a = null;

		}

		return a;
	}

	
	public void alterarSenhaAluno(String senha, String usuario) {
		Aluno a = new Aluno(indice, usuario, null, indice, usuario, usuario);
		System.out.println("********");
		a = procurarAluno(usuario);
		a.setSenha(senha);

	}


//seção arquivo
	private static RepositorioAlunoArray lerDoArquivo() {
		RepositorioAlunoArray instanciaLocal = null;

		File in = new File("alunos.dat");
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(in);
			ois = new ObjectInputStream(fis);
			Object o = ois.readObject();
			instanciaLocal = (RepositorioAlunoArray) o;
		} catch (Exception e) {
			instanciaLocal = new RepositorioAlunoArray();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {/* Silent exception */
				}
			}
		}

		return instanciaLocal;
	}
	
	public void salvarArquivo() {
		if (instance == null) {
			return;
		}
		File out = new File("alunos.dat");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(out);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(instance);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					/* Silent */}
			}
		}
	}
	
	
}
	


