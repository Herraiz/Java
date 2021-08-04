package gui;

import javax.swing.*;

public class DisposicionMuelle {

    public static void main(String[] args) {

        MarcoMuelle myFrame = new MarcoMuelle();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MarcoMuelle extends JFrame {

    public MarcoMuelle() {
        setBounds(600, 300, 1000, 350);
        PanelMuelle myPanel = new PanelMuelle();
        add(myPanel);
        setVisible(true);
    }
}

class PanelMuelle extends JPanel {

    public PanelMuelle() {

        JButton button1 = new JButton("Botón 1");
        JButton button2 = new JButton("Botón 2");
        JButton button3 = new JButton("Botón 3");

        /* Layouts */
        SpringLayout myLayout = new SpringLayout();
        setLayout(myLayout);

        add(button1);
        add(button2);
        add(button3);

        /* Springs (resortes o muelles) */
        Spring borderSpring = Spring.constant(0, 10, 100);
        Spring rigidSpring = Spring.constant(20);

        /* Como poner los muelles -> Se debe hacer de derecha a izquierda
        *   e1 – Anclaje del primer componente
            c1 – Primer componente
            s – Muelle
            e2 – Anclaje del segundo componente
            c2 – Segundo componente
        * */

        myLayout.putConstraint(SpringLayout.WEST, button1, borderSpring, SpringLayout.WEST, this); // entre marco izquierdo y botón 1
        myLayout.putConstraint(SpringLayout.WEST, button2, rigidSpring, SpringLayout.EAST, button1); // entre botón 1 y 2
        myLayout.putConstraint(SpringLayout.WEST, button3, rigidSpring, SpringLayout.EAST, button2); // entre botón 2 y botón 3
        myLayout.putConstraint(SpringLayout.EAST, this, borderSpring, SpringLayout.EAST, button3); // entre botón 3 y marco derecho


    }

}