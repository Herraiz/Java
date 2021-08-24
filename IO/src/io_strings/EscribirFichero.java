package io_strings;

import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {

    public static void main(String[] args) {

        Writing writing = new Writing();
        writing.write();

    }

}

class Writing {

    public void write(){
        String text = "Esto es una prueba de escritura";

        try {
            FileWriter writer = new FileWriter("res/ejemplo_escribir.txt");
                writer.write(text);

                /* Es necesario hacer el close para que pueda escribir, por tema de buffers */
                writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}