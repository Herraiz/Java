package poo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Prueba_Temporizador_2 {

    public static void main(String[] args) {

        Clock myClock = new Clock(3000, true);

        myClock.start();

        JOptionPane.showMessageDialog(null, "Pulsa en Aceptar para terminar");

        System.exit(0);

    }
}

class Clock {

    private final int interval;
    private final boolean sound;

    public Clock(int interval, boolean sound) {
        this.interval = interval;
        this.sound = sound;

    }

    public void start() {
        ActionListener listener = new GetTime2();

        Timer myTimer = new Timer(interval, listener);

        myTimer.start();
    }

    private class GetTime2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            Date now = new Date();
            System.out.println("Te pongo la hora cada " + interval/1000 + " seg: " + now);

            if (sound) {
                Toolkit.getDefaultToolkit().beep();
            }

        }
    }

}