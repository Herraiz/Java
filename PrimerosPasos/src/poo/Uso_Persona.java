package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

    public static void main(String[] args) {

        Persona[] lasPersonas = new Persona[2];
        lasPersonas[0] = new Empleado2("Luis Conde", 50000, 2009, 2, 25);
        lasPersonas[1] = new Alumno("Ana López", "Biología");

        for (Persona p : lasPersonas) {
            System.out.println(p.getName() + ", " + p.getDescription());
        }

    }
}

/* Clase abstracta al tener un método abstracto */
abstract class Persona {

    private final String name;

    public Persona(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /* Método abstracto - solo se define!!
    * Todas las clases que hereden de persona deben
    * sobrescribir el método getDescription */
    public abstract String getDescription();

}

class Empleado2 extends Persona {

    private double salary;
    private final Date contractRegistration;
    private final int id;
    private static int nextId = 1;


    /* Constructor */
    public Empleado2(String name, double salary, int year, int month, int day) {

        super(name);

        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        this.contractRegistration = calendar.getTime();
        this.id = Empleado2.nextId;
        Empleado2.nextId++;
    }

    public String getDescription() {
        return "Este empleado tiene un ID " + id + " con un sueldo de " + salary ;
    }

    public double getSalary() {
        return salary;
    }

    public Date getContractRegistration() {
        return contractRegistration;
    }

    public void raiseSalary(double percent) {
        salary += salary * percent / 100;
    }
}

class Alumno extends Persona {

    private final String career;

    public Alumno(String name, String career) {
        super(name);
        this.career = career;
    }

    public String getDescription() {
        return "Este alumno está en la carrera de " +  career ;
    }
}