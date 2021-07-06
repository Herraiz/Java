package gui;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EventosRaton {

    public static void main(String[] args) {

        gui.MarcoRaton myFrame = new gui.MarcoRaton();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoRaton extends JFrame {
    public MarcoRaton(){
        setVisible(true);
        setBounds(700, 300, 600, 450);
        addMouseListener(new EventosDeRaton());
    }
}

class EventosDeRaton extends MouseAdapter {  // o implementar la interfaz MouseListener


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Has hecho click en " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Acabas de entrar");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Acabas de salir");
    }
}