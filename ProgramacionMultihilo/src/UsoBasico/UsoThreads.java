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
    private Thread t;


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

        ponerBoton(laminaBotones, "Detener", new ActionListener() {

            public void actionPerformed(ActionEvent evento) {

                detener();

            }

        });

        add(laminaBotones, BorderLayout.SOUTH);
    }

    //Añade pelota y la bota 1000 veces

    public void ponerBoton(Container c, String titulo, ActionListener oyente) {

        JButton boton = new JButton(titulo);

        c.add(boton);

        boton.addActionListener(oyente);

    }

    public void comienza_el_juego() {


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
        t = new Thread(r);
        t.start();

    }

    public void detener(){

        /* Deprecated
        t.stop();  */

        t.interrupt();;
    }


}
