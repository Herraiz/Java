package gui;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class CampoPassword {

    public static void main(String[] args) {

        MarcoPassword myFrame = new MarcoPassword();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MarcoPassword extends JFrame {

    public MarcoPassword() {
        setBounds(600, 300, 550, 400);
        PanelPassword myPanel = new PanelPassword();
        add(myPanel);
        setVisible(true);

    }

}

class PanelPassword extends JPanel {

    JPasswordField field2;


    public PanelPassword() {

        setLayout(new BorderLayout());
        JPanel upper_panel = new JPanel();
        upper_panel.setLayout(new GridLayout(2, 2));
        add(upper_panel, BorderLayout.NORTH);

        JLabel label1 = new JLabel("Usuario");
        label1.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        JLabel label2 = new JLabel("Contraseña");
        label2.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));

        JTextField field1 = new JTextField(15);

        field2 = new JPasswordField(15);

        field2.getDocument().addDocumentListener(new CompruebaPass());

        upper_panel.add(label1, JLabel.CENTER);
        upper_panel.add(field1);
        upper_panel.add(label2);
        upper_panel.add(field2);

        JButton send = new JButton("Enviar");
        add(send, BorderLayout.SOUTH);
    }

    private class CompruebaPass implements DocumentListener {

        private void checkPasswordLength() {
            char[] password = field2.getPassword();

            if (password.length < 8 || password.length > 12) {
                field2.setBackground(Color.RED);
            } else {
                field2.setBackground(Color.WHITE);
            }
        }

        @Override
        public void insertUpdate(DocumentEvent e) {

            checkPasswordLength();
        }



        @Override
        public void removeUpdate(DocumentEvent e) {

            checkPasswordLength();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {

        }
    }

}