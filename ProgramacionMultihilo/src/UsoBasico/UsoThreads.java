package UsoBasico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

public class UsoThreads {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        JFrame marco = new MarcoRebote();

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        marco.setVisible(true);

    }

}


//Movimiento de la pelota-----------------------------------------------------------------------------------------

class Pelota {

    // Mueve la pelota invirtiendo posición si choca con límites

    private static final int xSize = 15;

    //Forma de la pelota en su posición inicial
    private static final int ySize = 15;
    private double x = 0;
    private double y = 0;
    private double dx = 1;
    private double dy = 1;

    public void mueve_pelota(Rectangle2D limites) {

        x += dx;

        y += dy;

        if (x < limites.getMinX()) {

            x = limites.getMinX();

            dx = -dx;
        }

        if (x + xSize >= limites.getMaxX()) {

            x = limites.getMaxX() - xSize;

            dx = -dx;
        }

        if (y < limites.getMinY()) {

            y = limites.getMinY();

            dy = -dy;
        }

        if (y + ySize >= limites.getMaxY()) {

            y = limites.getMaxY() - ySize;

            dy = -dy;

        }

    }

    public Ellipse2D getShape() {

        return new Ellipse2D.Double(x, y, xSize, ySize);

    }


}

// L�mina que dibuja las pelotas----------------------------------------------------------------------


class LaminaPelota extends JPanel {

    //A�adimos pelota a la l�mina

    private final ArrayList<Pelota> pelotas = new ArrayList<Pelota>();

    public void add(Pelota b) {

        pelotas.add(b);
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        for (Pelota b : pelotas) {

            g2.fill(b.getShape());
        }

    }
}


//Marco con lámina y botones------------------------------------------------------------------------------

class MarcoRebote extends JFrame {

    private final LaminaPelota lamina;


    //Ponemos botones

    public MarcoRebote() {

        setBounds(600, 300, 400, 350);

        setTitle("Rebotes");

        lamina = new LaminaPelota();

        add(lamina, BorderLayout.CENTER);

        JPanel laminaBotones = new JPanel();

        ponerBoton(laminaBotones, "Dale!", new ActionListener() {

            public void actionPerformed(ActionEvent evento) {

                comienza_el_juego();
            }

        });


        ponerBoton(laminaBotones, "Salir", new ActionListener() {

            public void actionPerformed(ActionEvent evento) {

                System.exit(0);

            }

        });

        add(laminaBotones, BorderLayout.SOUTH);
    }

    //A�ade pelota y la bota 1000 veces

    public void ponerBoton(Container c, String titulo, ActionListener oyente) {

        JButton boton = new JButton(titulo);

        c.add(boton);

        boton.addActionListener(oyente);

    }

    public void comienza_el_juego() {


        Pelota pelota = new Pelota();

        lamina.add(pelota);

        for (int i = 1; i <= 3000; i++) {

            pelota.mueve_pelota(lamina.getBounds());

            lamina.paint(lamina.getGraphics());

        }


    }


}
