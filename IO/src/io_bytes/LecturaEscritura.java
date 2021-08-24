package io_bytes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class LecturaEscritura {

    public static void main(String[] args) {

        long size = 0;
        byte[] inputData = new byte[60571]; // Por desgracia debemos obtener el tamaño primero y luego guardar los datos
        int counter = 0;

        try {
            FileInputStream readFile = new FileInputStream("res/imagen.jpg");

            boolean eof = false;

            while (!eof) {
                int inputByte = readFile.read();

                if (inputByte != -1) {
                    inputData[counter] = (byte) inputByte;
                }

                if (inputByte == -1) {
                    eof = true;
                }

                counter++;

            }

            size = readFile.getChannel().size();

            readFile.close();



        } catch (IOException e) {
            System.out.println("No se ha encontrado el archivo");
        }

        System.out.println("El archivo tiene " + size + " bytes");

        createFile(inputData);

    }

    private static void createFile(byte[] inputData) {
        try {
            FileOutputStream writeFile = new FileOutputStream("res/copy/imagen_copiada.jpg");
            writeFile.write(inputData);
            System.out.println("Se ha copiado la imagen");
            writeFile.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
