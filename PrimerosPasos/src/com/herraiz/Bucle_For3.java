package com.herraiz;

import javax.swing.*;

import static java.lang.Integer.parseInt;


public class Bucle_For3 {

    public static void main(String[] args) {

        Long result = 1L;

        int number = parseInt(JOptionPane.showInputDialog(null,
                "Introduce un número",
                "Calculadora de factorial",
                JOptionPane.INFORMATION_MESSAGE));

        for (int i = number; i > 0; i--) {
            result = result * i;
        }

        JOptionPane.showMessageDialog(null,
                "El factorial de " + number + " es " + result);

    }
}
