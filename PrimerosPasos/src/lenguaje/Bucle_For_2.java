package lenguaje;

import javax.swing.*;

public class Bucle_For_2 {

    public static void main(String[] args) {

        int arroba = 0;
        boolean point = false;

        String email = JOptionPane.showInputDialog(null,
                "Por favor, introduce tu correo electrónico",
                "Aplicación de correo",
                JOptionPane.INFORMATION_MESSAGE);

        for (int i = 0; i < email.length(); i++) {

            if (email.charAt(i) == '@') {
                arroba++;
            }

            if (email.charAt(i) == '.') {
                point = true;
            }
        }

        if (arroba == 1 && point) {
            JOptionPane.showMessageDialog(null,
                    "Email correcto");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Email incorrecto");
        }
    }
}
