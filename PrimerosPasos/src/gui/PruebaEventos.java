package gui;

import javax.swing.*;
import java.awt.*;

public class PruebaEventos {

    public static void main(String[] args) {

        MarcoBotones mainFrame = new MarcoBotones();
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoBotones extends JFrame {

    public MarcoBotones() {

        setTitle("Botones y eventos");
        setBounds(700, 300, 500, 200);

        PanelBotones myPanel = new PanelBotones();
        add(myPanel);

    }

}

class PanelBotones extends JPanel {


    public PanelBotones() {}

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

    }

}
