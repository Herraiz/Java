package lenguaje;

import javax.swing.*;

public class Formateo_Numeros {

    public static void main(String[] args) {

        double x = 10000.0;
        System.out.println(x/3);

        // Imprimimos con formato

        System.out.printf("%1.2f", x/3); // "%1.2f" -> dos decimales https://docs.oracle.com/javase/tutorial/java/data/numberformat.html

        // Otro ejemplo

        String num1 = JOptionPane.showInputDialog("Introduce un número");

        double num2 = Double.parseDouble(num1);

        System.out.println();
        System.out.print("La raiz de " + num2 + " es "); // Usamos print para no hacer el salto de línea y poder escribir luego el printf
        System.out.printf("%1.4f", Math.sqrt(num2));
    }
}
