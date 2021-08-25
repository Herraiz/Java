package ArchivosDirectorios;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Creando {

    public static void main(String[] args) {

        File path = new File("res" + File.separator + "nuevo directorio");

        path.mkdir();

        File path2 = new File("res" + File.separator + "nuevo directorio" + File.separator + "prueba.txt");

        try {
            path2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }


        WritingFilepath accedeEs = new WritingFilepath();

        accedeEs.write(path2.getAbsolutePath());

    }
}

class WritingFilepath {

    public void write(String filepath) {

        String text = "Esto es un ejemplo";

        try {

            FileWriter writer = new FileWriter(filepath);

            writer.write(text);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
