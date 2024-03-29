package guiProfessor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import gui.TelaInicial;
import javax.swing.JButton;

public class TelaProfessor extends JFrame {

	private JPanel contentPane;

	private static JFrame TelaProfessorinstance;

	public static JFrame getInstance() {
		if (TelaProfessor.TelaProfessorinstance == null)
			TelaProfessor.TelaProfessorinstance = new TelaProfessor();

		return TelaProfessor.TelaProfessorinstance;

	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaProfessor frame = new TelaProfessor();
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
	public TelaProfessor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JButton btnLogar = new JButton("Logar");
		panel.add(btnLogar);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		panel.add(btnCadastrar);
		
		JButton btnSair = new JButton("Sair");
		panel.add(btnSair);
	}

}
