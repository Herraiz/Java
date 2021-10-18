import java.util.Comparator;
import java.util.TreeSet;

public class PruebaTreeSet {

    public static void main(String[] args) {

        /* Ejemplo TreeSet genérico sin ordenar

        TreeSet<String> ordenaPersonas = new TreeSet<>();

        ordenaPersonas.add("Sandra");
        ordenaPersonas.add("Amanda");
        ordenaPersonas.add("Diana");

        for (String persona : ordenaPersonas) {
            System.out.println(persona);
        }
         */

        Articulo primero = new Articulo(1, "Primer artículo");
        Articulo segundo = new Articulo(2, "Segundo artículo");
        Articulo tercero = new Articulo(3, "Tercer artículo");
        Articulo cuarto = new Articulo(4, "Cuarto artículo");

        TreeSet<Articulo> ordenaArticulos = new TreeSet<>();

        /*  Los va a ordenar según el método compareTo */

        ordenaArticulos.add(primero);
        ordenaArticulos.add(segundo);
        ordenaArticulos.add(tercero);
        ordenaArticulos.add(cuarto);

        for (Articulo articulo: ordenaArticulos) {
            System.out.println(articulo.getDesc());
        }

        Articulo comparadorArticulos = new Articulo();

        TreeSet <Articulo> ordenaArticulos2 = new TreeSet<>(comparadorArticulos);

        ordenaArticulos2.add(primero);
        ordenaArticulos2.add(segundo);
        ordenaArticulos2.add(tercero);
        ordenaArticulos2.add(cuarto);

        System.out.println("");

        for (Articulo art: ordenaArticulos2) {
            System.out.println(art.getDesc());
        }
        
    }

}

class Articulo implements Comparable<Articulo>, Comparator<Articulo> {

    private int num;
    private String desc;

    public Articulo(){}

    public Articulo(int num, String desc){

        this.num = num;
        this.desc = desc;

    }

    @Override
    public int compareTo(Articulo o) {
        return num - o.num;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public int compare(Articulo o1, Articulo o2) {
        String descripcion1 = o1.getDesc();
        String descripcion2 = o2.getDesc();
        return descripcion1.compareTo(descripcion2); // comparación alfabética
    }
}
