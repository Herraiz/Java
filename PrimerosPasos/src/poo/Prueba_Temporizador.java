package poo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Prueba_Temporizador {

    public static void main(String[] args) {

        GetTime listener = new GetTime();

        Timer myTimer = new Timer(5000, listener);

        /* ActionListener listener = new GetTime();  // Esto también funcionaría */

        myTimer.start();

        JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");

        System.exit(0);

    }

}

class GetTime implements ActionListener {



    @Override
    public void actionPerformed(ActionEvent e) {

        Date now = new Date();
        System.out.println("Te pongo la hora cada 5 seg: " + now);
        Toolkit.getDefaultToolkit().beep(); // sonido nativo

    }
}