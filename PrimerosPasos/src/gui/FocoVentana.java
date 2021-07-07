package gui;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class FocoVentana extends JFrame implements WindowFocusListener {

    FocoVentana frame1;
    FocoVentana frame2;

    public static void main(String[] args) {

        FocoVentana myWindow = new FocoVentana();
        myWindow.start();


    }

    public void start(){

        frame1 = new FocoVentana();
        frame2 = new FocoVentana();
        frame1.setVisible(true);
        frame2.setVisible(true);
        frame1.setBounds(300, 300, 600, 350);
        frame2.setBounds(900, 300, 600, 350);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame1.addWindowFocusListener(this);  // la propia clase es listener
        frame2.addWindowFocusListener(this);
    }

    @Override
    public void windowGainedFocus(WindowEvent e) {

        if(e.getSource() == frame1) {
            frame1.setTitle("Tengo el foco!!");
        } else {
            frame2.setTitle("Tengo el foco!!");
        }

    }

    @Override
    public void windowLostFocus(WindowEvent e) {

        if(e.getSource() == frame1) {
            frame1.setTitle("");
        } else {
            frame2.setTitle("");
        }

    }
}
