package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class TrabajandoColores {

    public static void main(String[] args) {

        MarcoConImagenes mainFrame = new MarcoConImagenes();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);

    }
}

class MarcoConColor extends JFrame {

    public MarcoConColor() {

        setTitle("Prueba con colores");
        setSize(400, 400);

        PanelConImagenes myPanel = new PanelConImagenes();
        add(myPanel);
        myPanel.setBackground(SystemColor.window);

    }

}

class PanelConColor extends JPanel {


    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        Color myGreen = new Color(0, 205, 94);
        Color myGray = new Color(154, 154, 154);

        Rectangle2D rectangle = new Rectangle2D.Double(100, 100, 200, 150);

        g2.setPaint(Color.BLUE);
        g2.draw(rectangle);

        g2.setPaint(myGray);
        g2.fill(rectangle);  //  Con fill en vez de draw, rellenamos con el color indicado

        Ellipse2D ellipse = new Ellipse2D.Double();
        ellipse.setFrame(rectangle);

        g2.setPaint(myGreen);
        g2.fill(ellipse);

    }
}