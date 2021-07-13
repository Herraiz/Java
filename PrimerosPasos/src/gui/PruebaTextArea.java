package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaTextArea {

    public static void main(String[] args) {

        MarcoArea myFrame = new MarcoArea();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MarcoArea extends JFrame {

    public MarcoArea() {
        setBounds(600, 300, 500, 350);
        PanelArea myPanel = new PanelArea();
        add(myPanel);
        setVisible(true);

    }

}

class PanelArea extends JPanel {

    JTextArea area1;

    public PanelArea() {
        area1 = new JTextArea(10,20);

        /* Autosaltos de línea visuales (horizontal) */
        area1.setLineWrap(true);

        /* Añadimos el TextArea a un JScrollPane para controlar que no amplíe en la vertical */
        JScrollPane areaPanel = new JScrollPane(area1);
        add(areaPanel);

        JButton print = new JButton("Send");
        add(print);
        print.addActionListener(new GestionaArea());
    }

    private class GestionaArea implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(area1.getText());
        }
    }


}