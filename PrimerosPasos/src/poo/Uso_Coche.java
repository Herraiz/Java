package poo;

public class Uso_Coche {

    public static void main(String[] args) {

        /* Instanciamos la clase Coche */
        /* Renault es un ejemplo o instancia de la clase Coche */
        Coche micoche = new Coche();


        System.out.println("Este coche tiene " + micoche.get_length() + " cm de largo");

        micoche.set_blue_color();
        System.out.println("Este coche es de color " + micoche.get_color());

    }

}
