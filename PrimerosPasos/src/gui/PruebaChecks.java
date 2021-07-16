package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaChecks {

    public static void main(String[] args) {

        MarcoChecks myFrame = new MarcoChecks();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MarcoChecks extends JFrame {

    public MarcoChecks() {
        setBounds(600, 300, 550, 350);
        PanelChecks myPanel = new PanelChecks();
        add(myPanel);
        setVisible(true);

    }

}

class PanelChecks extends JPanel {

    private JLabel text;
    private JCheckBox bold;
    private JCheckBox italic;


    public PanelChecks() {
        setLayout(new BorderLayout());
        Font serif = new Font("Serif", Font.PLAIN, 24);
        text = new JLabel("En un lugar de la Mancha de cuyo nombre ...");
        text.setFont(serif);

        JPanel textPanel = new JPanel();
        textPanel.add(text);
        add(textPanel, BorderLayout.CENTER);

        bold = new JCheckBox("Negrita");
        italic = new JCheckBox("Cursiva");

        bold.addActionListener(new ManejaChecks());
        italic.addActionListener(new ManejaChecks());

        JPanel checksPanel = new JPanel();
        checksPanel.add(bold);
        checksPanel.add(italic);
        add(checksPanel, BorderLayout.SOUTH);

    }

    private class ManejaChecks implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {

            int type = 0;

            /* Un poco tricky, Font.BOLD vale 1 y Font.ITALIC vale 2. Usamos type para calcular el tipo de letra final */

            if (bold.isSelected()) type+= Font.BOLD;

            if (italic.isSelected()) type+= Font.ITALIC;

            text.setFont(new Font("Serif", type, 24));

        }
    }
}
