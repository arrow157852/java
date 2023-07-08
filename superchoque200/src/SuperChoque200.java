import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SuperChoque200 {

    public SuperChoque200() {
        JFrame frame = new JFrame();
        JButton botao = new JButton("Clique Aqui");
        

        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Botão clicado!");
            }
        });

        frame.getContentPane().add(botao);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 100);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SuperChoque200();
    }
}



