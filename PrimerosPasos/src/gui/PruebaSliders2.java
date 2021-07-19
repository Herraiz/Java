package gui;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class PruebaSliders2 {

    public static void main(String[] args) {

        MarcoSliders2 myFrame = new MarcoSliders2();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MarcoSliders2 extends JFrame {

    public MarcoSliders2() {
        setBounds(600, 300, 550, 350);
        PanelSliders2 myPanel = new PanelSliders2();
        add(myPanel);
        setVisible(true);
    }
}

class PanelSliders2 extends JPanel {

    private JLabel text;
    private JSlider control;

    public PanelSliders2() {
        setLayout(new BorderLayout());
        text = new JLabel("En un lugar de la Mancha de cuyo nombre ...");
        this.add(text, BorderLayout.CENTER);

        control = new JSlider(8, 48, 12);
        control.setMajorTickSpacing(10);
        control.setMinorTickSpacing(5);
        control.setPaintTicks(true);
        control.setPaintLabels(true);
        control.addChangeListener(new EventoSlider());

        control.setFont(new Font("Serif", Font.PLAIN, 10));

        JPanel sliderPanel = new JPanel();
        sliderPanel.add(control);
        this.add(sliderPanel, BorderLayout.NORTH);
    }

    private class EventoSlider implements ChangeListener {

        @Override
        public void stateChanged(ChangeEvent e) {
            text.setFont(new Font("Serif", Font.PLAIN, control.getValue()));
        }
    }

}