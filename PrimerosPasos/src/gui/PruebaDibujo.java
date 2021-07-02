package gui;

import javax.swing.*;
import java.awt.*;

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

        g.drawString("Rectángulo", 15, 20);
        g.drawRect(85, 5, 60, 20);
        g.drawLine(5, 40, 395, 40);
        g.drawArc(100, 100, 100, 200, 0, 180);

    }


}
