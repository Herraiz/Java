package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaTextArea2 {

    public static void main(String[] args) {

        MarcoArea2 myFrame = new MarcoArea2();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }

}

class MarcoArea2 extends JFrame {

    private final JPanel buttonsPanel;
    private final JButton insertButton, lineBreakButton;
    private final JTextArea textArea;
    private final JScrollPane areaPanel;

    public MarcoArea2() {
        setBounds(600, 300, 500, 350);
        setTitle("Probando Área de texto");
        setLayout(new BorderLayout());

        buttonsPanel = new JPanel();
        insertButton = new JButton("Insertar");

        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("En un lugar de la Mancha, de cuyo nombre no quiero acordarme," +
                        " no ha mucho tiempo que vivía un hidalgo de los de lanza en astillero," +
                        " adarga antigua, rocín flaco y galgo corredor\n");
            }
        });

        buttonsPanel.add(insertButton);

        lineBreakButton = new JButton("Añadir saltos");

        lineBreakButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean jump = !textArea.getLineWrap();
                textArea.setLineWrap(jump);


                /* Sustituido por el operador ternario de más abajo
                if (jump) {
                    lineBreakButton.setText("Quitar saltos");
                } else {
                    lineBreakButton.setText("Añadir saltos");
                }
                */

                lineBreakButton.setText(jump ? "Quitar saltos" : "Añadir saltos" );
            }
        });

        buttonsPanel.add(lineBreakButton);

        add(buttonsPanel, BorderLayout.SOUTH);

        textArea = new JTextArea(8, 20);

        areaPanel = new JScrollPane(textArea);

        add(areaPanel, BorderLayout.CENTER);

    }

}

