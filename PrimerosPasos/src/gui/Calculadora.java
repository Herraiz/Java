package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        // pack(); // hace que el contenedor se adapte al tamaño de los componentes
    }
}

class PanelCalculadora extends JPanel {

    private final JPanel buttons;
    private final JButton screen;
    private boolean starter;

    public PanelCalculadora(){
        starter = true;

        setLayout(new BorderLayout());
        screen = new JButton("0");
        screen.setEnabled(false);
        add(screen, BorderLayout.NORTH);

        /* Crearemos el panel de los botones dentro del mismo panel calculadora */
        buttons = new JPanel();
        buttons.setLayout(new GridLayout(4, 4));

        ActionListener insert = new InsertNumber();

        createButton("7", insert);
        createButton("8", insert);
        createButton("9", insert);
//        createButton("/", insert);

        createButton("4", insert);
        createButton("5", insert);
        createButton("6", insert);
//        createButton("*", insert);

        createButton("1", insert);
        createButton("2", insert);
        createButton("3", insert);
//        createButton("-", insert);

        createButton("0", insert);
        createButton(".", insert);
//        createButton("=", insert);
//        createButton("+", insert);


        add(buttons, BorderLayout.CENTER);
    }

        private void createButton(String text, ActionListener listener) {
            JButton button = new JButton(text);
            button.addActionListener(listener);
            buttons.add(button);

        }

        private class InsertNumber implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                String input = e.getActionCommand();

                if (starter) {  // borrará el 0 cuando empecemos a calcular
                    screen.setText("");
                    starter = false;
                }

                screen.setText(screen.getText() + input);
            }
        }


}