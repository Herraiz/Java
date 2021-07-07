package lenguaje;

import java.util.Scanner;

public class Uso_Tallas {

    /* Tipos enumerados - se crean fuera del main
    *
    * Sirven para almacenar distintos tipos de objetos */

    /* Se pueden construir métodos en los tipos enumerados */

    enum Size {

        MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");

        private final String abbreviation;

        Size(String abbreviation) {
            this.abbreviation = abbreviation;
        }

        public String getAbbreviation() {
            return abbreviation;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUY_GRANDE");

        String data_input = input.next().toUpperCase();

        Size the_size = Enum.valueOf(Size.class, data_input);

        System.out.println("Talla: " + the_size + " (" + the_size.abbreviation + ")");

    }
}