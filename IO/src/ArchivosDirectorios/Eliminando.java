package ArchivosDirectorios;

import java.io.File;

public class Eliminando {

    public static void main(String[] args) {



        File path = new File("res" + File.separator + "nuevo directorio" + File.separator + "prueba.txt");
        path.delete();

        File path2 = new File("res" + File.separator + "nuevo directorio");

        path2.delete();

    }
}
