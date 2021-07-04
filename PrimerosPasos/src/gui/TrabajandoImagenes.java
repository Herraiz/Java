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

    private Image image;

    public PanelConImagenes() {
        /* Cargamos la imagen al usar el constructor */
        try {
            image = ImageIO.read(new File("src/gui/explosion.gif"));
        } catch (IOException e) {
            System.out.println("La imagen no se encuentra, error: " + e);
        }

    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        int width = image.getWidth(this);
        int heigth = image.getHeight(this);
        g.drawImage(image, 0, 0, null);


        for (int dx = 0; dx < 2000; dx += width) {
            for (int dy = 0; dy < 2000; dy+= heigth){

                if (dx + dy > 0) {
                g.copyArea(0, 0, width, heigth, dx, dy);
                }
            }
        }

    }

}
