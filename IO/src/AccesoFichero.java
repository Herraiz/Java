import java.io.FileReader;
import java.io.IOException;

public class AccesoFichero {

    public static void main(String[] args) {

        ReadFile accessing = new ReadFile();
        accessing.read();

    }
}

class ReadFile {

    public void read(){

        try {
            FileReader input = new FileReader("res/ejemplo.txt");
            int c = input.read();

            while (c != -1) {
                System.out.print((char) c);
                c = input.read();
            }

        } catch (IOException e) {
            System.out.println("No se ha encontrado el archivo");
        }

    }

}
