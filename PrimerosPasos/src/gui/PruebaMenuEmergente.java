package gui;

import javax.swing.*;
import java.awt.*;

public class PruebaMenuEmergente {

    public static void main(String[] args) {

        MarcoMenuEmergente myFrame = new MarcoMenuEmergente();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MarcoMenuEmergente extends JFrame {

    public MarcoMenuEmergente() {
        setBounds(600, 300, 550, 350);
        PanelMenuEmergente myPanel = new PanelMenuEmergente();
        add(myPanel);
        setVisible(true);
    }
}

class PanelMenuEmergente extends JPanel {

    public PanelMenuEmergente() {

        setLayout(new BorderLayout());
        JPanel menuPanel = new JPanel();
        JMenuBar myBar = new JMenuBar();
        JMenu font = new JMenu("Fuente");
        JMenu style = new JMenu("Estilo");
        JMenu size = new JMenu("Tamaño");
        myBar.add(font);
        myBar.add(style);
        myBar.add(size);
        menuPanel.add(myBar);
        add(menuPanel, BorderLayout.NORTH);
        JTextPane myArea = new JTextPane();
        add(myArea, BorderLayout.CENTER);

        JPopupMenu popup = new JPopupMenu();
        JMenuItem option1 = new JMenuItem("Opción 1");
        JMenuItem option2 = new JMenuItem("Opción 2");
        JMenuItem option3 = new JMenuItem("Opción 3");
        popup.add(option1);
        popup.add(option2);
        popup.add(option3);
        
        /* Falta elegir sobre qué se lanzará el popup */
        myArea.setComponentPopupMenu(popup);

    }

}