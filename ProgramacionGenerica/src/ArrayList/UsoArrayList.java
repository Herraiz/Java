package ArrayList;

import java.io.File;

public class UsoArrayList {

    public static void main(String[] args) {

        myArrayList files = new myArrayList(4);

        files.add("Juan");

        files.add("María");
        files.add("Ana");
        files.add("Sandra");
        files.add(new File("gestion_Pedios.accdb"));

        String personName = (String) files.get(4);

        System.out.println(personName);
    }
}
