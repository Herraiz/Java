package poo;

public class Uso_Vehiculo {

    public static void main(String[] args) {

        /* Instanciamos la clase Coche */
        /* Renault es un ejemplo o instancia de la clase Coche */
//        Coche micoche = new Coche();
//
//        String[] properties = micoche.get_properties();
//
//        System.out.println("Este coche tiene " + properties[1] + " cm de largo");
//
//        micoche.set_color(JOptionPane.showInputDialog("Introduce el color"));
//
//        System.out.println("Este coche es de color " + micoche.get_color());
//
//        micoche.set_seats(JOptionPane.showInputDialog("¿Tiene asientos de cuero (yes/no)?"));
//        micoche.set_air_conditioner(JOptionPane.showInputDialog("¿Tiene climatizador (yes/no)?"));
//
//        System.out.println();
//        System.out.println("Resumen de datos del coche:");
//        System.out.println("- Tiene " + properties[0] + " ruedas");
//        System.out.println("- Mide " + (Double.parseDouble(properties[1])/1000) + " metros de largo");
//        System.out.println("- Mide " + (Double.parseDouble(properties[2])/1000) + " metros de ancho");
//        System.out.println("- El motor tiene " + properties[3] + " CC");
//        System.out.println("- La plataforma pesa " + properties[4] + " kgs");
//        System.out.println(micoche.calculate_final_weight());
//        System.out.println(micoche.get_seats());
//        System.out.println(micoche.get_air_conditioner());
//
//        System.out.println();
//        System.out.println("El precio total es de  " + micoche.get_price() + " €");

        /* Herencia */

        Coche micoche1 = new Coche();
        micoche1.set_color("Violeta");

        Furgoneta mifurgoneta1 = new Furgoneta(7, 580);

        mifurgoneta1.set_seats("yes");

        mifurgoneta1.set_air_conditioner("yes");

        print_properties(micoche1);

        print_properties(mifurgoneta1);
        System.out.println(mifurgoneta1.getData());

    }

    private static void print_properties(Coche micoche1) {
        String[] properties = micoche1.get_properties();
        System.out.println("Resumen de datos del coche:");
        System.out.println("- Tiene " + properties[0] + " ruedas");
        System.out.println("- Mide " + (Double.parseDouble(properties[1])/1000) + " metros de largo");
        System.out.println("- Mide " + (Double.parseDouble(properties[2])/1000) + " metros de ancho");
        System.out.println("- El motor tiene " + properties[3] + " CC");
        System.out.println("- La plataforma pesa " + properties[4] + " kgs");
    }
}
