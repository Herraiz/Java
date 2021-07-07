package com.herraiz;

import java.util.Scanner;

public class Entrada_Scanner {

    public static void main(String[] args) {

        // Invocamos al constructor

        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce tu nombre, por favor");

        // Pedimos al usuario unos datos

        String nombre_usuario = entrada.nextLine();

        System.out.println("Introduce tu edad, por favor");

        int edad_usuario = entrada.nextInt();

        System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + (edad_usuario + 1) + " años."); // Importante el paréntesis

        // Vídeo 15

    }

}
