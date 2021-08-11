package dialogos;

import javax.swing.*;

public class PanelBotones extends JPanel {

    public PanelBotones(String title, String[] options) {

        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), title));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        ButtonGroup buttonGroup = new ButtonGroup();

        for (String option : options) {

            JRadioButton radioButton = new JRadioButton(option);
            add(radioButton);
            buttonGroup.add(radioButton);

        }

    }


}
