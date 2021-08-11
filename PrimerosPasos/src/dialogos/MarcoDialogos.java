package dialogos;

import javax.swing.*;
import java.awt.*;

public class MarcoDialogos extends JFrame {

    private PanelBotones typePanel;

    public MarcoDialogos() {

        setTitle("Prueba de Diálogos");
        setBounds(500, 300, 600, 450);

        JPanel panelGrid = new JPanel();
        panelGrid.setLayout(new GridLayout(2, 3));
        add(panelGrid);

        String[] primero = {"Mensaje", "Confirmar", "Opcion", "Entrada"};
        typePanel = new PanelBotones("Tipo", primero);
        panelGrid.add(typePanel);

        
        panelGrid.add(new PanelBotones("Confirmar", new String[]{"ERROR.MESSAGE", "INFORMATION_MESSAGE",
                "WARNING_MESSAGE", "QUESTION_MESSAGE",
                "PLAIN_MESSAGE"}));

        panelGrid.add(new PanelBotones("Tipo de Mensaje", new String[]{"Mensaje", "Confirmar", "Opcion", "Entrada"}));

        panelGrid.add(new PanelBotones("Opción", new String[]{"Mensaje", "Confirmar", "Opcion", "Entrada"}));

        panelGrid.add(new PanelBotones("Mensaje", new String[]{"Mensaje", "Confirmar", "Opcion", "Entrada"}));

        panelGrid.add(new PanelBotones("Entrada", new String[]{"Mensaje", "Confirmar", "Opcion", "Entrada"}));


    }

}
