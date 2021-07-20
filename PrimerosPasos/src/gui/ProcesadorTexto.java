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
    String lastFont = "Arial";
    int lastStyle = Font.PLAIN;
    int lastSize = 12;

    public PanelProcesador() {
        setLayout(new BorderLayout());

        /* Menu */
        JPanel menuPanel = new JPanel();
        JMenuBar menuBar = new JMenuBar();

        /* Font submenu **/
        JMenu font = new JMenu("Fuente");
        JMenuItem arial = new JMenuItem("Arial");
        arial.addActionListener(changeFont("Arial"));
        JMenuItem courier = new JMenuItem("Courier");
        courier.addActionListener(changeFont("Courier"));
        JMenuItem verdana = new JMenuItem("Verdana");
        verdana.addActionListener(changeFont("Verdana"));

        menuBar.add(font);
        font.add(arial);
        font.add(courier);
        font.add(verdana);

        /* Style submenu **/
        JMenu style = new JMenu("Estilo");
        JMenuItem plain = new JMenuItem("Normal");
        plain.addActionListener(changeStyle(Font.PLAIN));
        JMenuItem bold = new JMenuItem("Negrita");
        bold.addActionListener(changeStyle(Font.BOLD));
        JMenuItem italic = new JMenuItem("Cursiva");
        italic.addActionListener(changeStyle(Font.ITALIC));

        menuBar.add(style);
        style.add(plain);
        style.add(bold);
        style.add(italic);

        /* Size submenu **/
        JMenu size = new JMenu("Tamaño");
        JMenuItem size12 = new JMenuItem("12");
        size12.addActionListener(changeSize(12));
        JMenuItem size16 = new JMenuItem("16");
        size16.addActionListener(changeSize(16));
        JMenuItem size20 = new JMenuItem("20");
        size20.addActionListener(changeSize(20));
        JMenuItem size24 = new JMenuItem("24");
        size24.addActionListener(changeSize(24));

        menuBar.add(size);
        size.add(size12);
        size.add(size16);
        size.add(size20);
        size.add(size24);


        /* Text Panel */

        textPanel = new JTextPane();


        /* Adding all to the interface */

        menuPanel.add(menuBar);

        add(menuPanel, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);
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