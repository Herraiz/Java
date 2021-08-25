package ArchivosDirectorios;

import java.io.File;

public class PruebasRutas {

    public static void main(String[] args) {

        File file = new File("out");

        System.out.println(file.getAbsolutePath());

        System.out.println(file.exists());

    }
}
