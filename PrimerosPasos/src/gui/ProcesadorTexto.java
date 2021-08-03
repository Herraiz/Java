package gui;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
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
        menuConfig("Arial", "Fuente", "Arial", 9, 10, "");
        menuConfig("Courier", "Fuente", "Courier", 9, 10, "");
        menuConfig("Verdana", "Fuente", "Verdana", 9, 10, "");


        /* Style submenu **/
        style = new JMenu("Estilo");
        menuConfig("Negrita", "Estilo", "", Font.BOLD, 1, "./src/gui/bold.png");
        menuConfig("Cursiva", "Estilo", "", Font.ITALIC, 1, "./src/gui/italic.png");
//        JCheckBoxMenuItem bold = new JCheckBoxMenuItem("Negrita", new ImageIcon("./src/gui/bold.png"));
//        JCheckBoxMenuItem italic = new JCheckBoxMenuItem("Cursiva", new ImageIcon("./src/gui/italic.png"));
//        style.add(bold);
//        style.add(italic);
//        bold.addActionListener(new StyledEditorKit.BoldAction());
//        italic.addActionListener(new StyledEditorKit.ItalicAction());

        /* Size submenu **/
        size = new JMenu("Tamaño");
//        menuConfig("12", "Tamaño", "", 9, 12, "");
//        menuConfig("16", "Tamaño", "", 9, 16, "");
//        menuConfig("20", "Tamaño", "", 9, 20, "");
//        menuConfig("24", "Tamaño", "", 9, 24, "");

        ButtonGroup fontSize = new ButtonGroup();
        JRadioButtonMenuItem size12 = new JRadioButtonMenuItem("12");
        JRadioButtonMenuItem size16 = new JRadioButtonMenuItem("16");
        JRadioButtonMenuItem size20 = new JRadioButtonMenuItem("20");
        JRadioButtonMenuItem size24 = new JRadioButtonMenuItem("24");
        fontSize.add(size12);
        fontSize.add(size16);
        fontSize.add(size20);
        fontSize.add(size24);
        size.add(size12);
        size.add(size16);
        size.add(size20);
        size.add(size24);
        size12.addActionListener(new StyledEditorKit.FontSizeAction("Change size", 12));
        size16.addActionListener(new StyledEditorKit.FontSizeAction("Change size", 16));
        size20.addActionListener(new StyledEditorKit.FontSizeAction("Change size", 20));
        size24.addActionListener(new StyledEditorKit.FontSizeAction("Change size", 24));


        /* Text Panel */

        textPanel = new JTextPane();


        /* Adding all to the interface */

        menuBar.add(font);
        menuBar.add(style);
        menuBar.add(size);

        menuPanel.add(menuBar);

        add(menuPanel, BorderLayout.NORTH);
        add(textPanel, BorderLayout.CENTER);

        JPopupMenu popup = new JPopupMenu();

        JMenuItem popupBold = new JMenuItem("Negrita", new ImageIcon("./src/gui/bold.png"));
        JMenuItem popupItalic = new JMenuItem("Cursiva", new ImageIcon("./src/gui/italic.png"));
        popup.add(popupBold);
        popup.add(popupItalic);
        popupBold.addActionListener(new StyledEditorKit.BoldAction());
        popupItalic.addActionListener(new StyledEditorKit.ItalicAction());

        textPanel.setComponentPopupMenu(popup);

    }

    public void menuConfig(String title, String menu, String font, int style, int size, String icon) {
        JMenuItem menuItem = new JMenuItem(title, new ImageIcon(icon));
        switch (menu) {
            case "Fuente" -> {
                this.font.add(menuItem);

                if (Objects.equals(font, "Arial")) {
                    menuItem.addActionListener(new StyledEditorKit.FontFamilyAction("Change size", "Arial"));
                } else if (Objects.equals(font, "Verdana")) {
                    menuItem.addActionListener(new StyledEditorKit.FontFamilyAction("Change size", "Verdana"));
                } else if (Objects.equals(font, "Courier")) {
                    menuItem.addActionListener(new StyledEditorKit.FontFamilyAction("Change size", "Courier"));
                }
            }
            case "Estilo" -> {
                this.style.add(menuItem);
                if (style == Font.BOLD) {
                    menuItem.addActionListener(new StyledEditorKit.BoldAction());
                } else if ((style == Font.ITALIC)) {
                    menuItem.addActionListener(new StyledEditorKit.ItalicAction());
                }
            }
            /* 
            case "Tamaño" -> {
                this.size.add(menuItem);
                menuItem.addActionListener(new StyledEditorKit.FontSizeAction("Change size", size));
            } */
        }
    }
}