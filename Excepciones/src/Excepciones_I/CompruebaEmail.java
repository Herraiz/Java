package Excepciones_I;


import javax.swing.*;

public class CompruebaEmail {


    public static void main(String[] args) {


        String email = JOptionPane.showInputDialog(null,
                "Por favor, introduce tu correo electrónico",
                "Aplicación de correo",
                JOptionPane.INFORMATION_MESSAGE);

        try {
            checkEmail(email);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error detectado: " + e);
        }

    }

    private static void checkEmail(String email) throws ArrayIndexOutOfBoundsException {

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
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
