package ArchivosDirectorios;

import java.io.File;

public class AccesoFicheros {

    public static void main(String[] args) {

        File path = new File("C:\\");
        System.out.println(path.getAbsolutePath());
        String[] fileList = path.list();

        System.out.println(fileList);

        for (String s: fileList) {
            System.out.println(s);

            File parent = new File(path.getAbsolutePath(), s);

            if (parent.isDirectory()) {
                String[] children = parent.list();

                for (String t : children) {
                    System.out.println(t);
                }

            }

        }

    }

}
