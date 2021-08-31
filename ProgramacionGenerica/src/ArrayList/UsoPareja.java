package ArrayList;

public class UsoPareja {

    public static void main(String[] args) {

        /* Creamos una instancia de Pareja con la clase T String */

        Pareja<String> one= new Pareja<>();
        one.setPrimero("Treinta y dos");
        System.out.println(one.getPrimero());

        /* Podemos instanciar también nuestras propias clases */

        Persona firstPerson = new Persona("Ana");
        Pareja<Persona> two = new Pareja<>();
        two.setPrimero(firstPerson);
        System.out.println(two.getPrimero());

    }

}

class Persona {

    private String name;

    public Persona(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }

}
