package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class EventosFoco {

    public static void main(String[] args) {

        MarcoFoco myFrame = new gui.MarcoFoco();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoFoco extends JFrame {
    public MarcoFoco(){
        setVisible(true);
        setBounds(300, 300, 600, 450);
        PanelFoco myPanel = new PanelFoco();
        add(myPanel);
    }
}

class PanelFoco extends JPanel {

    JTextField frame1;
    JTextField frame2;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        setLayout(null);  // Al no haber layout, podemos colocar los elementos donde queramos

        frame1 = new JTextField();
        frame1.setBounds(120, 10, 150, 20);
        frame2 = new JTextField();
        frame2.setBounds(120, 50, 150, 20);

        add(frame1);
        add(frame2);

        EventoFoco myFocus = new EventoFoco();

        frame1.addFocusListener(myFocus);
        frame2.addFocusListener(myFocus);

        Font myFont = new Font("Calibri", Font.BOLD, 13);
        g2.setFont(myFont);

        g2.drawString("Introduce nombre:", 10, 25);
        g2.drawString("Introduce email:", 10, 65);

    }

    /* Usamos una inner class para poder tener acceso desde el evento al contenido de frame1 y frame2 */

    private class EventoFoco implements FocusListener {


        @Override
        public void focusGained(FocusEvent e) {

        }

        @Override
        public void focusLost(FocusEvent e) {
            String email = frame2.getText();
            boolean check = false;

            for (int i = 0; i < email.length(); i++) {
                if (email.charAt(i) == '@') {
                    check = true;
                    break;
                }
            }

            if (check) {
                System.out.println("Email correcto");
            } else {
                System.out.println("Email incorrecto");
            }
        }
    }

}

