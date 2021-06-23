package com.herraiz;

public class Constantes {

    public static void main(String[] args) {

        Empleados trabajador1 = new Empleados("Paco");
        Empleados trabajador2 = new Empleados("Ana");

        trabajador1.changeSection("RRHH");
//        trabajador1.changeName("María");

        System.out.println(trabajador1.getData());
        System.out.println(trabajador2.getData());

    }
}

class Empleados {

    private final String name;
    private String section;


    public Empleados(String name) {

        this.name = name;
        this.section = "Administración";

    }

    public void changeSection(String section) {
        this.section = section;
    }

    public String getData() {
        return "El nombre es " + this.name + " y la sección es " + this.section;
    }

//    public void changeName(String name) {
//        this.name = name;
//    }

}