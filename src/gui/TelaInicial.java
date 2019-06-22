package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import guiProfessor.TelaProfessor;

public class TelaInicial extends JFrame {

	private JPanel contentPane;
	
	private static JFrame telaInicialinstance;

	public static JFrame getInstance() {
		if (TelaInicial.telaInicialinstance == null)
			TelaInicial.telaInicialinstance = new TelaInicial();

		return TelaInicial.telaInicialinstance;

	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
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
	public TelaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JButton btnProfessores = new JButton("Professores");
		panel.add(btnProfessores);
		btnProfessores.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
				TelaProfessor.getInstance().setVisible(true);
			}
			
		});
		
		JButton btnAlunos = new JButton("Alunos");
		panel.add(btnAlunos);
		
		JButton btnAdministrao = new JButton("Administra\u00E7\u00E3o");
		panel.add(btnAdministrao);
		
		JButton btnSair = new JButton("Sair");
		panel.add(btnSair);
	}

}
