package gui;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PruebaEventosVentana {

    public static void main(String[] args) {

        MarcoVentana mainFrame = new MarcoVentana();

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setTitle("Ventana 1");
        mainFrame.setBounds(300, 300, 500, 350);

        MarcoVentana secondFrame = new MarcoVentana();
        secondFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        secondFrame.setTitle("Ventana 2");
        secondFrame.setBounds(900, 300, 500, 350);

    }
}

class MarcoVentana extends JFrame {

    public MarcoVentana() {

        setVisible(true);

        /* Simplificamos
        MVentana window_listener = new MVentana();
        addWindowListener(window_listener);  // Ponemos a MVentana en escucha
        */

        addWindowListener(new MVentana());
    }
}

class MVentana extends WindowAdapter {
/* Simplificamos gracias a la clase adaptadora
    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Ventana abierta");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Cerrando ventana");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Ventana cerrada");
    } */

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada");
    }
/* Simplificamos gracias a la clase adaptadora
    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Ventana restaurada");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Ventana activada");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Ventana desactivada");
    }
*/
}