package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {

    public static void main(String[] args) {


    }

}

class Empleado {

    private String name;
    private double salary;
    private Date contractRegistration;

    /* Constructor */
    public Empleado(String name, double salary, int year, int month, int day) {

        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        this.contractRegistration = calendar.getTime();
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
        salary += salary * percent/100;
    }
}
