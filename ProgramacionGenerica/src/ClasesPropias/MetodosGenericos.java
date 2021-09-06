package ClasesPropias;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MetodosGenericos {

    public static void main(String[] args) {

        String[] names = {"José", "María", "Pepe", "Alberto"};
        String elements = MisMatrices.getElements(names);
        System.out.println(elements);



        Empleado[] employersList = {new Empleado("Ana", 45, 2500),
                new Empleado("Ana", 45, 2500),
                new Empleado("Marcos", 45, 2500),
                new Empleado("Jaime", 45, 2500),
                new Empleado("Roldán", 45, 2500),

        };

        System.out.println(MisMatrices.getElements(employersList));


        System.out.println(MisMatrices.getMenor(names));
        /* No implementan la interfaz Comparable y por ello esto no va a funcionar
        System.out.println(MisMatrices.getMenor(employersList)); */


        GregorianCalendar[] dates = {new GregorianCalendar(2015, Calendar.APRIL, 21),
                new GregorianCalendar(2015, Calendar.JANUARY, 21),
                new GregorianCalendar(2015, Calendar.FEBRUARY, 21),
                new GregorianCalendar(2015, Calendar.NOVEMBER, 21),

        };

        System.out.println(MisMatrices.getMenor(dates));

    }

}

class MisMatrices {

    /* Método genérico */
    public static <T> String getElements(T[]a){
        return "El array tiene " + a.length + " elementos";
    }

    /* Método genérico que devuelve un genérico */
    /* Necesitamos que los objetos T sean comparables, así que hacemos que hereden de Comparable, pese a que es una interfaz
    * Esto se hace en la declaración del método por ser genérico */
    public static <T extends Comparable> T getMenor(T[]a){
        if (a.length == 0 || a == null) {
            return null;
        } T minorElement = a[0];

        for (int i = 1; i < a.length; i++) {

            if (minorElement.compareTo(a[i]) > 0) {
                minorElement = a[i];
            }
        }
        return minorElement;


    }

}
