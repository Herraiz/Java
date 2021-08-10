package gui;

import javax.swing.*;
import java.awt.*;

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

        setLayout(new EnColumnas());
        JLabel name = new JLabel("Nombre: ");
        JLabel surname = new JLabel("Apellidos: ");
        JTextField nameField = new JTextField();
        JTextField surnameField = new JTextField();

        /* Deprecated -> Disposición libre setLayout(null)
        name.setBounds(20, 20, 80, 10);
        surname.setBounds(20, 50, 80, 10);

        nameField.setBounds(85, 15, 100, 20);
        surnameField.setBounds(85, 45, 100, 20); */


        add(name);
        add(nameField);
        add(surname);
        add(surnameField);

        add(new JLabel("Edad: "));
        add(new JTextField());

        add(new JLabel("Teléfono: "));
        add(new JTextField());

    }

}

class EnColumnas implements LayoutManager {

    private int x;
    private int y = 20;

    @Override
    public void addLayoutComponent(String name, Component comp) {

    }

    @Override
    public void removeLayoutComponent(Component comp) {

    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        return null;
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        return null;
    }

    @Override
    public void layoutContainer(Container parent) {
        int width = parent.getWidth();
        x = width / 2;
        int counter = 0;
        int n = parent.getComponentCount();

        for (int i = 0; i < n; i++) {

            counter++;

            Component comp = parent.getComponent(i);
            comp.setBounds(x - 100, y, 100, 20);

            /* Location magic - pairs */

            x += 80;

            if (counter % 2 == 0) {
                x = width / 2;
                y += 25;
            }
        }

    }
}