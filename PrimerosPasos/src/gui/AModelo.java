package gui;

import javax.swing.*;

public class AModelo {

    public static void main(String[] args) {

        MarcoXXXXX myFrame = new MarcoXXXXX();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MarcoXXXXX extends JFrame {

    public MarcoXXXXX() {
        setBounds(600, 300, 550, 350);
        PanelXXXXX myPanel = new PanelXXXXX();
        add(myPanel);
        setVisible(true);
    }
}

class PanelXXXXX extends JPanel {

    public PanelXXXXX() {


    }

}