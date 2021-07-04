package gui;

import javax.swing.*;
import java.awt.*;

public class TrabajandoConFuentes {

    public static void main(String[] args) {

        MarcoConImagenes mainFrame = new MarcoConImagenes();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);

    }
}

class MarcoConFuentes extends JFrame {

    public MarcoConFuentes() {

        setTitle("Prueba con Fuentes");
        setSize(400, 400);

        PanelConImagenes myPanel = new PanelConImagenes();
        add(myPanel);
        myPanel.setForeground(Color.PINK);

    }

}

class PanelConFuentes extends JPanel {


    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        Font myFont = new Font("Roboto", Font.BOLD, 26);
        g2.setFont(myFont);
//        g2.setColor(Color.BLUE);
        g2.drawString("Roberto", 100, 100);

        Font myFontCourier = new Font("Courier", Font.ITALIC, 24);
        g2.setFont(myFontCourier);
//        g2.setColor(new Color(154, 25, 120).brighter());
        g2.drawString("Curso de Java", 100, 130);



    }
}