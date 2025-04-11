package contadordeclicks;
import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        Interface Interface = new Interface();
        Interface.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Interface.setSize(200, 75);
        Interface.setVisible(true);
        
    }
}