package contadordeclicks;
import javax.swing.*;
import java.awt.*;
public class Interface extends JFrame {
    private String quantidade;
    private final JLabel barra; 

    public Interface()
    {
        super("Contador de cliques do mouse");
        barra = new JLabel("Clique!");
        add(barra, BorderLayout.SOUTH);
        addMouseListener(new MouseClickHandler());

    }
}
