package dialogos;

import javax.swing.*;

public class PanelBotones extends JPanel {

    public ButtonGroup buttonGroup;

    public PanelBotones(String title, String[] options) {

        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), title));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        buttonGroup = new ButtonGroup();

        int counter = 0;

        for (String option : options) {
            JRadioButton radioButton = new JRadioButton(option);
            radioButton.setActionCommand(option); // necessary for getSelection
            add(radioButton);
            buttonGroup.add(radioButton);

            if (counter == 0) {
                radioButton.setSelected(true);
            }

            counter++;

        }
    }

    public String getSelection() {
        return buttonGroup.getSelection().getActionCommand();
    }


}
