package gui;

import javax.swing.*;
import java.awt.*;

public class PruebaSpinner {

    public static void main(String[] args) {

        MarcoSpinner myFrame = new MarcoSpinner();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MarcoSpinner extends JFrame {

    public MarcoSpinner() {
        setBounds(600, 300, 550, 350);
        PanelSpinner myPanel = new PanelSpinner();
        add(myPanel);
        setVisible(true);
    }
}

class PanelSpinner extends JPanel {

    public PanelSpinner() {

//        String list[] = {"Enero", "Febrero", "Marzo", "Abril"};

        JSpinner control = new JSpinner(new SpinnerNumberModel(5, 0, 10, 1));

        control.setPreferredSize(new Dimension(100, 20));

        add(control);
    }

}