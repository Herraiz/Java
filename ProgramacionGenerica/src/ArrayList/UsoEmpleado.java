package ArrayList;

import java.util.*;

public class UsoEmpleado {

    public static void main(String[] args) {

        /* No sabemos cuánto va a tener nuestra lista?  -> Usamos un ArrayList */

        /* Forma clásica usando un array de objetos

        Empleado[] listaEmpleados = new Empleado[3];
        listaEmpleados[0] = new Empleado("Ana", 45, 2500);
        listaEmpleados[1] = new Empleado("Antonio", 55, 2000);
        listaEmpleados[2] = new Empleado("María", 25, 2600);
        listaEmpleados[3] = new Empleado("Antonio María", 22, 2100);

         */

        ArrayList <Empleado> listaEmpleados = new ArrayList<>();

        /* Le podemos indicar el tamaño si es mayor que 10 y lo conocemos
        * Eso ayudará al programa a consumir menos recursos */

        listaEmpleados.ensureCapacity(11);

        listaEmpleados.add(new Empleado("Ana", 45, 2500));
        listaEmpleados.add(new Empleado("Antonio", 55, 2000));
        listaEmpleados.add(new Empleado("María", 25, 2600));
        listaEmpleados.add(new Empleado("Antonio María", 22, 2100));

        listaEmpleados.trimToSize(); // "Cierra" el array y ahorra memoria


        for (Empleado e: listaEmpleados) {
            System.out.println(e.getData());
        }

        System.out.println("El tamaño de la lista es: " + listaEmpleados.size());

    }

}

class Empleado {

    String name;
    int age;
    double salary;

    public Empleado(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getData() {
        return "El empleado se llama " + name + ". Tiene " + age + " años. Cobra un salario de " + salary + " €.";
    }

}
