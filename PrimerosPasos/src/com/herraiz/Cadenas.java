package com.herraiz;

public class Cadenas {

    public static void main(String[] args) {

        String nombre = "Roberto";

        System.out.println("Mi nombre es " + nombre);

        System.out.println("Tiene un total de " + nombre.length() + " letras");

        System.out.println("La primera letra es " + nombre.charAt(0));

        int ultima_letra = nombre.length(); // Cuenta el 0

        System.out.println("La última letra es " + nombre.charAt(ultima_letra - 1)); // Le quitamos 1 para "descontar" el 0
        

        // Vídeo 12

        String frase = "Hoy es un estupendo día para aprender a programar en Java";

        String subfrase = frase.substring(29, 49);

        System.out.println(subfrase);



    }
}
