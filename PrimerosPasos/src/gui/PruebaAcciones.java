package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class PruebaAcciones {

    public static void main(String[] args) {

        MarcoAccion mainFrame = new MarcoAccion();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);

    }
}

class MarcoAccion extends JFrame {

    public MarcoAccion() {

        setTitle("Prueba con colores");
        setSize(400, 400);

        PanelAccion myPanel = new PanelAccion();
        add(myPanel);

    }

}

class PanelAccion extends JPanel {

    public PanelAccion() {
        JButton yellowButton = new JButton("Amarillo");
        JButton blueButton = new JButton("Azul");
        JButton redButton = new JButton("Rojo");

        add(yellowButton);
        add(blueButton);
        add(redButton);
    }
}

class AccionColor extends AbstractAction { // Clase adaptadora

        
    @Override
    public void actionPerformed(ActionEvent e) {

    }


}
