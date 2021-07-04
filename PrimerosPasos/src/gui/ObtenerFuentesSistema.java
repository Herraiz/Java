package gui;

import javax.swing.*;
import java.awt.*;

public class ObtenerFuentesSistema {

    public static void main(String[] args) {

        String font = JOptionPane.showInputDialog("Introduce fuente");
        boolean itsFont = false;

        String[] namesOfFonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for (String fontName : namesOfFonts) {
            if (fontName.equalsIgnoreCase(font)) {
                itsFont = true;
                break;
            }

        }

        if (itsFont) {
            System.out.println("Fuente instalada");
        } else {
            System.out.println("Fuente no instalada");
        }

    }
}
