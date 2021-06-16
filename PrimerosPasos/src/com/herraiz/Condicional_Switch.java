package com.herraiz;

import javax.swing.*;
import java.util.Scanner;

import static java.lang.Double.parseDouble;

public class Condicional_Switch {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("""
                Elige una opción:
                1. Cuadrado
                2. Rectángulo
                3. Triángulo
                4. Círculo""");

        int figura = entrada.nextInt();

        double area;

        switch (figura) {
            case 1 -> { // Cuadrado
                double lado = parseDouble(JOptionPane.showInputDialog("Introduce el lado"));
                area = Math.pow(lado, 2);
                System.out.println("El área del cuadrado es " + area);
            }
            case 2 -> {  // Rectángulo
                double base = parseDouble(JOptionPane.showInputDialog("Introduce la base"));
                double altura = parseDouble(JOptionPane.showInputDialog("Introduce la altura"));
                area = base * altura;
                System.out.println("El área del rectángulo es " + area);
            }
            case 3 -> { // Triángulo
                double base = parseDouble(JOptionPane.showInputDialog("Introduce la base"));
                double altura = parseDouble(JOptionPane.showInputDialog("Introduce la altura"));
                area = (base * altura)/2;
                System.out.println("El área del triángulo es " + area);
            }
            case 4 -> { // Círculo
                double radio = parseDouble(JOptionPane.showInputDialog("Introduce el radio"));
                area = Math.pow(radio, 2) * Math.PI;
                System.out.print("El área del círculo es ");
                System.out.printf("%1.2f", area);
            }
            default ->{
                System.out.println("La opción no es correcta. Cerrando el programa.");
            }

        }

    }
}
