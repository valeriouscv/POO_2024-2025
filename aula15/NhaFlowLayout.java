package aula15;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class NhaFlowLayout extends JFrame{
	
	public NhaFlowLayout() {
		setTitle("Flow Layout");
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//FlowLayout fl = new FlowLayout();
		//JPanel painel = new JPanel();
		//painel.setLayout(fl);
		//painel.setLayout(new FlowLayout());
		JPanel painel = new JPanel();
		JPanel painel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel painel2 = new JPanel(new FlowLayout(FlowLayout.RIGHT,20,20));
		painel.add(painel1); //adicionar o painel na Janela
		painel.add(painel2); //adicionar o painel na Janela
		add(painel);
		
		JButton bt01 = new JButton("Botom 01");
		JButton bt02 = new JButton("Botom 02");
		JButton bt03 = new JButton("Botom 03");
		painel1.add(bt01);
		painel1.add(bt02);
		painel2.add(bt03);
		
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {	
			@Override
			public void run() {
				NhaFlowLayout jan = new NhaFlowLayout();
				
			}
		});

	}

}
