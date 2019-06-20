package repositorio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import negocio.Professor;

public class RepositorioProfessorArray {
	private static final long serialVersionUID = 1L;
	private Professor[] professores;
	private int indice;
	private final static int TAMANHO = 100;
	private static RepositorioProfessorArray instance;

	public static RepositorioProfessorArray getInstance() {
		if (instance == null) {
			instance = lerDoArquivo();
		}
		return instance;
	}
	
	public RepositorioProfessorArray() {
		this.professores = new Professor[TAMANHO];
		this.indice = 0;

	}
	
	public void adicionarProfessor(Professor professor) {
		this.professores[indice] = professor;
		this.indice = this.indice + 1;

	}
	
	
	public void removerProfessor(String nome) {
		for (int i = 0; i < indice; i++) {
			if (professores[i].getNome().equals(nome)) {
				professores[i] = null;
				indice--;
				System.out.println("removeu na posição" + i);

				for (int j = 0; j < indice; j++) {
					System.out.println("chegou no 2 for");
					if (professores[j] == null) {
						if (professores[j + 1] != null) {
							professores[j] = professores[j + 1];
						}
						System.out.println("chegou no ao fim do for");

					}
				}

			}

		}
	}

	
	public Professor[] listarProfessor() {
		for (int i = 0; i < indice; i++) {
			professores[i].toString();
		}
		return professores;
	}

	
	public Professor procurarProfessor(String nome) {
		Professor a = null;
		for (int i = 0; i < indice; i++) {
			if (professores[i].getNome().equals(nome)) {
				professores[i].toString();
			} else
				a = null;

		}

		return a;
	}

	
	public void alterarSenhaProfessor(String senha, String usuario) {
		Professor a = new Professor(indice, usuario, usuario, null, usuario, usuario);
		System.out.println("********");
		a = procurarProfessor(usuario);
		a.setSenha(senha);

	}


//seção arquivo
	private static RepositorioProfessorArray lerDoArquivo() {
		RepositorioProfessorArray instanciaLocal = null;

		File in = new File("professores.dat");
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(in);
			ois = new ObjectInputStream(fis);
			Object o = ois.readObject();
			instanciaLocal = (RepositorioProfessorArray) o;
		} catch (Exception e) {
			instanciaLocal = new RepositorioProfessorArray();
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
		File out = new File("professores.dat");
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
	


