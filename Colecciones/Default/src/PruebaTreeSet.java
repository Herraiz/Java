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

        TreeSet<Articulo> ordenaArticulos = new TreeSet<>();

        /*  Los va a ordenar según el método compareTo */

        ordenaArticulos.add(primero);
        ordenaArticulos.add(segundo);
        ordenaArticulos.add(tercero);

        for (Articulo articulo: ordenaArticulos) {
            System.out.println(articulo.getDesc());
        }

    }

}

class Articulo implements Comparable<Articulo> {

    private int num;
    private String desc;

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
}
