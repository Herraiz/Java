package Excepciones_I;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDatos {

    public static void main(String[] args) {

        System.out.println("Qué deseas hacer?");
        System.out.println("1. Introducir datos");
        System.out.println("2. Salir del programa");

        Scanner entrada = new Scanner(System.in);

        int decision = entrada.nextInt();

        if (decision == 1) {
            pedirDatos();

        } else {
            System.out.println("Adiós");
            System.exit(0);
        }

        entrada.close();

    }

    static void pedirDatos() throws InputMismatchException {

        /* Si no va bien el método, lanzará el objeto InputMismatchException */

        try {

            Scanner entrada = new Scanner(System.in);

            System.out.println("Introduce tu nombre, por favor");
            String nombre_usuario = entrada.nextLine();

            System.out.println("Introduce edad, por favor");
            int edad = entrada.nextInt();

            System.out.println("Hola " + nombre_usuario + ". El a�o que viene tendrás " + (edad + 1) + " años");
            entrada.close();
        } catch (InputMismatchException e) { // o Exception y funcionará con cualquier error
            System.out.println("Error detectado: " + e);
        }

        System.out.println("Hemos terminado.");

    }

}
