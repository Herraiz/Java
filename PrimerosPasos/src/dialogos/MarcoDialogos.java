package dialogos;

import javax.swing.*;
import java.awt.*;

public class MarcoDialogos extends JFrame {

    private PanelBotones typePanel, messagetypePanel, confirmPanel,
            optionPanel, messagePanel, inputPanel;

    public MarcoDialogos() {

        setTitle("Prueba de Diálogos");
        setBounds(500, 300, 600, 450);


        JPanel panelGrid = new JPanel();
        setLayout(new BorderLayout());
        panelGrid.setLayout(new GridLayout(2, 3));
        add(panelGrid, BorderLayout.CENTER);

        /* Radio Buttons */

        String[] typeOptions = {"Mensaje", "Confirmar", "Opción", "Entrada"};
        typePanel = new PanelBotones("Tipo", typeOptions);
        panelGrid.add(typePanel);

        String[] confirmOptions = {"DEFAULT_OPTION", "YES_NO_OPTION", "YES_NO_CANCEL_OPTION", "OK_CANCEL_OPCION"};
        confirmPanel = new PanelBotones("Confirmar", confirmOptions);
        panelGrid.add(confirmPanel);


        String[] messageTypeOptions = {"ERROR_MESSAGE", "INFORMATION_MESSAGE",
                "WARNING_MESSAGE", "QUESTION_MESSAGE", "PLAIN_MESSAGE"};
        messagetypePanel = new PanelBotones("Confirmar", messageTypeOptions);
        panelGrid.add(messagetypePanel);

        String[] optionOptions = {"String[]", "Icon[]", "Object[]"};
        optionPanel = new PanelBotones("Opción", optionOptions);
        panelGrid.add(optionPanel);

        String[] messageOptions = {"Cadena", "Icono", "Componente", "Otros", "Object[]"};
        messagePanel = new PanelBotones("Mensaje", messageOptions);
        panelGrid.add(messagePanel);

        String[] inputOptions = {"Campo de texto", "Combo"};
        inputPanel = new PanelBotones("Entrada", inputOptions);
        panelGrid.add(inputPanel);

        /* Show Panel */
        JPanel showPanel = new JPanel();
        JButton showButton = new JButton("Mostrar");
        showPanel.add(showButton);
        add(showPanel, BorderLayout.SOUTH);


    }

}
