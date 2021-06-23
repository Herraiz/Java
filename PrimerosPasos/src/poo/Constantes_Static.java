package poo;

public class Constantes_Static {

    public static void main(String[] args) {

        Empleados trabajador1 = new Empleados("Paco");
        Empleados trabajador2 = new Empleados("Ana");
        Empleados trabajador3 = new Empleados("Antonio");
        Empleados trabajador4 = new Empleados("María");

        trabajador1.changeSection("RRHH");

        System.out.println(trabajador1.getData() + "\n" + trabajador2.getData() +
                "\n" + trabajador3.getData() + "\n" +
                trabajador4.getData());
        System.out.println(Empleados.getNextId());

    }
}

class Empleados {

    private final String name;
    private String section;
    private final int id;
    private static int nextId = 1;  // Propiedad estática, es global y pertenece a la clase no a los objetos


    public Empleados(String name) {

        this.name = name;
        this.section = "Administración";
        this.id = Empleados.nextId;
        Empleados.nextId++;

    }

    public void changeSection(String section) {
        this.section = section;
    }

    public String getData() {
        return "El nombre es " + this.name + ", la sección es " + this.section + " y el id es " + this.id;
    }
    /* Método estático de la clase, no de los objetos */
    public static String getNextId() {
        return "El próximo id de usuario es "  + Empleados.nextId;
    }
}