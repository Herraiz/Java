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

    public int getMessageType() {

        // "ERROR_MESSAGE", "INFORMATION_MESSAGE","WARNING_MESSAGE", "QUESTION_MESSAGE", "PLAIN_MESSAGE"

        String messageType = messagetypePanel.getSelection();

        switch (messageType) {
            case "ERROR_MESSAGE" -> {
                return JOptionPane.ERROR_MESSAGE;
            }

            case "INFORMATION_MESSAGE" -> {
                return JOptionPane.INFORMATION_MESSAGE;
            }

            case "WARNING_MESSAGE" -> {
                return JOptionPane.WARNING_MESSAGE;
            }

            case "QUESTION_MESSAGE" -> {
                return JOptionPane.QUESTION_MESSAGE;
            }

            case "PLAIN_MESSAGE" -> {
                return JOptionPane.PLAIN_MESSAGE;
            }

        }

        return 0;

    }

    public int getConfirmOption() {

// "DEFAULT_OPTION", "YES_NO_OPTION", "YES_NO_CANCEL_OPTION", "OK_CANCEL_OPCION"

        String confirm = confirmPanel.getSelection();

        switch (confirm) {
            case "DEFAULT_OPTION" -> {
                return JOptionPane.DEFAULT_OPTION;
            }

            case "YES_NO_OPTION" -> {
                return JOptionPane.YES_NO_OPTION;
            }

            case "YES_NO_CANCEL_OPTION" -> {
                return JOptionPane.YES_NO_CANCEL_OPTION;
            }

            case "OK_CANCEL_OPCION" -> {
                return JOptionPane.OK_CANCEL_OPTION;
            }

        }

        return 0;

    }

    public Object[] getOption() {

//        "String[]", "Icon[]", "Object[]"

        String option = optionPanel.getSelection();

        
        switch (option) {
            case "String[]" -> {

                return new String[]{"Opción 1", "Opción 2", "Opción 3"};
            }

            case "Icon[]" -> {

                Icon[] icons = {
                        icon,
                        new ImageIcon("src/gui/red.png"),
                        new ImageIcon("src/gui/yellow.png")
                };

                return icons;
            }

            case "Object[]" -> {
                return new Object[]{string, icon, object};
            }

        }

        return null;

    }

    private ActionListener AccionMostrar() {

        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String type = typePanel.getSelection();

                String input = inputPanel.getSelection();

                switch (type) {
                    case "Mensaje" -> JOptionPane.showMessageDialog(
                            MarcoDialogos.this,
                            getMessage(),
                            "Título",
                            getMessageType()
                    );
                    case "Confirmar" -> JOptionPane.showConfirmDialog(
                            MarcoDialogos.this,
                            getMessage(),
                            "Título",
                            getConfirmOption(),
                            getMessageType()
                    );
                    case "Entrada" -> JOptionPane.showInputDialog(
                            MarcoDialogos.this,
                            getMessage(),
                            "Título",
                            getMessageType()
                    );
                    case "Opción" -> JOptionPane.showOptionDialog(
                            MarcoDialogos.this,
                            getMessage(),
                            "Título",
                            getConfirmOption(),
                            getMessageType(),
                            null,
                            getOption(),
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
