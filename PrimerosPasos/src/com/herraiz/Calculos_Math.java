package com.herraiz;

public class Calculos_Math {

    public static void main(String[] args) {

        // Math.sqrt()

        double raiz = Math.sqrt(9);

        System.out.println(raiz);


        // Math.round()

        float num1 = 5.85F;

        int resultado  = Math.round(num1);

        System.out.println(resultado);


        // Refundición, forzamos la conversión pese a la pérdida de información

        double num2 = 5.85;

        int resultado2  = (int)Math.round(num2);

        System.out.println(resultado2);


        // Potencias

        double base = 5;
        double exponente = 3;

        double potencia = Math.pow(base, exponente);

        System.out.println("El resultado de la potencia de base " + base + " y exponente " + exponente + " es " + potencia);


    }
}
