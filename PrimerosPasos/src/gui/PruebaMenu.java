package gui;

import javax.swing.*;
import java.awt.*;

public class PruebaMenu {

    public static void main(String[] args) {

        MarcoMenu myFrame = new MarcoMenu();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MarcoMenu extends JFrame {

    public MarcoMenu() {
        setBounds(600, 300, 550, 350);
        PanelMenu myPanel = new PanelMenu();
        add(myPanel);
        setVisible(true);
    }
}

class PanelMenu extends JPanel {

    public PanelMenu() {

        setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();

        JMenu archivo = new JMenu("Archivo");
        menuBar.add(archivo);
        JMenuItem guardar = new JMenuItem("Guardar");
        archivo.add(guardar);
        JMenuItem guardarComo = new JMenuItem("Guardar como");
        archivo.add(guardarComo);

        JMenu edicion = new JMenu("Edición");
        menuBar.add(edicion);
        JMenuItem copiar = new JMenuItem("Copiar");
        edicion.add(copiar);
        JMenuItem cortar = new JMenuItem("Cortar");
        edicion.add(cortar);
        JMenuItem pegar = new JMenuItem("Pegar");
        edicion.add(pegar);
        edicion.addSeparator(); // edicion.add(new JSeparator());
        JMenu opciones = new JMenu("Opciones");
        edicion.add(opciones);
        JMenuItem opcion1 = new JMenuItem("Opción 1");
        opciones.add(opcion1);
        JMenuItem opcion2 = new JMenuItem("Opción 2");
        opciones.add(opcion2);


        JMenu herramientas = new JMenu("Herramientas");
        menuBar.add(herramientas);
        JMenuItem generales = new JMenuItem("Generales");
        herramientas.add(generales);

        add(menuBar, BorderLayout.NORTH);

    }

}