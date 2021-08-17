package dialogos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.Date;

public class MarcoDialogos extends JFrame {

    private PanelBotones typePanel, messagetypePanel, confirmPanel,
            optionPanel, messagePanel, inputPanel;

    private String string = "Mensaje";
    private Icon icon = new ImageIcon("src/gui/blue.png");
    private Object object = new Date();
    private Component component = new PanelEjemplo();

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

        showButton.addActionListener(AccionMostrar());

    }

    public Object getMessage() {

        String message = messagePanel.getSelection();

        switch (message) {
            case "Cadena" -> {
                return string;
            }

            case "Icono" -> {
                return icon;
            }

            case "Componente" -> {
                return component;
            }

            case "Otros" -> {
                return object;
            }

            case "Object[]" -> {
                return new Object[]{string, icon, component, object};
            }

        }

        return null;

    }

    private ActionListener AccionMostrar() {

        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String type = typePanel.getSelection();
                String messageType = messagetypePanel.getSelection();

                String confirm = confirmPanel.getSelection();
                String option = optionPanel.getSelection();
                String input = inputPanel.getSelection();

                switch (type) {
                    case "Mensaje" -> JOptionPane.showMessageDialog(
                            MarcoDialogos.this,
                            getMessage(),
                            "Título",
                            0
                    );
                    case "Confirmar" -> JOptionPane.showConfirmDialog(
                            MarcoDialogos.this,
                            getMessage(),
                            "Título",
                            0,
                            0
                    );
                    case "Entrada" -> JOptionPane.showInputDialog(
                            MarcoDialogos.this,
                            getMessage(),
                            "Título",
                            0
                    );
                    case "Opción" -> JOptionPane.showOptionDialog(
                            MarcoDialogos.this,
                            getMessage(),
                            "Título",
                            0,
                            0,
                            null,
                            null,
                            null
                    );
                }

            }
        };
    }

    class PanelEjemplo extends JPanel {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;
            Rectangle2D rect = new Rectangle2D.Double(0, 0, getWidth(), getHeight());
            g2.setPaint(Color.YELLOW);
            g2.fill(rect);
        }
    }
}
