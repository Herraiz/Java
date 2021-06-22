package poo;

public class Uso_Coche {

    public static void main(String[] args) {

        /* Instanciamos la clase Coche */
        /* Renault es un ejemplo o instancia de la clase Coche */
        Coche micoche = new Coche();

        String[] properties = micoche.get_properties();

        System.out.println("Este coche tiene " + properties[1] + " cm de largo");

        micoche.set_color("verde");

        System.out.println("Este coche es de color " + micoche.get_color());

        micoche.set_seats("yes");

        System.out.println("Resumen de datos del coche:");
        System.out.println("- Tiene " + properties[0] + " ruedas");
        System.out.println("- Mide " + (Integer.parseInt(properties[1])/1000) + " metros de largo");
        System.out.println("- Mide " + (Integer.parseInt(properties[2])/1000) + " metros de ancho");
        System.out.println("- El motor tiene " + properties[3] + " CC");
        System.out.println("- La plataforma pesa " + properties[4] + " kgs");
        System.out.println("- Su peso total es de  " + properties[5] + " kgs");
        System.out.println(micoche.get_seats());
        System.out.println(micoche.get_air_conditioner());

    }
}
