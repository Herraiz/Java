package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

    public static void main(String[] args) {

//        Empleado empleado1 = new Empleado(
//            "Paco Gómez", 85000, 1990, 12, 17);
//
//        Empleado empleado2 = new Empleado(
//            "Ana López", 95000, 1995, 6, 2);
//
//        Empleado empleado3 = new Empleado(
//            "María Martín", 105000, 2002, 3, 15);
//
//
//        empleado1.raiseSalary(5);
//        empleado2.raiseSalary(5);
//        empleado3.raiseSalary(5);
//
//        /* Imprimimos los datos */
//
//        System.out.println("\nNombre: " + empleado1.getName()
//                + "\nSueldo: " + empleado1.getSalary() + "\nFecha de alta: "
//                + empleado1.getContractRegistration());
//
//        System.out.println("\nNombre: " + empleado2.getName()
//                + "\nSueldo: " + empleado2.getSalary() + "\nFecha de alta: "
//                + empleado2.getContractRegistration());
//
//        System.out.println("\nNombre: " + empleado3.getName()
//                + "\nSueldo: " + empleado3.getSalary() + "\nFecha de alta: "
//                + empleado3.getContractRegistration());

        Jefe jefe_RRHH = new Jefe("Roberto", 55000, 2006, 9, 25);
        jefe_RRHH.setIncentive(2570);

        Empleado[] misEmpleados = new Empleado[6];

        misEmpleados[0] = new Empleado(
                "Paco Gómez", 85000, 1990, 12, 17);

        misEmpleados[1] = new Empleado(
                "Ana López", 95000, 1995, 6, 2);

        misEmpleados[2] = new Empleado(
                "María Martín", 105000, 2002, 3, 15);

        misEmpleados[3] = new Empleado("Antonio Fernández");

        /* Polimorfismo - Principio de sustición */
        misEmpleados[4] = jefe_RRHH;    // El array espera un Empleado y acepta un Jefe

        misEmpleados[5] = new Jefe("Alba", 95000, 1999, 5, 26);

        for (Empleado empleado : misEmpleados) {
            empleado.raiseSalary(5);
        }

        for (Empleado empleado : misEmpleados) {
            System.out.println("Nombre: " + empleado.getName()
        /* Cuando hacemos el empleado.getSalary() de una subclase, se ejecuta el método sobreescrito de la subclase. Magia. */
                    /* A esto se llama enlazado dinámico */
                    + " - Sueldo: " + empleado.getSalary() + " - Fecha de alta: "
                    + empleado.getContractRegistration());
        }

    }
}
class Empleado {

    private final String name;
    private double salary;
    private final Date contractRegistration;

    /* Constructor */
    public Empleado(String name, double salary, int year, int month, int day) {

        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        this.contractRegistration = calendar.getTime();
    }

    /* Sobrecargamos los constructores - diferentes estados iniciales */
    public Empleado(String name) {
        this(name, 30000, 2000, 1, 1);  // Llama al otro constructor

    }

    public String getName() {
        return name;
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

class Jefe extends Empleado {

    private double incentive;


    /* Se le tiene que pasar los argumentos del constructor a la subclase y al super */

    public Jefe(String name, double salary, int year, int month, int day) {

        super(name, salary, year, month, day);

    }

    public void setIncentive(double incentive) {
        this.incentive = incentive;
    }

    /* Sobrescribiendo métodos heredados */
    @Override
    public double getSalary() {
        double chiefSalary = super.getSalary();
        return chiefSalary + this.incentive;
    }
}