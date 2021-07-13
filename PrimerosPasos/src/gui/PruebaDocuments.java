package gui;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class PruebaDocuments {

    public static void main(String[] args) {

        MarcoPrueba myFrame = new MarcoPrueba();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MarcoPrueba extends JFrame {

    public MarcoPrueba() {
        setBounds(600, 300, 500, 350);
        PanelPrueba myPanel = new PanelPrueba();
        add(myPanel);
        setVisible(true);

    }

}

class PanelPrueba extends JPanel {


    public PanelPrueba() {

        JTextField myField = new JTextField(20);


        Document myDoc = myField.getDocument();
        myDoc.addDocumentListener(new EscuchaTexto());

        add(myField);
    }

    private class EscuchaTexto implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent e) {

            System.out.println("Has insertado texto");
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            System.out.println("Has borrado texto");
        }

        @Override
        public void changedUpdate(DocumentEvent e) {

        }
    }

}