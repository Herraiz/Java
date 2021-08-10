package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TiposCuadrosDialogo {

    public static void main(String[] args) {

        CuadrosDialogos mimarco = new CuadrosDialogos();

        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mimarco.setVisible(true);

    }

}

class CuadrosDialogos extends JFrame {

    public CuadrosDialogos() {

        setBounds(500, 300, 400, 250);

        add(new LaminaCuadrosDialogos());

    }

}

class LaminaCuadrosDialogos extends JPanel {

    private final JButton boton1, boton2, boton3, boton4;

    public LaminaCuadrosDialogos() {

        boton1 = new JButton("Botón 1");
        boton2 = new JButton("Botón 2");
        boton3 = new JButton("Botón 3");
        boton4 = new JButton("Botón 4");

        boton1.addActionListener(new Accion_botones());
        boton2.addActionListener(new Accion_botones());
        boton3.addActionListener(new Accion_botones());
        boton4.addActionListener(new Accion_botones());

        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);

    }

    private class Accion_botones implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub

            if (e.getSource() == boton1) {
                JOptionPane.showMessageDialog(LaminaCuadrosDialogos.this,
                        "Has pulsado el botón 1",
                        "Ventana emergente",
                        JOptionPane.WARNING_MESSAGE);

            } else if (e.getSource() == boton2) {
                String name = JOptionPane.showInputDialog(LaminaCuadrosDialogos.this,
                        "Introduce nombre",
                        "Ventana emergente", 2);
                System.out.println(name);

            } else if (e.getSource() == boton3) {


            } else {


            }

        }

    }
}