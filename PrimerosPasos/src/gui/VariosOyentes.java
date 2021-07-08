package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VariosOyentes {

    public static void main(String[] args) {

        MarcoPrincipal mainFrame = new MarcoPrincipal();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);

    }
}

class MarcoPrincipal extends JFrame {
    public MarcoPrincipal(){
        setTitle("Prueba varios");
        setBounds(1300, 100, 300, 200);
        PanelPrincipal panel = new PanelPrincipal();
        add(panel);
    }
}

class PanelPrincipal extends JPanel {

    JButton closeButton;

    public PanelPrincipal(){
        JButton newButton = new JButton("Nuevo");
        add(newButton);

        closeButton = new JButton("Cerrar todo");
        add(closeButton);

        NewListener newListener = new NewListener();
        newButton.addActionListener(newListener);
    }

    private class NewListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            MarcoEmergente frame = new MarcoEmergente(closeButton);
            frame.setVisible(true);
        }
    }

}

class MarcoEmergente extends JFrame {

    private static int counter = 0;

    public MarcoEmergente(JButton closeButton){
        counter++;
        setTitle("Ventana " + counter);
        setBounds(40 * counter, 40 * counter, 300, 150);
        CloseAll closeListener = new CloseAll();
        closeButton.addActionListener(closeListener);

    }

    private class CloseAll implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
            counter = 0;
        }
    }

}