package gui;

import javax.swing.*;
import java.awt.*;

public class PruebaDisposiciones {

    public static void main(String[] args) {

        MarcoCaja myFrame = new MarcoCaja();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }

}

class MarcoCaja extends JFrame {

    public MarcoCaja() {
        setBounds(600, 300, 250, 150);

        /* 1st Horizontal Box */

        JLabel title1 = new JLabel("Usuario");
        JTextField text1 = new JTextField(10);
        text1.setMaximumSize(text1.getPreferredSize()); // Hace que el JLabel no crezca más de lo puesto

        Box boxh1 = Box.createHorizontalBox();
        boxh1.add(title1);
        boxh1.add(Box.createHorizontalStrut(10));
        boxh1.add(text1);

        /* 2nd Horizontal Box */

        JLabel title2 = new JLabel("Contraseña");
        JTextField text2 = new JPasswordField(10);
        text2.setMaximumSize(text2.getPreferredSize());

        Box boxh2 = Box.createHorizontalBox();
        boxh2.add(title2);
        boxh2.add(Box.createHorizontalStrut(10));
        boxh2.add(text2);

        /* 3rd Horizontal Box */

        JButton button1 = new JButton("Ok");
        JButton button2 = new JButton("Cancelar");

        Box boxh3 = Box.createHorizontalBox();
        boxh3.add(button1);
        boxh3.add(Box.createGlue());
        boxh3.add(button2);

        /* Main Vertical Box */
        Box boxv = Box.createVerticalBox();

        /* Adding the boxes */

        add(boxv, BorderLayout.CENTER);
        boxv.add(boxh1);
        boxv.add(boxh2);
        boxv.add(boxh3);
    }
}
