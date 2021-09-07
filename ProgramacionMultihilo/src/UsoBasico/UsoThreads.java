package UsoBasico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class UsoThreads {

    public static void main(String[] args) {

        JFrame marco = new MarcoRebote();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);

    }

}

class PelotaHilos implements Runnable {

    /* Preparamos la clase para que el programa sea multihilo
    * 1) Hacemos que la clase implemente la interfaz Runnable
    * 2) Metemos toda la lógica de la tarea en el método run()
    * 3) Continuamos en comienza_el_juego()*/

    private Pelota pelota;
    private Component component;

    public PelotaHilos(Pelota unaPelota, Component unComponente){

        this.pelota = unaPelota;
        this.component = unComponente;

    }

    @Override
    public void run() {

        System.out.println("Estado del hilo al comenzar: " + !Thread.currentThread().isInterrupted());

        /*for (int i = 1; i <= 3000; i++) {*/

        // while(!Thread.interrupted()) {

        while(!Thread.currentThread().isInterrupted()) {

            pelota.mueve_pelota(component.getBounds());
            component.repaint();

            /* Vamos a hacer cambios para permitir la interrupción del hilo
            try {

                sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Hilo bloqueado, imposible su interrupción");
            }
            */

            component.repaint();

        }

        System.out.println("Estado del hilo al finalizar: " + !Thread.currentThread().isInterrupted());

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

// Lámina que dibuja las pelotas----------------------------------------------------------------------


class LaminaPelota extends JPanel {

    //Añadimos pelota a la lámina

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

        // Asegura que el objeto gráfico se actualiza
        Toolkit.getDefaultToolkit().sync();

    }
}


//Marco con lámina y botones------------------------------------------------------------------------------

class MarcoRebote extends JFrame {

    private final LaminaPelota lamina;
    private Thread t1, t2, t3;
    JButton arranca1, arranca2, arranca3, detener1, detener2, detener3;


    //Ponemos botones

    public MarcoRebote() {

        setBounds(600, 300, 600, 350);

        setTitle("Rebotes");

        lamina = new LaminaPelota();

        add(lamina, BorderLayout.CENTER);

        JPanel laminaBotones = new JPanel();

        arranca1 = new JButton("Hilo 1");
        arranca1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comienza_el_juego(e);
            }
        });
        laminaBotones.add(arranca1);

        arranca2 = new JButton("Hilo 2");
        arranca2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comienza_el_juego(e);
            }
        });
        laminaBotones.add(arranca2);

        arranca3 = new JButton("Hilo 3");
        arranca3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comienza_el_juego(e);
            }
        });
        laminaBotones.add(arranca3);

        detener1 = new JButton("Detener 1");
        detener1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detener(e);
            }
        });
        laminaBotones.add(detener1);

        detener2 = new JButton("Detener 2");
        detener2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detener(e);
            }
        });
        laminaBotones.add(detener2);

        detener3 = new JButton("Detener 3");
        detener3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detener(e);
            }
        });
        laminaBotones.add(detener3);

        add(laminaBotones, BorderLayout.SOUTH);
    }


    public void comienza_el_juego(ActionEvent e) {


        Pelota pelota = new Pelota();

        lamina.add(pelota);

        /* Importante para hacer multithreading */

        /* Preparamos la clase para que el programa sea multihilo
         * 1) y 2) en PelotaHilos
         * 3) Instanciamos la clase en una variable tipo Runnable
         * 4) Creamos una instancia de hilo y le pasamos el Runnable
         * 5) Comenzamos el hilo con start()
         * */

        Runnable r = new PelotaHilos(pelota, lamina);

        if (e.getSource().equals(arranca1)) {
            t1 = new Thread(r);
            t1.start();
        } else if (e.getSource().equals(arranca2)) {
            t2 = new Thread(r);
            t2.start();
        } else if (e.getSource().equals(arranca3)) {
            t3 = new Thread(r);
            t3.start();

        }
    }

    public void detener(ActionEvent e) {

        /* Deprecated
        t.stop();  */

        if (e.getSource().equals(detener1)) {
            t1.interrupt();
        } else if (e.getSource().equals(detener2)) {
            t2.interrupt();
        } else if (e.getSource().equals(detener3)) {
            t3.interrupt();
        }
    }
}
