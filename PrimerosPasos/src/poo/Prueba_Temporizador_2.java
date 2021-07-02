package poo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Prueba_Temporizador_2 {

    public static void main(String[] args) {

        Clock myClock = new Clock();

        myClock.start(3000, true);

        JOptionPane.showMessageDialog(null, "Pulsa en Aceptar para terminar");

        System.exit(0);

    }
}

class Clock {

    public void start(int interval, final boolean sound) {

        /* Clase interna local - La usamos porque solo instanciamos GetTime2 una vez */
        class GetTime2 implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {

                Date now = new Date();
                System.out.println("Te pongo la hora cada " + interval/1000 + " seg: " + now);

                if (sound) {
                    Toolkit.getDefaultToolkit().beep();
                }

            }
        }

        ActionListener listener = new GetTime2();

        Timer myTimer = new Timer(interval, listener);

        myTimer.start();
    }

}