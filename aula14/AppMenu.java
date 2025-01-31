package aula14;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class AppMenu extends JFrame {
	public AppMenu(){
		//ArrayList de alunos
		ArrayList  listAlunos = new ArrayList<Aluno>();
		//configuracoes inicias da Janel
		setSize(600, 400);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Menu
		JMenuBar barraMenu 	= new JMenuBar();
		JMenu mFich   		= new JMenu("Ficheiro");
		JMenu mAjuda 		= new JMenu("Ajuda");
		JMenu mVer    		= new JMenu("Ver");
		
		//Criar os meus Itens de Menu
		JMenuItem miAbrir    = new JMenuItem("Abrir");
		miAbrir.setIcon(new ImageIcon("img/abrir.png"));
		JMenuItem miSair     = new JMenuItem("Sair");
		miSair.setIcon(new ImageIcon("img/sair.png"));
		JMenuItem miVerTds   = new JMenuItem("Listar todos os alunos");
		miVerTds.setIcon(new ImageIcon("img/listar.png"));
		miVerTds.setEnabled(false);
		JMenuItem miSobre    = new JMenuItem("Sobre");
		miSobre.setIcon(new ImageIcon("img/sobre.png"));

		//colocar os Itens de Menus nos respetivos Menus
		mFich.add(miAbrir);
		mFich.add(miSair);
		mVer.add(miVerTds);
		mAjuda.add(miSobre);
		
		//colocar Menu na Barra
		barraMenu.add(mFich);
		barraMenu.add(mVer);
		barraMenu.add(mAjuda);
		
		//colocar eventos nos itens de Menus
		//abrir
		miAbrir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser chamar = new JFileChooser(".");
				int res = chamar.showOpenDialog(null);
				if(res == JFileChooser.APPROVE_OPTION) {
					File fich = chamar.getSelectedFile();
					try {
						Scanner ler = new Scanner(fich);
						while(ler.hasNext()) {
							String linha = ler.nextLine();
							String []sep = linha.split(";");
							Aluno aluno = new Aluno(sep[0], sep[1], sep[2], sep[3]);
							listAlunos.add(aluno);
							miVerTds.setEnabled(true);
						}
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
				}
			}
		});
		
		//listar
		miVerTds.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame janela = new JFrame();
				janela.setSize(400,250);
				janela.setVisible(true);
				janela.setLocationRelativeTo(null);
				janela.setDefaultCloseOperation(EXIT_ON_CLOSE);	
				janela.setTitle("Listar Todos os Alunos");
		
				
				String[][] dados = new String[listAlunos.size()][4];
				for(int i=0; i<listAlunos.size();i++) {
					Aluno aluno = (Aluno) listAlunos.get(i);
					dados[i][0]=aluno.getNumero();
					dados[i][1]=aluno.getNome();
					dados[i][2]=aluno.getTelefone();
					dados[i][3]=aluno.getIdade();
				}
	
				
			    String[] colunas = {"Numero", "Nome", "Telefone","Idade"};

				JTable tabela = new JTable(dados, colunas);
				JScrollPane sp = new JScrollPane(tabela);
		        janela.add(sp);
			}
		});
		//colocar na Janela
		setJMenuBar(barraMenu);
		add(new JLabel(new ImageIcon("img/fundo.png")));
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
