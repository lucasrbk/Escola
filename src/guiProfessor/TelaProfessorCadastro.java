package guiProfessor;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import gui.TelaInicial;
import negocio.Fachada;
import negocio.Professor;


public class TelaProfessorCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField nome;
	private JTextField cargo;
	private JTextField nascimento;
	private JTextField id;
	private JTextField usuario;
	private JTextField senha;
	private static JFrame TelaProfessorCadastroinstance;
	Professor professor = new Professor();

	public static JFrame getInstance() {
		if (TelaProfessorCadastro.TelaProfessorCadastroinstance == null)
			TelaProfessorCadastro.TelaProfessorCadastroinstance = new TelaProfessorCadastro();

		return TelaProfessorCadastro.TelaProfessorCadastroinstance;

	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaProfessorCadastro frame = new TelaProfessorCadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaProfessorCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroProfessor = new JLabel("Cadastro professor");
		lblCadastroProfessor.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCadastroProfessor.setBounds(136, 11, 143, 14);
		contentPane.add(lblCadastroProfessor);
		
		JLabel lblNome = new JLabel("Nome :");
		lblNome.setBounds(10, 53, 48, 14);
		contentPane.add(lblNome);
		
		JLabel lblCargo = new JLabel("Cargo :");
		lblCargo.setBounds(10, 78, 48, 14);
		contentPane.add(lblCargo);
		
		JLabel lblDataNascimento = new JLabel("Data nascimento :");
		lblDataNascimento.setBounds(10, 103, 105, 14);
		contentPane.add(lblDataNascimento);
		
		JLabel lblId = new JLabel("Id :");
		lblId.setBounds(10, 128, 48, 14);
		contentPane.add(lblId);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio :");
		lblUsurio.setBounds(10, 153, 48, 14);
		contentPane.add(lblUsurio);
		
		JLabel lblSenha = new JLabel("Senha :");
		lblSenha.setBounds(10, 178, 48, 14);
		contentPane.add(lblSenha);
		
		nome = new JTextField();
		nome.setBounds(56, 50, 190, 20);
		contentPane.add(nome);
		nome.setColumns(10);
		
		cargo = new JTextField();
		cargo.setBounds(56, 78, 190, 20);
		contentPane.add(cargo);
		cargo.setColumns(10);
		
		nascimento = new JTextField();
		nascimento.setBounds(124, 100, 122, 20);
		contentPane.add(nascimento);
		nascimento.setColumns(10);
		
		id = new JTextField();
		id.setBounds(56, 125, 190, 20);
		contentPane.add(id);
		id.setColumns(10);
		
		usuario = new JTextField();
		usuario.setBounds(56, 150, 190, 20);
		contentPane.add(usuario);
		usuario.setColumns(10);
		
		senha = new JTextField();
		senha.setBounds(56, 178, 190, 20);
		contentPane.add(senha);
		senha.setColumns(10);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				professor = new Professor(nome.getText(),cargo.getText(),nascimento.getText(),id.getText(),usuario.getText(),senha.getText());
				try {
					Professor f;
					f = Fachada.getInstance().procurarProfessor(nome.getText());
					if (f == null) {
						Fachada.getInstance().adicionarProfessor(professor);
						// RepositorioFuncionarioArray.getInstance().salvarArquivo();
						JOptionPane.showMessageDialog(null, "Funcionário adicionado ao repositorio com sucesso");
						nome.setText("");
						dispose();
						TelaInicial.getInstance().setVisible(true);
					}else {
						JOptionPane.showMessageDialog(null, "Funcionário com Esse CPF já foi Adicionado ao repositorio");
					}
						
				} catch (CpfInvalidoException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnNewButton.setBounds(76, 227, 104, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(190, 227, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
