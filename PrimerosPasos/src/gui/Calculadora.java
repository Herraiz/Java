package gui;

import javax.swing.*;
import java.awt.*;

public class Calculadora {

    public static void main(String[] args) {
        MarcoCalculadora myFrame = new MarcoCalculadora();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);

    }
}

class MarcoCalculadora extends JFrame {
    public MarcoCalculadora(){
        setTitle("Calculadora");
        setBounds(500, 300, 450, 300);
        PanelCalculadora calculatorPanel = new PanelCalculadora();
        add(calculatorPanel);
    }
}

class PanelCalculadora extends JPanel {

    private final JPanel buttons;

    public PanelCalculadora(){
        setLayout(new BorderLayout());
        JButton screen = new JButton("0");
        screen.setEnabled(false);
        add(screen, BorderLayout.NORTH);

        /* Crearemos el panel de los botones dentro del mismo panel calculadora */
        buttons = new JPanel();
        buttons.setLayout(new GridLayout(4, 4));

        createButton("7");
        createButton("8");
        createButton("9");
        createButton("/");

        createButton("4");
        createButton("5");
        createButton("6");
        createButton("*");

        createButton("1");
        createButton("2");
        createButton("3");
        createButton("-");

        createButton("0");
        createButton(".");
        createButton("=");
        createButton("+");


        add(buttons, BorderLayout.CENTER);
    }

        private void createButton(String text) {
            JButton button = new JButton(text);
            buttons.add(button);
        }


}