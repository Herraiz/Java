package io_strings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LecturaFichero {

    public static void main(String[] args) {

        ReadFile accessing = new ReadFile();
        accessing.read();

    }
}

class ReadFile {

    public void read(){

        try {
            FileReader input = new FileReader("res/ejemplo.txt");
            /* Ahora usamos un buffer para poder leer más líneas sin consumir tantos recursos */
            BufferedReader myBuffer = new BufferedReader(input);

            String line = "";

            while (line != null) {

             line = myBuffer.readLine();

             if (line != null) {
                 System.out.println(line);
             }
            }

            myBuffer.close();

        } catch (IOException e) {
            System.out.println("No se ha encontrado el archivo");

        }

    }

}
