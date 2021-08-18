import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

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

//    Image image = myScreen.getImage("res/logo.png");

    /* Así podemos cargar recursos desde nuestra carpeta de recursos */
    Image image = myScreen.getImage(getClass().getClassLoader().getResource("logo.png"));

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 100, 100, this);
    }

}
