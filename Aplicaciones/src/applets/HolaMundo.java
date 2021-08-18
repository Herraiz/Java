package applets;

import javax.swing.*;

public class HolaMundo extends JApplet {

    /* Los applets no llevan método main, usan el método init */

        public void init() {
            JLabel title = new JLabel("Hola, Mundo!");
            add(title);
        }


}
