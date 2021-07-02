package gui;

import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {

    public static void main(String[] args) {

        MarcoConTexto mainFrame = new MarcoConTexto();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoConTexto extends JFrame {

    public MarcoConTexto(){

        setVisible(true);
        setSize(600, 450);
        setLocation(400,200);
        setTitle("Primer texto");

        Panel myPanel = new Panel();
        add(myPanel);  // Pon la lámina por encima del JFrame
    }

        }

class Panel extends JPanel {

    public void paintComponent(Graphics g) {

        super.paintComponent(g);  // Por ahora no es necesaria por la trivialidad del ejemplo

        g.drawString("Estamos aprendiendo Swing", 15, 20);
    }

}