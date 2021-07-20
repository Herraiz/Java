package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    JTextPane textPanel;

    JMenu font, style, size;

    String lastFont = "Arial";
    int lastStyle = Font.PLAIN;
    int lastSize = 12;

    public PanelProcesador() {
        setLayout(new BorderLayout());

        /* Menu */
        JPanel menuPanel = new JPanel();
        JMenuBar menuBar = new JMenuBar();

        /* Font submenu **/
        font = new JMenu("Fuente");
        menuConfig("Arial", "Fuente", "", 1, 1);
        menuConfig("Courier", "Fuente", "", 1, 1);
        menuConfig("Verdana", "Fuente", "", 1, 1);


        /* Style submenu **/
        style = new JMenu("Estilo");
        menuConfig("Normal", "Estilo", "", 1, 1);
        menuConfig("Negrita", "Estilo", "", 1, 1);
        menuConfig("Cursiva", "Estilo", "", 1, 1);


        /* Size submenu **/
        size = new JMenu("Tamaño");
        menuConfig("12", "Tamaño", "", 1, 1);
        menuConfig("16", "Tamaño", "", 1, 1);
        menuConfig("20", "Tamaño", "", 1, 1);
        menuConfig("24", "Tamaño", "", 1, 1);



        /* Text Panel */

        textPanel = new JTextPane();


        /* Adding all to the interface */

        menuBar.add(font);
        menuBar.add(style);
        menuBar.add(size);

        menuPanel.add(menuBar);

        add(menuPanel, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);
    }

    public void menuConfig(String title, String menu, String font, int style, int size) {
        JMenuItem menuItem = new JMenuItem(title);
        switch (menu) {
            case "Fuente" -> this.font.add(menuItem);
            case "Estilo" -> this.style.add(menuItem);
            case "Tamaño" -> this.size.add(menuItem);
        }

    }

    private ActionListener changeFont(String font) {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPanel.setFont(new Font(font, lastStyle, lastSize));
                lastFont = font;
            }
        };
    }

    private ActionListener changeStyle(int style) {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPanel.setFont(new Font(lastFont, style, lastSize));
                lastStyle = style;
            }
        };
    }

    private ActionListener changeSize(int size) {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPanel.setFont(new Font(lastFont, lastStyle, size));
                lastSize = size;
            }
        };
    }

}