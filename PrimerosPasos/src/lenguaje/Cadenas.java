package lenguaje;

public class Cadenas {

    public static void main(String[] args) {

        String nombre = "Roberto";

        System.out.println("Mi nombre es " + nombre);

        System.out.println("Tiene un total de " + nombre.length() + " letras");

        System.out.println("La primera letra es " + nombre.charAt(0));

        int ultima_letra = nombre.length(); // Cuenta el 0

        System.out.println("La última letra es " + nombre.charAt(ultima_letra - 1)); // Le quitamos 1 para "descontar" el 0


        // Vídeo 12

        System.out.println();

        String frase = "Hoy es un estupendo día para aprender a programar en Java";

        System.out.println("La frase es: " + frase);

        String subfrase = frase.substring(29, 49);

        System.out.println("La subfrase es: " + subfrase);


        System.out.println();

        String alumno1, alumno2;

        alumno1 = "David";
        alumno2 = "david";

        System.out.println("Las cadenas son iguales? -> " + alumno1.equals(alumno2));
        System.out.println("Las cadenas, ignorando mayúsculas, son iguales? -> " + alumno1.equalsIgnoreCase(alumno2));

    }
}
