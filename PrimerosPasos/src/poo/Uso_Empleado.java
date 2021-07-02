package poo;

import java.util.Arrays;
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

        Jefatura jefe_RRHH = new Jefatura("Roberto", 55000, 2006, 9, 25);
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

        misEmpleados[5] = new Jefatura("Alba", 95000, 1999, 5, 26);

        /* Casting de objetos --  Como el array es de empleados, no funcionan los métodos
         * de subclase. Hacemos casting sobre una nueva variable objeto y lo hacemos tipo Jefe
         * Antes funcionaba en el bucle for por que es el enhanced, pero de normal no funciona */
        Jefatura jefaFinanzas = (Jefatura) misEmpleados[5];

        jefaFinanzas.setIncentive(55000);

        System.out.println(jefaFinanzas.takeDecisions("dar más días de vacaciones a los empleados"));

        System.out.println("El jefe " + jefaFinanzas.getName() + " tiene un bonus de " + jefaFinanzas.setBonus(500));
        System.out.println(misEmpleados[3].getName() + " tiene un bonus de " + misEmpleados[3].setBonus(200));

        /* No se puede hacer casting de la super a la subclass */
//        Jefe jefeCompras = (Jefe) misEmpleados[1];

        /*
        Empleado director_comercial = new Jefe("Sandra", 85000, 2012, 5, 5);

        // Como  Empleado implementa Comparable, podemos:
        Comparable ejemplo = new Empleado("Elisabeth", 95000, 2011, 06, 07);

        if (director_comercial instanceof Empleado) {
            System.out.println("Es de tipo Jefatura");
        }

        if (ejemplo instanceof Comparable) {
            System.out.println("Implementa la interfaz comparable");
        }
         */


        for (Empleado empleado : misEmpleados) {
            empleado.raiseSalary(5);
        }

        Arrays.sort(misEmpleados); // Ordenamos por salary

        for (Empleado empleado : misEmpleados) {
            System.out.println("Nombre: " + empleado.getName()
                    /* Cuando hacemos el empleado.getSalary() de una subclase, se ejecuta el método sobreescrito de la subclase. Magia. */
                    /* A esto se llama enlazado dinámico */
                    + " - Sueldo: " + empleado.getSalary() + " - Fecha de alta: "
                    + empleado.getContractRegistration());
        }

    }
}

class Empleado implements Comparable, Trabajadores {

    private final String name;
    private final Date contractRegistration;
    private double salary;

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

    @Override
    public int compareTo(Object miObjeto) {

        /* Hacemos casting del Objeto a mi objeto tipo Empleado */
        Empleado otroEmpleado = (Empleado) miObjeto;

        /* Comparamos el salario del empleado "actual" con el de otro empleado
         * Intuyo que se fija en una posición del array y compara con el resto
         * con un bucle for enhanced */

        /* Forma arcaica

        if (this.salary < otroEmpleado.salary) {
            return -1;
        }

        if (this.salary > otroEmpleado.salary) {
            return 1;
        }

        return 0;

        */

        return Double.compare(this.salary, otroEmpleado.salary); // Double.compare() devuelve justo lo que necesita compareTo
    }

    @Override
    public double setBonus(double gratification) {
        return Trabajadores.baseBonus + gratification;
    }
}

class Jefatura extends Empleado implements Jefes {

    private double incentive;


    /* Se le tiene que pasar los argumentos del constructor a la subclase y al super */

    public Jefatura(String name, double salary, int year, int month, int day) {

        super(name, salary, year, month, day);

    }
    /* Implementamos el método heredado de la interfaz Jefes */

    @Override
    public String takeDecisions(String decision) {
        return "Un miembro de la dirección ha tomado la decisión de: " + decision;
    }

    @Override
    public double setBonus(double gratification) {

        double bonus = 2000;

        return Trabajadores.baseBonus + gratification + bonus;

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

/* Uso del modificador "final" en clases y métodos */

/* Al ser Director una clase final, no se puede heredar de ella */

final class Director extends Jefatura {

    private double incentive;

    public Director(String name, double salary, int year, int month, int day) {

        super(name, salary, year, month, day);

    }

    /* Al ser un método final no se puede sobreescribir en futuras subclases */
    @Override
    public final double getSalary() {
        double chiefSalary = super.getSalary();
        return chiefSalary + this.incentive;

    }
}