package gui;

import javax.swing.*;
import java.awt.*;

public class PruebaSliders {

    public static void main(String[] args) {

        MarcoSliders myFrame = new MarcoSliders();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MarcoSliders extends JFrame {

    public MarcoSliders() {
        setBounds(600, 300, 550, 350);
        PanelSliders myPanel = new PanelSliders();
        add(myPanel);
        setVisible(true);
    }
}

class PanelSliders extends JPanel {

    public PanelSliders() {
        JSlider control = new JSlider(0, 100, 50);
        control.setMajorTickSpacing(25);
        control.setMinorTickSpacing(5);
        control.setPaintTicks(true);
        control.setPaintLabels(true);
        control.setSnapToTicks(true); // solo acepta valores con marca

        control.setFont(new Font("Serif", Font.PLAIN, 12));

        this.add(control);

    }
}