package gui;

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

import javax.swing.JPasswordField;

public class TelaLoginProfessor extends JFrame {

	private JPanel contentPane;
	private JTextField usuario;
	private static JFrame telaLogininstance;
	private JPasswordField txtSenha;

	public static JFrame getInstance() {
		if (TelaLoginProfessor.telaLogininstance == null)
			TelaLoginProfessor.telaLogininstance = new TelaLoginProfessor();

		return TelaLoginProfessor.telaLogininstance;

	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLoginProfessor frame = new TelaLoginProfessor();
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
	public TelaLoginProfessor() {
		setTitle("Escola");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 353, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel Escola = new JLabel("Escola");
		Escola.setFont(new Font("Tahoma", Font.BOLD, 29));
		Escola.setBounds(61, 11, 214, 36);
		contentPane.add(Escola);

		JLabel lblCpf = new JLabel("Usuario:");
		lblCpf.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCpf.setBounds(50, 105, 81, 36);
		contentPane.add(lblCpf);

		usuario = new JTextField();
		usuario.setBounds(110, 112, 176, 26);
		contentPane.add(usuario);
		usuario.setColumns(10);

		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSenha.setBounds(50, 152, 51, 26);
		contentPane.add(lblSenha);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (usuario.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Digite o cpf do funcionario.");
				} else {

					Professor achouFuncionario = Fachada.getInstance().procurarProfessor(usuario.getText());
					Funcionario[] listaFuncionario = Fachada.getInstance().listarFuncionario();
					if (achouFuncionario == null) {

						if ((usuario.getText().equals("admin") && txtSenha.getText().equals("admin"))) {
							setVisible(false);
							TelaInicial.getInstance().setVisible(true);
						} else {
							JOptionPane.showMessageDialog(null, "Funcionário não existe.");
						}
					} else {
						if (achouFuncionario.getCpf().equals(usuario.getText())
								&& achouFuncionario.getSenha().equals(txtSenha.getText())
								&& achouFuncionario.getCargo().toString().equals(("Gerente"))) {

							TelaPrincipal.getInstance().setVisible(true);
							setVisible(false);

						} else if (achouFuncionario.getCargo().toString().equals("Vendedor")) {
							TelaPrincipalVendedor.getInstance().setVisible(true);
							setVisible(false);
						}
					}

				}

			}

		});
		btnEntrar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnEntrar.setBounds(61, 209, 111, 23);
		contentPane.add(btnEntrar);

		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtSenha.setText("");
				txtCpf.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnReset.setBounds(186, 209, 100, 25);
		contentPane.add(btnReset);

		txtSenha = new JPasswordField();
		txtSenha.setBounds(110, 152, 176, 26);
		contentPane.add(txtSenha);
	}
}