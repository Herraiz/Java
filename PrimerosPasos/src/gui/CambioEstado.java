package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class CambioEstado {
    public static void main(String[] args) {

        MarcoEstado myFrame = new MarcoEstado();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoEstado extends JFrame {
    public MarcoEstado() {
        setVisible(true);
        setBounds(300, 300, 500, 350);

        CambiaEstado newState = new CambiaEstado();  // Instanciamos el listener
        addWindowStateListener(newState);  // Lo vinculamos al objeto

    }
}

class CambiaEstado implements WindowStateListener {

    @Override
    public void windowStateChanged(WindowEvent e) {

      /* Los métodos devuelven números enteros, que coinciden con las variables de clase de Frame.
        System.out.println("El estado anterior era " + e.getOldState());
        System.out.println("El nuevo estado es " + e.getNewState());
       */

        if (e.getNewState() == Frame.MAXIMIZED_BOTH) {  // 6 == MAXIMIZED_BOTH -> maximizada
            System.out.println("La ventana ha sido maximizada");
        } else if (e.getNewState() == Frame.NORMAL) {
            System.out.println("La ventana está normal");
        } else if (e.getNewState() == Frame.ICONIFIED) {
            System.out.println("La ventana está minimizada");
        }

    }
}