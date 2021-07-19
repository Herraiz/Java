package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PruebaRadio2 {

    public static void main(String[] args) {

        MarcoRadio2 myFrame = new MarcoRadio2();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MarcoRadio2 extends JFrame {

    public MarcoRadio2() {
        setBounds(600, 300, 550, 350);
        PanelRadio2 myPanel = new PanelRadio2();
        add(myPanel);
        setVisible(true);
    }
}

class PanelRadio2 extends JPanel {

    private final JLabel text;
    private ButtonGroup myGroup;
    private JPanel panelButtons;

    public PanelRadio2() {

        setLayout(new BorderLayout());
        text = new JLabel("En un lugar de la Mancha de cuyo nombre ...");
        text.setFont(new Font("Serif", Font.PLAIN, 12));
        add(text, BorderLayout.CENTER);

        panelButtons = new JPanel();
        myGroup = new ButtonGroup();
        putButtons("Pequeño", false, 10);
        putButtons("Mediano", true, 12);
        putButtons("Grande", false, 18);
        putButtons("Muy grande", false, 24);

        add(panelButtons, BorderLayout.SOUTH);
    }

    public void putButtons(String name, boolean selected, final int size) {
        JRadioButton button = new JRadioButton(name, selected);
        myGroup.add(button);
        panelButtons.add(button);
        /* Lambda */
        ActionListener myEvent = e -> text.setFont(new Font("Serif", Font.PLAIN, size));
        button.addActionListener(myEvent);
    }
}