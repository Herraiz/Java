package com.herraiz;

import javax.swing.*;

import static java.lang.Integer.parseInt;

public class Bucle_While3 {

    public static void main(String[] args) {

        String genero;

        do{
            genero = JOptionPane.showInputDialog(null,
                    "Por favor, introduce tu género (H/M)",
                    "Calculadora de peso ideal",
                    JOptionPane.INFORMATION_MESSAGE);
        } while (!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("M"));

        int altura = parseInt(JOptionPane.showInputDialog(null,
                "Introduce tu altura en centímetros",
                "Calculadora de peso ideal",
                JOptionPane.INFORMATION_MESSAGE));
        
        int peso_ideal = 0;

        if (genero.equalsIgnoreCase("H")) {
            peso_ideal = altura -110;
        } else {
            peso_ideal = altura -120;

        }

        JOptionPane.showMessageDialog(null,
                "Tu peso ideal es " + peso_ideal + " kgs");

    }
}
