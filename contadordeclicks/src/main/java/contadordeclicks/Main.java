package contadordeclicks;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        Interface Interface = new Interface();

        // define que o programa se encerrará ao apertar em fechar
        Interface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // define a altura e a largura da janela
        Interface.setSize(200, 75);
        // define a visibilidade
        Interface.setVisible(true);
        
    }
}