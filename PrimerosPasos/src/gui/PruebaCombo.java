package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PruebaCombo {

    public static void main(String[] args) {

        MarcoCombo myFrame = new MarcoCombo();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MarcoCombo extends JFrame {

    public MarcoCombo() {
        setBounds(600, 300, 550, 350);
        PanelCombo myPanel = new PanelCombo();
        add(myPanel);
        setVisible(true);
    }
}

class PanelCombo extends JPanel {

    private JLabel text;
    private JComboBox myCombo;

    public PanelCombo() {
        setLayout(new BorderLayout());
        text = new JLabel("En un lugar de la Mancha de cuyo nombre ...");
        text.setFont(new Font("Serif", Font.PLAIN, 18));
        this.add(text, BorderLayout.CENTER);

        JPanel northPanel = new JPanel();

        myCombo = new JComboBox();
        myCombo.setEditable(true);
        myCombo.addItem("Serif");
        myCombo.addItem("Arial");
        myCombo.addItem("Monospaced");
        myCombo.addItem("Dialog");

        northPanel.add(myCombo);
        this.add(northPanel, BorderLayout.NORTH);

        ActionListener myEvent = e -> text.setFont(new Font((String) myCombo.getSelectedItem(), Font.PLAIN, 18));
        myCombo.addActionListener(myEvent);
    }
}