package contadordeclicks;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
public class Interface extends JFrame {
    private int qtd = 0;
    private String quantidade;
    private final JLabel barra; 

    public Interface()
    {
        super("Contador de cliques do mouse");
        barra = new JLabel("Clique!");
        add(barra, BorderLayout.SOUTH);
        addMouseListener(new MouseClickHandler());
    }

    private class MouseCLickHandler extends MouseAdapter
    {
        @Override
        public void mouseClicked(MouseEvent event)
        {
            qtd++;
            quantidade = String.format("Clicou %d vezes", qtd);
            barra.setText(quantidade);
        }
    }
}
