import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class JarFirmado {

    public static void main(String[] args) {

        MarcoJar myFrame = new MarcoJar();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MarcoJar extends JFrame {

    public MarcoJar() {
        setBounds(600, 300, 550, 350);
        PanelJar myPanel = new PanelJar();
        add(myPanel);
        setVisible(true);
    }
}

class PanelJar extends JPanel {

    Toolkit myScreen = Toolkit.getDefaultToolkit();

    /* Así podemos cargar recursos desde nuestra carpeta de recursos */
    /* Hay que definir antes una carpeta recursos desde Project Structure*/

    URL path = PanelJar.class.getResource("logo.png");
    Image image = myScreen.getImage(path);

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 100, 100, this);
    }

}
