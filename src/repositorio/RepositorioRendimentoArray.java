package repositorio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import negocio.Rendimento;

public class RepositorioRendimentoArray implements RepositorioRendimento, Serializable{
	
		private static final long serialVersionUID = 1L;
		private Rendimento[] rendimentos;
		private int indice;
		private final static int TAMANHO = 100;
		private static RepositorioRendimentoArray instance;

		public static RepositorioRendimentoArray getInstance() {
			if (instance == null) {
				instance = lerDoArquivo();
			}
			return instance;
		}
		
		public RepositorioRendimentoArray() {
			this.rendimentos = new Rendimento[TAMANHO];
			this.indice = 0;

		}
		public void adicionarRendimento(Rendimento rendimento) {
			this.rendimentos[indice] = rendimento;
			this.indice = this.indice + 1;

		}
		
		
		public void removerRendimento(String nomeAluno) {
			for (int i = 0; i < indice; i++) {
				if (rendimentos[i].getAluno().getNome().equals(nomeAluno)) {
					rendimentos[i] = null;
					indice--;
					System.out.println("removeu na posição" + i);

					for (int j = 0; j < indice; j++) {
						System.out.println("chegou no 2 for");
						if (rendimentos[j] == null) {
							if (rendimentos[j + 1] != null) {
								rendimentos[j] = rendimentos[j + 1];
							}
							System.out.println("chegou no ao fim do for");

						}
					}

				}

			}
		}

		
		public Rendimento[] listarRendimento() {
			for (int i = 0; i < indice; i++) {
				rendimentos[i].toString();
			}
			return rendimentos;
		}

		
		public Rendimento procurarRendimento(String nomeAluno) {
			Rendimento a = null;
			for (int i = 0; i < indice; i++) {
				if (rendimentos[i].getAluno().getNome().equals(nomeAluno)) {
					rendimentos[i].toString();
					return rendimentos[i];
				} else
					a = null;

			}

			return a;
		}

		//seção do arquivo
		private static RepositorioRendimentoArray lerDoArquivo() {
			RepositorioRendimentoArray instanciaLocal = null;

			File in = new File("rendimento.dat");
			FileInputStream fis = null;
			ObjectInputStream ois = null;
			try {
				fis = new FileInputStream(in);
				ois = new ObjectInputStream(fis);
				Object o = ois.readObject();
				instanciaLocal = (RepositorioRendimentoArray) o;
			} catch (Exception e) {
				instanciaLocal = new RepositorioRendimentoArray();
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
			File out = new File("redimento.dat");
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
		




