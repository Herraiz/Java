package com.herraiz;

import javax.swing.*;

import static java.lang.Integer.parseInt;

public class Entrada_JOptionPane {

    public static void main(String[] args) {

        String nombre_usuario = JOptionPane.showInputDialog("Por favor, introduce tu nombre");

        String edad_usuario = JOptionPane.showInputDialog("Por favor, introduce tu edad");

        System.out.println("Hola " + nombre_usuario + ". Tienes " + edad_usuario + " años.");


        // Para operar con la edad tenemos que convertirlo a entero

        int numero_edad = parseInt(edad_usuario);

        System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + (numero_edad + 1) + " años.");

        // También nos hubiera servido numero_edad++; pero a mi me parece menos legible

    }
}
