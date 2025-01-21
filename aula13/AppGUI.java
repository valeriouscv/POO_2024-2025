package aula13;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class AppGUI extends JFrame{
	
	public AppGUI() {
		//definições iniciais
		setVisible(true); //a minha janela passa a ser visivel
		setSize(600, 200);//tamanho da janela
		setLocationRelativeTo(null); //janela fica centralizada
		setTitle("POO - SWING - Nome");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //para fechar a janela quando sair
		
		//componentes
		JTextField txtNome = new JTextField(20);
		JButton    btOk    = new JButton("OK");
		//contentor
		JPanel     painel  = new JPanel();
		
		//colocar um evento dentro do meu botao
		btOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String texto = txtNome.getText();
				if(texto.trim().length() == 0) {
					JOptionPane.showMessageDialog(null, "Preencha primeiro o nome");
				}else {
					JOptionPane.showMessageDialog(null, "Olá, "+texto+". Tudo bem contigo?");
				}
				
				
			}
		});
		
		//colocar componentes no contentor
		painel.add(btOk);
		painel.add(txtNome);
		//colocar o painel na janela
		add(painel);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {		
			@Override
			public void run() {
				AppGUI jan = new AppGUI();
			}
		});
	}

}
