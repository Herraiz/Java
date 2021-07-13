package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaTexto {

    public static void main(String[] args) {

        MarcoTexto myFrame = new MarcoTexto();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MarcoTexto extends JFrame {

    public MarcoTexto() {
        setBounds(600, 300, 600, 350);
        PanelTexto myPanel = new PanelTexto();
        add(myPanel);
        setVisible(true);

    }

}

class PanelTexto extends JPanel {

    private final JTextField field1;
    private final JLabel result;

    public PanelTexto() {

        setLayout(new BorderLayout());
        JPanel subPanel = new JPanel();
        subPanel.setLayout(new FlowLayout());

        result = new JLabel();
        result.setHorizontalAlignment(JLabel.CENTER);
        add(result, BorderLayout.CENTER);

        JLabel text1 = new JLabel("Email:");
        subPanel.add(text1);

        field1 = new JTextField(20);
        subPanel.add(field1);


        JButton myButton = new JButton("Comprobar");

        DameTexto myEvent = new DameTexto();
        myButton.addActionListener(myEvent);
        subPanel.add(myButton);

        add(subPanel, BorderLayout.NORTH);
    }

    private class DameTexto implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            int correct = 0;
            String email = field1.getText().trim();

            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') {
                    correct++;
                }
            }

            if (correct != 1) {
                System.out.println("Email incorrecto");
                result.setText("Incorrecto");
            } else {
                System.out.println("Email correcto");
                result.setText("Correcto");
            }

        }
    }


}