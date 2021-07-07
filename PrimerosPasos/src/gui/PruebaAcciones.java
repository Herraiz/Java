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
                new ImageIcon("src/gui/yellow.png"),
                Color.YELLOW);

        AccionColor blueAction = new AccionColor(
                "Azul",
                new ImageIcon("src/gui/blue.png"),
                Color.BLUE);

        AccionColor redAction = new AccionColor(
                "Rojo",
                new ImageIcon("src/gui/red.png"),
                Color.RED);

        add(new JButton(yellowAction));
        add(new JButton(blueAction));
        add(new JButton(redAction));

        /* 1) Creamos el mapa de entrada - Para poder recoger las teclas */
        InputMap inputMap = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);

        /* 2) Creamos la tecla que queremos recoger */
        KeyStroke yellowKey = KeyStroke.getKeyStroke("ctrl A");

        /* 3) Asignamos la tecla al objeto "intermedio" */
        inputMap.put(yellowKey, "yellowBackground");

        /* 4) Usamos un ActionMap para enlazar la acción con nuestro objeto intermedio, asociado a la tecla */
        ActionMap actionMap = getActionMap();
        actionMap.put("yellowBackground", yellowAction);

        /*  Para el resto de colores: */

        KeyStroke blueKey = KeyStroke.getKeyStroke("ctrl B");
        inputMap.put(blueKey, "blueBackground");
        actionMap.put("blueBackground", blueAction);

        KeyStroke redKey = KeyStroke.getKeyStroke("ctrl R");
        inputMap.put(redKey, "redBackground");
        actionMap.put("redBackground", redAction);
    }

    private class AccionColor extends AbstractAction {

        /* Hereda de la clase adaptadora, usamos inner class para que tenga JPanel y pueda hacer setBackground */

        public AccionColor(String name, Icon icon, Color buttonColor) {

            putValue(Action.NAME, name);
            putValue(Action.SMALL_ICON, icon);
            putValue(Action.SHORT_DESCRIPTION, "Poner la lámina de color " + name);
            putValue("backgroundColor", buttonColor);
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            Color c = (Color) getValue("backgroundColor");
            setBackground(c);

            System.out.println("Nombre: " + getValue(Action.NAME) + " - Descripción: " + getValue(Action.SHORT_DESCRIPTION));
        }
    }
}