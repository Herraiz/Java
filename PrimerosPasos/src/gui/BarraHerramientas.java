package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class BarraHerramientas {

    public static void main(String[] args) {

        MarcoBarra mainFrame = new MarcoBarra();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);

    }
}

class MarcoBarra extends JFrame {

    JPanel myPanel;

    public MarcoBarra() {

        setTitle("Prueba con colores");
        setSize(400, 400);

        myPanel = new JPanel();
        add(myPanel);

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

        Action closeAction = new AbstractAction("Salir", new ImageIcon("src/gui/close.png")) {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        };

        JMenu menu = new JMenu("Color");
        menu.add(yellowAction);
        menu.add(blueAction);
        menu.add(redAction);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu);
        setJMenuBar(menuBar);  // Añade la barra de menú al panel

        /* Construimos el toolbar */

        JToolBar toolBar = new JToolBar("Herramientas");
        toolBar.add(yellowAction);
        toolBar.add(redAction);
        toolBar.add(blueAction);

        toolBar.addSeparator();
        toolBar.add(closeAction);

        add(toolBar, BorderLayout.NORTH);
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
            myPanel.setBackground(c);

            System.out.println("Nombre: " + getValue(Action.NAME) + " - Descripción: " + getValue(Action.SHORT_DESCRIPTION));
        }
    }
}