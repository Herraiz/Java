package com.herraiz;

import javax.swing.*;

public class Bucle_While_1 {

    public static void main(String[] args) {

        String hardcoded_pass = "Roberto";

        String pass = "";

        while (!hardcoded_pass.equals(pass)) {

            pass = JOptionPane.showInputDialog(null,
                    "Por favor, introduce la contraseña",
                    "Acceso a la aplicación",
                    JOptionPane.INFORMATION_MESSAGE);

            if (!hardcoded_pass.equals(pass)) {
                JOptionPane.showMessageDialog(null,
                        "Contraseña incorrecta");
            }

        }

        JOptionPane.showMessageDialog(null,
                "Contraseña correcta. Acceso permitido");
    }
}
