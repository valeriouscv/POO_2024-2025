package aula13;

import javax.swing.JOptionPane;

public class Ex01 {

	public static void main(String[] args) {
		//mensagem simples
		//JOptionPane.showMessageDialog(null, "Ottu Sabura");
		
		//mensagem detalhada
		//JOptionPane.showMessageDialog(null,"Sabura","POO - Caixa de Dialogo",JOptionPane.QUESTION_MESSAGE);
		
		//pedir informacao ao utilizador
		String nome = JOptionPane.showInputDialog("Quem és tu?");
		System.out.println("Nome: "+nome);
	}

}
