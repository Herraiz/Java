package gui;

import javax.swing.*;
import java.awt.*;

public class PruebaSpinner {

    public static void main(String[] args) {

        MarcoSpinner myFrame = new MarcoSpinner();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

class MarcoSpinner extends JFrame {

    public MarcoSpinner() {
        setBounds(600, 300, 550, 350);
        PanelSpinner myPanel = new PanelSpinner();
        add(myPanel);
        setVisible(true);
    }
}

class PanelSpinner extends JPanel {

    public PanelSpinner() {

//        String list[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        /* Usaremos una clase interna anónima para sobrescribir los métodos sin escribir mucho */

        JSpinner control = new JSpinner(new SpinnerNumberModel(5, 0, 10, 1) {

            @Override
            public Object getNextValue() {
                return super.getPreviousValue();
            }

            @Override
            public Object getPreviousValue() {
                return super.getNextValue();
            }

        });

        control.setPreferredSize(new Dimension(100, 20));

        add(control);
    }

    /* Forma clásica, heredando y sustituyendo
    private class MiModeloJSpinner extends SpinnerNumberModel {

        public MiModeloJSpinner() {
            super(5, 0, 10, 1);
        }

        @Override
        public Object getNextValue() {
            return super.getPreviousValue();
        }

        @Override
        public Object getPreviousValue() {
            return super.getNextValue();
        }
    }
     */
}