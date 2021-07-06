package gui;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

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
        EventosDeRaton mouseEvents = new EventosDeRaton();
        addMouseListener(mouseEvents);
        addMouseMotionListener(mouseEvents);
    }
}

class EventosDeRaton extends MouseAdapter implements MouseMotionListener {  // o implementar la interfaz MouseListener


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.print("Has hecho click con el botón " + e.getModifiersEx()
                + " en " + e.getX() + ", " + e.getY()
                + " y se han hecho " + e.getClickCount() + " clicks");

        if (e.getModifiersEx() == 0) {
            System.out.println(" sin modificadores");
        } else if (e.getModifiersEx() == KeyEvent.ALT_DOWN_MASK) {
            System.out.println(" con el modificador ALT");
        } else {
            System.out.println(" con el modificador " + e.getModifiersEx());
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Acabas de entrar");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Acabas de salir");
    }


    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Estás arrastrando el ratón - (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }


}