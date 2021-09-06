package ClasesPropias;

public class HerenciaGenericos {

    public static void main(String[] args) {

        /* Herencia normal

        Empleado administrativa = new Empleado("Elena", 45, 1500);
        Jefe DirectoraComercial = new Jefe("Ana", 35, 3500);
        Empleado nuevoEmpleado = DirectoraComercial;
        */

        Pareja<Empleado> Administrativa = new Pareja<>();
        Pareja<Jefe> DirectoraComercial = new Pareja<>();

        /* No se puede hacer el casting en programación genérica
        Pareja<Empleado> nuevoEmpleado = DirectoraComercial;
         */

        Pareja.printEmployee(Administrativa);
        /* Aquí tampoco funciona la herencia (versión antes del tipo comodín en el método)
        Pareja.printEmployee(DirectoraComercial);
        */

        /* Para que funcione, tenemos que usar un tipo comodín en el método - Ver código en Pareja.java*/
        Pareja.printEmployee(DirectoraComercial);

    }

}
