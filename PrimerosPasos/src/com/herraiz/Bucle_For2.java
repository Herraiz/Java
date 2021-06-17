package com.herraiz;

import javax.swing.*;

public class Bucle_For2 {

    public static void main(String[] args) {

        boolean arroba = false;
        String email = JOptionPane.showInputDialog(null,
                "Por favor, introduce tu correo electrónico",
                "Aplicación de correo",
                JOptionPane.INFORMATION_MESSAGE);

        for (int i = 0; i < email.length(); i++) {

            if (email.charAt(i) == '@') {
                arroba = true;
                break;
            }
        }

        if (arroba) {
            JOptionPane.showMessageDialog(null,
                    "Email correcto");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Email incorrecto");
        }
    }
}
