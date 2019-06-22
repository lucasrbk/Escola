package repositorio;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
	import java.io.Serializable;

import negocio.Turma;

	public class RepositorioTurmaArray implements RepositorioTurma, Serializable{
		
			private static final long serialVersionUID = 1L;
			private Turma[] turmas;
			private int indice;
			private final static int TAMANHO = 100;
			private static RepositorioTurmaArray instance;

			public static RepositorioTurmaArray getInstance() {
				if (instance == null) {
					instance = lerDoArquivo();
				}
				return instance;
			}
			
			public RepositorioTurmaArray() {
				this.turmas = new Turma[TAMANHO];
				this.indice = 0;

			}
			public void adicionarTurma(Turma turma) {
				this.turmas[indice] = turma;
				this.indice = this.indice + 1;

			}
			
			
			public void removerTurma(int id) {
				for (int i = 0; i < indice; i++) {
					if (turmas[i].getId() == id) {
						turmas[i] = null;
						indice--;
						System.out.println("removeu na posição" + i);

						for (int j = 0; j < indice; j++) {
							System.out.println("chegou no 2 for");
							if (turmas[j] == null) {
								if (turmas[j + 1] != null) {
									turmas[j] = turmas[j + 1];
								}
								System.out.println("chegou no ao fim do for");

							}
						}

					}

				}
			}

			
			public Turma[] listarTurma() {
				for (int i = 0; i < indice; i++) {
					turmas[i].toString();
				}
				return turmas;
			}

			
			public Turma procurarTurma(int id) {
				Turma a = null;
				for (int i = 0; i < indice; i++) {
					if (turmas[i].getId() == id) {
						turmas[i].toString();
						return turmas[i];
					} else
						a = null;

				}

				return a;
			}

			//seção do arquivo
			private static RepositorioTurmaArray lerDoArquivo() {
				RepositorioTurmaArray instanciaLocal = null;

				File in = new File("turma.dat");
				FileInputStream fis = null;
				ObjectInputStream ois = null;
				try {
					fis = new FileInputStream(in);
					ois = new ObjectInputStream(fis);
					Object o = ois.readObject();
					instanciaLocal = (RepositorioTurmaArray) o;
				} catch (Exception e) {
					instanciaLocal = new RepositorioTurmaArray();
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
				File out = new File("turma.dat");
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
			






