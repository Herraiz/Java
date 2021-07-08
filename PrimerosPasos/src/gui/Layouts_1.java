package gui;

import javax.swing.*;
import java.awt.*;

public class Layouts_1 {

    public static void main(String[] args) {

        MarcoLayout frame = new MarcoLayout();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class MarcoLayout extends JFrame {

    public MarcoLayout(){
        setTitle("Prueba layouts");
        setBounds(600, 350, 600, 300);
        PanelLayout panel = new PanelLayout();

        FlowLayout myLayout = new FlowLayout();
        myLayout.setAlignment(FlowLayout.LEADING);
        setLayout(myLayout);

        add(panel);
    }
}

class PanelLayout extends JPanel {
    public PanelLayout(){
        add(new JButton("Amarillo"));
        add(new JButton("Rojo"));
        add(new JButton("Azul"));
    }

}