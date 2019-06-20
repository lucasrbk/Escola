package repositorio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import negocio.Disciplina;

public class RepositorioDisciplinaArray implements RepositorioDisciplina, Serializable{
	private static final long serialVersionUID = 1L;
	private Disciplina[] disciplinas;
	private int indice;
	private final static int TAMANHO = 100;
	private static RepositorioDisciplinaArray instance;

	public static RepositorioDisciplinaArray getInstance() {
		if (instance == null) {
			instance = lerDoArquivo();
		}
		return instance;
	}
	
	public RepositorioDisciplinaArray() {
		this.disciplinas = new Disciplina[TAMANHO];
		this.indice = 0;

	}
	public void adicionarDisciplina(Disciplina disciplina) {
		this.disciplinas[indice] = disciplina;
		this.indice = this.indice + 1;

	}
	
	
	public void removerDisciplina(String nome) {
		for (int i = 0; i < indice; i++) {
			if (disciplinas[i].getNome().equals(nome)) {
				disciplinas[i] = null;
				indice--;
				System.out.println("removeu na posição" + i);

				for (int j = 0; j < indice; j++) {
					System.out.println("chegou no 2 for");
					if (disciplinas[j] == null) {
						if (disciplinas[j + 1] != null) {
							disciplinas[j] = disciplinas[j + 1];
						}
						System.out.println("chegou no ao fim do for");

					}
				}

			}

		}
	}

	
	public Disciplina[] listarDisciplina() {
		for (int i = 0; i < indice; i++) {
			disciplinas[i].toString();
		}
		return disciplinas;
	}

	
	public Disciplina procurarDisciplina(String nome) {
		Disciplina a = null;
		for (int i = 0; i < indice; i++) {
			if (disciplinas[i].getNome().equals(nome)) {
				disciplinas[i].toString();
				return disciplinas[i];
			} else
				a = null;

		}

		return a;
	}

	//seção do arquivo
	private static RepositorioDisciplinaArray lerDoArquivo() {
		RepositorioDisciplinaArray instanciaLocal = null;

		File in = new File("disciplina.dat");
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(in);
			ois = new ObjectInputStream(fis);
			Object o = ois.readObject();
			instanciaLocal = (RepositorioDisciplinaArray) o;
		} catch (Exception e) {
			instanciaLocal = new RepositorioDisciplinaArray();
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
		File out = new File("disciplina.dat");
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
	


