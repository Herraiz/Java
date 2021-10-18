import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaListaEnlazada {

    public static void main(String[] args) {

        LinkedList<String> países = new LinkedList<>();

        países.add("España");
        países.add("Colombia");
        países.add("México");
        países.add("Perú");


        LinkedList<String> capitales = new LinkedList<>();

        capitales.add("Madrid");
        capitales.add("Bogotá");
        capitales.add("Ciudad de México");
        capitales.add("Lima");

        ListIterator<String> itPaíses = países.listIterator();
        ListIterator<String> itCapitales = capitales.listIterator();

        /* Intercalaremos las capitales y los países */

        while (itCapitales.hasNext()) {

            if (itPaíses.hasNext()) {

                itPaíses.next();

            }

            itPaíses.add(itCapitales.next());

        }

        System.out.println(países);

        /* Quitaremos los pares en la lista de capitales */

        itCapitales = capitales.listIterator();

        while(itCapitales.hasNext()) {

            itCapitales.next();

            if (itCapitales.hasNext()) {
                itCapitales.next();
                itCapitales.remove();
            }
        }

        System.out.println(capitales);

        países.removeAll(capitales);

        System.out.println(países);
    }

}
