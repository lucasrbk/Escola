package gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class TelaIncial extends JFrame {

	private JPanel contentPane;
	private static JFrame telaPrincipalinstance;

	public static JFrame getInstance() {
		if (TelaIncial.telaPrincipalinstance == null)
			TelaIncial.telaPrincipalinstance = new TelaIncial();

		return TelaIncial.telaPrincipalinstance;

	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaIncial frame = new TelaIncial();
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
	public TelaIncial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 416, 300);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenuProfessores = new JMenu("Professores");
		mnNewMenuProfessores.setFont(new Font("Tahoma", Font.BOLD, 18));
		menuBar.add(mnNewMenuProfessores);

		JMenuItem mntmInserirPizza = new JMenuItem("Login");
		mntmInserirPizza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//TelaCadastroPizza.getInstance().setVisible(true);
			}
		});
		mnNewMenuProfessores.add(mntmInserirPizza);

		JMenuItem mntmInserirRefrigerante = new JMenuItem("Inserir Refrigerante");
		mntmInserirRefrigerante.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//TelaCadastroRefrigerante.getInstance().setVisible(true);
			}
		});
		mnNewMenuProfessores.add(mntmInserirRefrigerante);

		JMenuItem mntmProcurar = new JMenuItem("Procurar");
		mntmProcurar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//TelaProcurarProduto.getInstance().setVisible(true);
			}
		});
		mnNewMenuProfessores.add(mntmProcurar);

		JMenuItem mntmListarTodos = new JMenuItem("Listar Todos");
		mntmListarTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//TelaListarProdutos.getInstance().setVisible(true);
			}
		});
		mnNewMenuProfessores.add(mntmListarTodos);

		JMenuItem mntmRemover = new JMenuItem("Remover");
		mntmRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//TelaRemocaoProduto.getInstance().setVisible(true);
			}
		});
		mnNewMenuProfessores.add(mntmRemover);

		JMenu mnNewMenuPedidos = new JMenu("Alunos");
		mnNewMenuPedidos.setFont(new Font("Tahoma", Font.BOLD, 18));
		menuBar.add(mnNewMenuPedidos);

		JMenuItem mntmCadastrar = new JMenuItem("Cadastrar");
		mntmCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//TelaCadastrarPedido.getInstance().setVisible(true);
			}
		});
		mnNewMenuPedidos.add(mntmCadastrar);

		JMenuItem mntmProcurar_1 = new JMenuItem("Procurar");
		mntmProcurar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//TelaProcurarPedido.getInstance().setVisible(true);
			}
		});
		
		JMenuItem mntmListarPedidosEm = new JMenuItem("Listar Pedidos em Aberto");
		mntmListarPedidosEm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//TelaListarPedidosAberto.getInstance().setVisible(true);
			}
		});
		mnNewMenuPedidos.add(mntmListarPedidosEm);
		mnNewMenuPedidos.add(mntmProcurar_1);

		JMenuItem mntmListarPedidos = new JMenuItem("Listar Todos Pedidos");
		mntmListarPedidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//TelaListarTodosPedido.getInstance().setVisible(true);
			}
		});
		mnNewMenuPedidos.add(mntmListarPedidos);

		JMenuItem mntmCancelar = new JMenuItem("Cancelar");
		mntmCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//TelaRemocaoPedido.getInstance().setVisible(true);
			}
		});
		mnNewMenuPedidos.add(mntmCancelar);

		JMenu mnNewFuncionarios = new JMenu("Administração");
		mnNewFuncionarios.setFont(new Font("Tahoma", Font.BOLD, 18));
		menuBar.add(mnNewFuncionarios);

		JMenuItem mntmAdicionar = new JMenuItem("Adicionar");
		mntmAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//TelaCadastroFuncionario.getInstance().setVisible(true);
			}
		});
		mnNewFuncionarios.add(mntmAdicionar);

		JMenuItem mntmProcurar_2 = new JMenuItem("Procurar");
		mntmProcurar_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//TelaProcurarFuncionarios.getInstance().setVisible(true);
			}
		});
		mnNewFuncionarios.add(mntmProcurar_2);

		JMenuItem mntmListarFuncionrios = new JMenuItem("Listar Funcion\u00E1rios");
		mntmListarFuncionrios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//TelaListarFuncionarios.getInstance().setVisible(true);
			}
		});
		mnNewFuncionarios.add(mntmListarFuncionrios);

		JMenuItem mntmAlterarSenha = new JMenuItem("Alterar Senha");
		mntmAlterarSenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//TelaAlterarSenhaFuncionario.getInstance().setVisible(true);
			}
		});
		mnNewFuncionarios.add(mntmAlterarSenha);

		JMenuItem mntmRemover_1 = new JMenuItem("Remover");
		mntmRemover_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//TelaRemocaoFuncionario.getInstance().setVisible(true);
			}
		});
		mnNewFuncionarios.add(mntmRemover_1);
		
		JMenuItem mntmSair = new JMenuItem("Sair");
		mntmSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				//TelaLogin.getInstance().setVisible(true);
			}
		});
		mntmSair.setFont(new Font("Tahoma", Font.BOLD, 18));
		menuBar.add(mntmSair);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
