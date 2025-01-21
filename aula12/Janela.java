import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Janela extends JFrame{
    public Janela(){
        setSize(600,300);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lblTexto = new JLabel("0");
        JButton btIncr = new JButton("Incrementar");
        JButton btDecr = new JButton("Decrementar");
        JButton btRein = new JButton("Reiniciar");

        //adicionar eventos ao botao
        btIncr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                String txt = lblTexto.getText();
                int num = Integer.parseInt(txt);
                num++;
                lblTexto.setText(""+num);
            }
            
        });
        JPanel painel = new JPanel();
        //adicionar os componentes ao painel
        painel.add(lblTexto);
        painel.add(btIncr);
        painel.add(btDecr);
        painel.add(btRein);

        //adicionar o painel a janela
        add(painel);
    }
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
              new Janela();
            }
        });
    }
}