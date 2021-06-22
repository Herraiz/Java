package poo;

public class Coche {

    private final int wheels;
    private final int length;
    private final int width;
    private final int motor;
    private final int platform_weigth;

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

    public String get_seats() {
        if (leather_seats) {
            return "- Tiene asientos de cuero";
        } else {
            return "- No tiene asientos de cuero";
        }
    }

    public void set_seats(String leather_seats) {
        this.leather_seats = leather_seats.equalsIgnoreCase("yes");
    }

    public void set_air_conditioner(String air_conditioner) {
        this.air_conditioner = air_conditioner.equalsIgnoreCase("yes");
    }

    public String get_air_conditioner() {
        if (air_conditioner) {
            return "- Tiene aire acondicionado";
        } else {
            return "- No tiene aire acondicionado";
        }
    }

    public String get_color() {
        return color;
    }

    /* Método setter con parámetro */
    public void set_color(String car_color) {
        color = car_color;
    }

    /* Setter y getter a la vez, ejemplo de lo que no se debe hacer */
    public String calculate_final_weight() {
        int bodywork = 500;
        final_weigth = platform_weigth +  bodywork;

        if (leather_seats) {
            final_weigth += 50;
        }

        if (air_conditioner) {
            final_weigth += 50;
        }
        return "- Su peso total es de  " + final_weigth + " kgs";
    }

    public int get_price() {
        int final_price = 10000;

        if (leather_seats) {
            final_price += 2000;
        }

        if(air_conditioner) {
            final_price += 1500;
        }

        return final_price;
    }

}
