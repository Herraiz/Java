package gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class TrabajandoImagenes {

    public static void main(String[] args) {

        MarcoConImagenes mainFrame = new MarcoConImagenes();
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoConImagenes extends JFrame {

    public MarcoConImagenes() {

        setTitle("Prueba con Imágenes");
        setBounds(750, 300, 300, 200);

        PanelConImagenes myPanel = new PanelConImagenes();
        add(myPanel);

    }

}

class PanelConImagenes extends JPanel {

    private Image logo;
    private Image gif;

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        try {
            logo = ImageIO.read(new File("src/gui/iceon.jpg"));
        }
        catch(IOException e) {
            System.out.println("La imagen no se encuentra, error: " + e);
        }

        g.drawImage(logo, 5, 5, null);

    }

}
