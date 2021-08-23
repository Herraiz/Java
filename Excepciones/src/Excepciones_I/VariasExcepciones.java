package Excepciones_I;

import javax.swing.*;

public class VariasExcepciones {

    public static void main(String[] args) {

        try {
            division();

        } catch (ArithmeticException e) {
            System.out.println("No puedes dividir por cero");
            System.out.println(e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Se ha generado un error de este tipo: " + e.getClass().getName());
        }

    }

    static void division() {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor"));
        System.out.println("El resultado es: " + num1/num2);
    }
}
