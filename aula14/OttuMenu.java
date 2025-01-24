package aula14;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class OttuMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OttuMenu frame = new OttuMenu();
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
	public OttuMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mFich = new JMenu("Ficheiro");
		menuBar.add(mFich);
		
		JMenuItem miAbrir = new JMenuItem("Abrir");
		mFich.add(miAbrir);
		
		JMenuItem miFechar = new JMenuItem("Fechar");
		mFich.add(miFechar);
		
		JMenu mEditar = new JMenu("Editar");
		menuBar.add(mEditar);
		
		JMenuItem miCopiar = new JMenuItem("Copiar");
		mEditar.add(miCopiar);
		
		JMenuItem miColar = new JMenuItem("Colar");
		mEditar.add(miColar);
		
		JMenu mVer = new JMenu("Ver");
		menuBar.add(mVer);
		
		JMenuItem miDetalhes = new JMenuItem("Detalhes");
		mVer.add(miDetalhes);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
	}

}
