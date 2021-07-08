package gui;

import javax.swing.*;
import java.awt.*;

public class Layout_BorderLayout {

    public static void main(String[] args) {

        MarcoBorderLayout frame = new MarcoBorderLayout();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class MarcoBorderLayout extends JFrame {

    public MarcoBorderLayout(){
        setTitle("Prueba layouts");
        setBounds(600, 350, 600, 300);

        PanelBorderLayout borderPanel = new PanelBorderLayout();
        add(borderPanel, BorderLayout.SOUTH);

        PanelFlowLayout2 flowPanel = new PanelFlowLayout2();
        add(flowPanel, BorderLayout.NORTH);
    }
}

class PanelBorderLayout extends JPanel {
    public PanelBorderLayout(){

        setLayout(new BorderLayout());
        add(new JButton("Azul"), BorderLayout.WEST);
        add(new JButton("Verde"), BorderLayout.EAST);
        add(new JButton("Negro"), BorderLayout.CENTER);

    }

}

class PanelFlowLayout2 extends JPanel {
    PanelFlowLayout2(){

        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(new JButton("Amarillo"));
        add(new JButton("Rojo"));

    }
}
