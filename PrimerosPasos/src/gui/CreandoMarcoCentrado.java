package gui;

import javax.swing.*;
import java.awt.*;

public class CreandoMarcoCentrado {
    public static void main(String[] args) {

        MarcoCentrado mainFrame = new MarcoCentrado();
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
}


class MarcoCentrado extends JFrame {

    MarcoCentrado(){

        Toolkit myScreen = Toolkit.getDefaultToolkit();
        Dimension  screenSize = myScreen.getScreenSize();

        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;

        setBounds(screenWidth/4, screenHeight/4, screenWidth/2, screenHeight/2);

        setTitle("Marco centrado");

        Image myIcon = myScreen.getImage("src/gui/icon.jpg");
        setIconImage(myIcon);

    }

}