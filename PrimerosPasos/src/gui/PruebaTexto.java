package gui;

import javax.swing.*;
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

    public PanelTexto() {
        JLabel text1 = new JLabel("Email:");
        add(text1);

        field1 = new JTextField(20);
        add(field1);

        JButton myButton = new JButton("Comprobar");

        DameTexto myEvent = new DameTexto();
        myButton.addActionListener(myEvent);
        add(myButton);
    }

    private class DameTexto implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(field1.getText());
        }
    }


}