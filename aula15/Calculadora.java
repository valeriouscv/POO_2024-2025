package aula15;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame{
	
	public Calculadora(){
		setTitle("Flow Layout");
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(350, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel painelPrincipal = new JPanel(new BorderLayout());
		JPanel painelCentro    = new JPanel(new GridLayout(4, 4));
		JPanel painelNorte     = new JPanel(new FlowLayout());
		
		JTextField txtRes          = new JTextField(15);
		txtRes.setEditable(false);
		txtRes.setFont(new Font("Arial", Font.ITALIC, 20));
		txtRes.setText("Sabura");
		painelNorte.add(txtRes);
		
		painelPrincipal.add(painelNorte,BorderLayout.NORTH);
		painelPrincipal.add(painelCentro,BorderLayout.CENTER);
		
		JButton []botoes = new JButton[16];
		for(int i=0; i<16; i++) {
			botoes[i] = new JButton("Botão "+(i+1));
			painelCentro.add(botoes[i]);
		}
		add(painelPrincipal);
	}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {	
			@Override
			public void run() {
				Calculadora jan = new Calculadora();
				
			}
		});

	}

}
