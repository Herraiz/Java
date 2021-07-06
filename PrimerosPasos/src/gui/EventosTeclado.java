package gui;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventosTeclado {

    public static void main(String[] args) {

        MarcoConTeclas myFrame = new MarcoConTeclas();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoConTeclas extends JFrame {
    public MarcoConTeclas(){
        setVisible(true);
        setBounds(700, 300, 600, 450);
        addKeyListener(new EventoDeTeclado());
    }
}

class EventoDeTeclado implements KeyListener {


    @Override
    public void keyTyped(KeyEvent e) {
        System.out.print(e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}