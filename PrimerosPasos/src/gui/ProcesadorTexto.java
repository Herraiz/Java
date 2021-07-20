package gui;

import javax.swing.*;
import java.awt.*;

public class ProcesadorTexto {

    public static void main(String[] args) {

        MarcoProcesador myFrame = new MarcoProcesador();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MarcoProcesador extends JFrame {

    public MarcoProcesador() {
        setBounds(600, 300, 550, 400);
        PanelProcesador myPanel = new PanelProcesador();
        add(myPanel);
        setVisible(true);
    }
}

class PanelProcesador extends JPanel {

    public PanelProcesador() {
        setLayout(new BorderLayout());

        /* Menu */

        JPanel menuPanel = new JPanel();
        JMenuBar menuBar = new JMenuBar();

        /* Font submenu **/
        JMenu font = new JMenu("Fuente");
        JMenuItem arial = new JMenuItem("Arial");
        JMenuItem courier = new JMenuItem("Courier");
        JMenuItem verdana = new JMenuItem("Verdana");

        menuBar.add(font);
        font.add(arial);
        font.add(courier);
        font.add(verdana);

        /* Style submenu **/
        JMenu style = new JMenu("Estilo");
        JMenuItem bold = new JMenuItem("Negrita");
        JMenuItem italic = new JMenuItem("Cursiva");

        menuBar.add(style);
        style.add(bold);
        style.add(italic);

        /* Size submenu **/

        JMenu size = new JMenu("Tamaño");
        JMenuItem size12 = new JMenuItem("12");
        JMenuItem size16 = new JMenuItem("16");
        JMenuItem size20 = new JMenuItem("20");
        JMenuItem size24 = new JMenuItem("24");

        menuBar.add(size);
        size.add(size12);
        size.add(size16);
        size.add(size20);
        size.add(size24);


        /* Text Panel */

        JTextPane textPanel = new JTextPane();


        /* Adding all to the interface */

        menuPanel.add(menuBar);

        add(menuPanel, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);
    }

}