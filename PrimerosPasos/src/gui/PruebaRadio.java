package gui;

import javax.swing.*;

public class PruebaRadio {

    public static void main(String[] args) {

        MarcoRadio myFrame = new MarcoRadio();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MarcoRadio extends JFrame {

    public MarcoRadio() {
        setBounds(600, 300, 550, 350);
        PanelRadio myPanel = new PanelRadio();
        add(myPanel);
        setVisible(true);

    }

}

class PanelRadio extends JPanel {


    public PanelRadio() {

        /* Los botones de radio funcionan con grupos */

        ButtonGroup myGroup = new ButtonGroup();
        ButtonGroup myGroup2 = new ButtonGroup();

        JRadioButton button1 = new JRadioButton("Azul", false);
        JRadioButton button2= new JRadioButton("Rojo", true);
        JRadioButton button3 = new JRadioButton("Amarillo", false);

        JRadioButton button4 = new JRadioButton("Masculino", false);
        JRadioButton button5= new JRadioButton("Femenino", true);

        myGroup.add(button1);
        myGroup.add(button2);
        myGroup.add(button3);

        myGroup2.add(button4);
        myGroup2.add(button5);

        this.add(button1);
        this.add(button2);
        this.add(button3);

        this.add(button4);
        this.add(button5);



    }

}