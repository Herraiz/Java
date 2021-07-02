package gui;

import javax.swing.*;

public class CreandoMarcos {

    public static void main(String[] args) {

        MiMarco marco1 = new MiMarco();
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class MiMarco extends JFrame {

    public MiMarco() {

        /* Tamaño y localización
        setSize(500, 300);
        setLocation(getWidth(), getHeight());
        */

        setBounds(500, 300, 250, 250);

        /* Resize y extendido por defecto
        setResizable(false);
        setExtendedState(Frame.MAXIMIZED_BOTH);
         */

        setTitle("Mi ventana");

    }

}
