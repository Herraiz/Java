package Excepciones_I;


import javax.swing.*;
import java.io.EOFException;
import java.io.IOException;

public class CompruebaEmail {


    public static void main(String[] args) {


        String email = JOptionPane.showInputDialog(null,
                "Por favor, introduce tu correo electrónico",
                "Aplicación de correo",
                JOptionPane.INFORMATION_MESSAGE);


//        try {
//            checkEmail(email);
//        } catch (EOFException e) {
//            System.out.println("Error detectado: " + e);
//        }

        try {
            checkEmail(email);
        } catch (IncorrectMailLength e) {
            System.out.println("Error detectado: " + e.getMessage());
        }

    }

    private static void checkEmail(String email) throws IncorrectMailLength {

        /* EOFException hereda de IOException y por lo tanto te obliga a usar un bloque try - catch */

        int arroba = 0;
        boolean point = false;

        if (email.length() > 3) {

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
        } else {
//            throw new EOFException();
            throw new IncorrectMailLength("El email es demasiado corto.");
        }
    }
}

class IncorrectMailLength extends Exception {

    /* Cuando creas una excepción propia, está bien crear el constructor
    por defecto y otro que admita el mensaje de error */

    public IncorrectMailLength(){};

    public IncorrectMailLength(String error) {

        super(error);

    }

}
