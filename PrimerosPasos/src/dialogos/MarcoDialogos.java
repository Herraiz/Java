package dialogos;

import javax.swing.*;
import java.awt.*;

public class MarcoDialogos extends JFrame {

    public MarcoDialogos() {

        setTitle("Prueba de Diálogos");
        setBounds(500, 300, 600, 450);

        JPanel panelGrid = new JPanel();
        panelGrid.setLayout(new GridLayout(2, 3));
        add(panelGrid);

        
    }

}
