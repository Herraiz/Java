package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

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


    public PanelProcesador() {
        setLayout(new BorderLayout());

        /* Menu */
        JPanel menuPanel = new JPanel();
        JMenuBar menuBar = new JMenuBar();

        /* Font submenu **/
        font = new JMenu("Fuente");
        menuConfig("Arial", "Fuente", "Arial", 9, 10);
        menuConfig("Courier", "Fuente", "Courier", 9, 10);
        menuConfig("Verdana", "Fuente", "Verdana", 9, 10);


        /* Style submenu **/
        style = new JMenu("Estilo");
        menuConfig("Normal", "Estilo", "", Font.PLAIN, 1);
        menuConfig("Negrita", "Estilo", "", Font.BOLD, 1);
        menuConfig("Cursiva", "Estilo", "", Font.ITALIC, 1);


        /* Size submenu **/
        size = new JMenu("Tamaño");
        menuConfig("12", "Tamaño", "", 9, 12);
        menuConfig("16", "Tamaño", "", 9, 16);
        menuConfig("20", "Tamaño", "", 9, 20);
        menuConfig("24", "Tamaño", "", 9, 24);



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

        menuItem.addActionListener(new GestionaEventos(title, font, style, size));

    }

    private class GestionaEventos implements ActionListener {

        String fontName, menu;
        int fontStyle, fontSize;

        GestionaEventos(String element, String buttonFont, int buttonStyle, int buttonSize) {
            fontName = buttonFont;
            fontStyle = buttonStyle;
            fontSize = buttonSize;
            menu = element;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            Font actualFont = textPanel.getFont();

            if (Objects.equals(menu, "Arial") || Objects.equals(menu, "Verdana") || Objects.equals(menu, "Courier")) {
                fontStyle = actualFont.getStyle();
                fontSize = actualFont.getSize();
            } else if (Objects.equals(menu, "Normal") || Objects.equals(menu, "Negrita") || Objects.equals(menu, "Cursiva")) {
                fontName = actualFont.getFamily();
                fontSize = actualFont.getSize();

            } else if (Objects.equals(menu, "12") || Objects.equals(menu, "16") ||
                       Objects.equals(menu, "20") || Objects.equals(menu, "24")) {
                fontName = actualFont.getFamily();
                fontStyle = actualFont.getStyle();
            }

            textPanel.setFont(new Font(fontName, fontStyle, fontSize));
            System.out.println("Tipo: " + fontName + " Estilo: " + fontStyle + " Tamaño: " + fontSize);
        }
    }

}