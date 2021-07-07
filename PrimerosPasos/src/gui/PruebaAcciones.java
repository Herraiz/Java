package gui;

import javax.swing.*;
import java.awt.*;
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

        AccionColor yellowAction = new AccionColor(
                "Amarillo",
                new ImageIcon("src/gui/yellow.jpg"),
                Color.YELLOW);

        AccionColor blueAction = new AccionColor(
                "Azul",
                new ImageIcon("src/gui/blue.jpg"),
                Color.BLUE);

        AccionColor redAction = new AccionColor(
                "Rojo",
                new ImageIcon("src/gui/red.jpg"),
                Color.RED);


        /* Forma antigua de crear los botones

        JButton yellowButton = new JButton("Amarillo");
        JButton blueButton = new JButton("Azul");
        JButton redButton = new JButton("Rojo");

        add(yellowButton);
        add(blueButton);
        add(redButton);
        */
    }
}

class AccionColor extends AbstractAction { // Clase adaptadora

    public AccionColor(String name, Icon icon, Color buttonColor) {

        putValue(Action.NAME, name);
        putValue(Action.SMALL_ICON, icon);
        putValue(Action.SHORT_DESCRIPTION, "Poner la lámina de color " + name);
        putValue("backgroundColor", buttonColor);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }


}
