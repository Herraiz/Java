package gui;

import javax.swing.*;

public class LibreDisposicion {

    public static void main(String[] args) {

        MarcoLibre myFrame = new MarcoLibre();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MarcoLibre extends JFrame {

    public MarcoLibre() {
        setBounds(600, 300, 600, 400);
        PanelLibre myPanel = new PanelLibre();
        add(myPanel);
        setVisible(true);
    }
}

class PanelLibre extends JPanel {

    public PanelLibre() {

        setLayout(null); // disposición libre
        JLabel name = new JLabel("Nombre: ");
        JLabel surname = new JLabel("Apellidos: ");
        JTextField nameField = new JTextField();
        JTextField surnameField = new JTextField();

        name.setBounds(20, 20, 80, 10);
        surname.setBounds(20, 50, 80, 10);

        nameField.setBounds(85, 15, 100, 20);
        surnameField.setBounds(85, 45, 100, 20);


        add(name);
        add(nameField);
        add(surname);
        add(surnameField);

    }

}