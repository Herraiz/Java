package poo;

public class Coche {

    private int wheels;
    private int length;
    private int width;
    private int motor;
    private int platform_weigth;

    String color;
    int final_weigth;
    boolean leather_seats;
    boolean air_conditioner;

    /* Método constructor */

    public Coche() {

        wheels = 4;
        length = 2000;
        width = 300;
        motor = 1600;
        platform_weigth = 500;

    }
    /* Método getter para obtener el largo de una propiedad privada */
    public int get_length() {
        return length;
    }

    /* Método setter */
    public void set_blue_color() {
        color = "azul";
    }

    public String get_color() {
        /**
         * get_color
         * @param: optional
         * @return: color
         */
        return color;
    }
}
