package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaEventos {

    public static void main(String[] args) {

        MarcoBotones mainFrame = new MarcoBotones();
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoBotones extends JFrame {

    public MarcoBotones() {

        setTitle("Botones y eventos");
        setBounds(700, 300, 500, 200);

        PanelBotones myPanel = new PanelBotones();
        add(myPanel);

    }

}

class PanelBotones extends JPanel implements ActionListener {

    JButton blueButton = new JButton("Azul");
    JButton yellowButton = new JButton("Amarillo");
    JButton redButton = new JButton("Rojo");

    public PanelBotones() {
        add(blueButton);
        add(yellowButton);
        add(redButton);

        /* 3 Fuentes - 1 oyente */
        blueButton.addActionListener(this);  // al hacer click, el panel recibe el el evento
        yellowButton.addActionListener(this);
        redButton.addActionListener(this);

        /* qué evento se realiza? El que implementa la interfaz ActionListener */
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object pushedButton = e.getSource();

        if (pushedButton == blueButton) {
            setBackground(Color.BLUE);
        } else if (pushedButton == yellowButton) {
            setBackground(Color.YELLOW);
        } else if (pushedButton == redButton) {
            setBackground(Color.RED);
        }

    }
}
