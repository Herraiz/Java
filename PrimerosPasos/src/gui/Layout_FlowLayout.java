package gui;

import javax.swing.*;
import java.awt.*;

public class FlowLayout {

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
        add(panel);
    }
}

class PanelLayout extends JPanel {
    public PanelLayout(){

        /* Creamos el layout y asignamos alineación por defecto - se lo ponemos a Panel aunque se le puede poner al marco también */

        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 100)); // con los gaps podemos controlar dónde se ponen los botones

        add(new JButton("Amarillo"));
        add(new JButton("Rojo"));
        add(new JButton("Azul"));
    }

}