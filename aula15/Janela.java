package aula15;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Janela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout());
		
		JLabel lblNewLabel = new JLabel("Username: ");
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		contentPane.add(textField,"wrap");
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password: ");
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		contentPane.add(textField_1, "wrap");
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Entrar");
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		contentPane.add(btnNewButton_1);
		
		
	}

}
