package aula14;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class AppMenu extends JFrame{
	public AppMenu() {
		//configuracoes inicias da Janel
		setSize(600, 400);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Menu
		JMenuBar barraMenu 	= new JMenuBar();
		JMenu mFich   		= new JMenu("Ficheiro");
		JMenu mEditar 		= new JMenu("Editar");
		JMenu mVer    		= new JMenu("Ver");
		
		//Criar os meus Itens de Menu
		JMenuItem miAbrir    = new JMenuItem("Abrir");
		JMenuItem miSair     = new JMenuItem("Sair");
		JMenuItem miCopiar   = new JMenuItem("Copiar");
		JMenuItem miColar    = new JMenuItem("Colar");
		JMenuItem miDetalhes = new JMenuItem("Detalhes");
		
		//colocar eventos nos itens de Menus
		miAbrir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ignorado com sucesso!");
				
			}
		});
		
		//colocar os Itens de Menus nos respetivos Menus
		mFich.add(miAbrir);
		mFich.add(miSair);
		mEditar.add(miCopiar);
		mEditar.add(miColar);
		mVer.add(miDetalhes);
		
		//colocar Menu na Barra
		barraMenu.add(mFich);
		barraMenu.add(mEditar);
		barraMenu.add(mVer);
		
		//colocar a Barra na Janela
		setJMenuBar(barraMenu);
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				AppMenu nhaMenu = new AppMenu(); 
			}
		});
	}

}
