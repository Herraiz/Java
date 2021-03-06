import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaLinkedList {

    public static void main(String[] args) {
        LinkedList<String> personas = new LinkedList<>();

        personas.add("Pepe");
        personas.add("Sandra");
        personas.add("Ana");
        personas.add("Laura");

        System.out.println(personas.size());

        for (String persona : personas) {
            System.out.println(persona);
        }

        System.out.println("****");

        personas.add("Paco");
//        personas.add(1, "Zenaida");

        /*  Usaremos un iterador para movernos entre los elementos de la lista y agregar  */
        ListIterator<String> it = personas.listIterator();
        it.next();
        it.add("Juan");

        for (String persona : personas) {
            System.out.println(persona);
        }

    }

}
