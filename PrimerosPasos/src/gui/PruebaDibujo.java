package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class PruebaDibujo {

    public static void main(String[] args) {

        MarcoConDibujos mainFrame = new MarcoConDibujos();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);

    }
}

class MarcoConDibujos extends JFrame {

    public MarcoConDibujos() {

        setTitle("Prueba de dibujo");
        setSize(400, 400);
        PanelConFiguras myPanel = new PanelConFiguras();
        add(myPanel);

    }

}

class PanelConFiguras extends JPanel {


    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        /* Usando el objeto Graphics */

        /* Aprendiendo a pintar
        g.drawString("Rectángulo", 15, 20);
        g.drawRect(85, 5, 60, 20);
        g.drawLine(5, 40, 395, 40);
        g.drawArc(100, 100, 100, 200, 0, 180);
        */

        /* Usando el objeto Graphics2D, más potente */

        Graphics2D g2 = (Graphics2D) g;  // Refundición

        Rectangle2D rectangle = new Rectangle2D.Double(100, 100, 200, 150);
        g2.draw(rectangle);

        Ellipse2D ellipse = new Ellipse2D.Double();
        ellipse.setFrame(rectangle);
        g2.draw(ellipse);

        /* Usando ahora Line2D */

        g2.draw(new Line2D.Double(100, 100, 300, 250));

        /* Ahora dibujando con posiciones relativas */

        double xCenter = rectangle.getCenterX();
        double yCenter = rectangle.getCenterY();
        double radius = 150;  // Igual a la algura del rectángunlo

        Ellipse2D circle = new Ellipse2D.Double();
        circle.setFrameFromCenter(xCenter, yCenter, xCenter + radius, yCenter + radius);
        g2.draw(circle);
    }
}
