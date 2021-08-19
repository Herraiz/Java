package Excepciones_I;

import javax.swing.*;

public class Fallos {

    public static void main(String[] args) {

        int[] matrix = new int[5];

        matrix[0] = 5;
        matrix[1] = 38;
        matrix[2] = -15;
        matrix[3] = 92;
        matrix[4] = 71;
        matrix[5] = 81;



        for (int i = 0; i < 5; i++) {
            System.out.println("Posición " + i + " = " + matrix[i]);
        }

        String name = JOptionPane.showInputDialog("Introduce tu nombre");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
        System.out.println("Hola " + name + ". Tienes " + age + " años. " + "El programa terminó su ejecución");


    }
}