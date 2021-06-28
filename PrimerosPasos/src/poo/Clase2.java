package poo;

import testingpackage.Clase3;

public class Clase2 {

    public static void main(String[] args) {

        Clase1 myobj = new Clase1();

        /* Como no está en el paquete poo, hay que importarlo */

        Clase3 myobj2 = new Clase3();

        /* Como Clase1 tiene el modificador por defecto y está en otro paquete
        * no se va a poder acceder a los métodos de clase1. Para que funcione
        * debe tener el modificador protected */

         int myvar3 = myobj2.myvar2; // al ser protected se puede

    }
}
