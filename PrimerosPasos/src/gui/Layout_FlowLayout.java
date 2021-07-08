package gui;

import javax.swing.*;
import java.awt.*;

public class Layout_FlowLayout {

    public static void main(String[] args) {

        MarcoFlowLayout frame = new MarcoFlowLayout();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class MarcoFlowLayout extends JFrame {

    public MarcoFlowLayout(){
        setTitle("Prueba layouts");
        setBounds(600, 350, 600, 300);
        PanelFlowLayout panel = new PanelFlowLayout();
        add(panel);
    }
}

class PanelFlowLayout extends JPanel {
    public PanelFlowLayout(){

        /* Creamos el layout y asignamos alineación por defecto - se lo ponemos a Panel aunque se le puede poner al marco también */

        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 100)); // con los gaps podemos controlar dónde se ponen los botones

        add(new JButton("Amarillo"));
        add(new JButton("Rojo"));
        add(new JButton("Azul"));
    }

}