package Excepciones_I;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class TrabajandoConImagenes {

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

        /* Tenemos que controlar el posible error de IO */

        try {
            image = ImageIO.read(new File("res/explosions.gif")); // is explosion.gif
        } catch (IOException e) {
            System.out.println("La imagen no se encuentra, error: " + e);
        }

    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        /* Controlamos el posible error de Runtime evitando "a mano" que se ejecute el código si image es null */

        if (image == null) {
            g.drawString("No podemos cargar la imagen", 10, 10);
        } else {

            int width = image.getWidth(this);
            int height = image.getHeight(this);
            g.drawImage(image, 0, 0, null);


            for (int dx = 0; dx < 2000; dx += width) {
                for (int dy = 0; dy < 2000; dy += height) {

                    if (dx + dy > 0) {
                        g.copyArea(0, 0, width, height, dx, dy);
                    }
                }
            }

        }
    }


    /* Forma incorrecta de hacerlo, lanzar una excepción

    public void paintComponent(Graphics g) throws NullPointerException {

        super.paintComponent(g);

        try {

            int width = image.getWidth(this);
            int height = image.getHeight(this);
            g.drawImage(image, 0, 0, null);


            for (int dx = 0; dx < 2000; dx += width) {
                for (int dy = 0; dy < 2000; dy += height) {

                    if (dx + dy > 0) {
                        g.copyArea(0, 0, width, height, dx, dy);
                    }
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Error detectado: " + e);
        }
    } */
}