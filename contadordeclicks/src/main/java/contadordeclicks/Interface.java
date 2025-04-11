package contadordeclicks;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class Interface extends JFrame {
    // contador a ser incrementado a cada click
    private int qtd = 0;
    // variavel que exibirá a mensagem na barra
    private String quantidade;
    // barra que ficará no canto inferior da tela 
    private final JLabel barra; 

    // construtor
    public Interface()
    {
        // titulo da janela
        super("Contador de cliques do mouse");
        // define barra como JLabel e define o texto que ficará até o primeiro clique
        barra = new JLabel("Clique!");
        // adiciona a barra ao canto inferior da tela
        add(barra, BorderLayout.SOUTH);
        // adiciona um mouselistener
        addMouseListener(new MouseClickHandler());
    }

    // classe que extende mouseadapter para tratar o evento
    private class MouseClickHandler extends MouseAdapter
    {
        // sobreescreve mouseClicked
        @Override
        public void mouseClicked(MouseEvent event)
        {
            // incrementa o contador quando o evento ocorre
            qtd++;
            // altera a string para atualizar o contador
            quantidade = String.format("Clicou %d vezes", qtd);
            // altera o texto da JLabel barra
            barra.setText(quantidade);
        }
    }
}
