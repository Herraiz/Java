package ClasesPropias;

public class Jefe extends Empleado{

    public Jefe(String name, int age, double salary) {
        super(name, age, salary);
    }

    double bonus(double inc) {
        return inc;
    }

}
