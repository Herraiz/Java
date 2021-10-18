import java.util.HashMap;
import java.util.Map;

public class PruebaMapas {

    public static void main(String[] args) {

        HashMap<String, Empleado> personal = new HashMap<>();

        personal.put("145", new Empleado("Pablo"));
        personal.put("146", new Empleado("Marcos"));
        personal.put("147", new Empleado("Zenaida"));
        personal.put("148", new Empleado("Roberto"));
        System.out.println(personal);

        /* Eliminar elementos */
        personal.remove("145");
        System.out.println(personal);

        /* Reemplazar elementos por clave */
        personal.put("146", new Empleado("Alfonso"));
        System.out.println(personal);

        /* Podemos convertirlo en un Set y acceder a la clave y valor
        * Esto es difícil si no usamos un set, ya que a la hora de usar un
        * for each habría que especificar dos variables */

        for (Map.Entry<String, Empleado> entrada: personal.entrySet()) {
            System.out.println(entrada.getKey());
            System.out.println(entrada.getValue());
        }

        System.out.println();

    }

}

class Empleado {

    private String name;
    private double salary;

    public Empleado(String name) {
        this.name = name;
        this.salary = 2000;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}