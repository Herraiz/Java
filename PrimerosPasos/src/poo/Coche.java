package poo;

public class Coche {

    private int wheels;
    private int length;
    private int width;
    private int motor;
    private int platform_weigth;

    private String color;
    private int final_weigth;
    private boolean leather_seats;
    private boolean air_conditioner;

    /* Método constructor */

    public Coche() {

        wheels = 4;
        length = 2000;
        width = 300;
        motor = 1600;
        platform_weigth = 500;

    }
    /* Método getter para obtener el largo de una propiedad privada */
    public String[] get_properties() {
        /* Ventajas de Java y de usar el semicolon, return multilínea */
        return new String[]{
                String.valueOf(wheels), String.valueOf(length),
                String.valueOf(width), String.valueOf(motor),
                String.valueOf(platform_weigth), String.valueOf(final_weigth),
                Boolean.toString(leather_seats), Boolean.toString(air_conditioner)
                };
    }

    /* Método setter con parámetro */
    public void set_color(String car_color) {
        color = car_color;
    }

    public void set_seats(String leather_seats) {
        if (leather_seats.equals("yes")) {
            this.leather_seats = true;
        } else {
            this.leather_seats = false;
        }
    }

    public String get_seats(){
        if (this.leather_seats) {
            return "- Tiene asientos de cuero";
        } else {
            return "- Tiene asientos de cuero";
        }
    }

    public String get_air_conditioner(){
        if (air_conditioner) {
            return "- Tiene aire acondicionado";
        } else {
            return "- No tiene aire acondicionado";
        }
    }

    public String get_color() {
        return color;
    }
}
