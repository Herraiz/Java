package Excepciones_I;

import javax.swing.*;

public class Debugger {

    public static void main(String[] args) {

        int elements = Integer.parseInt(JOptionPane.showInputDialog("Introduce elementos de la matriz"));
        int[] randomNum = new int[elements];
        for (int i = 0; i < randomNum.length; i++) {
//            randomNum[i] = (int) Math.random() * 100;
            randomNum[i] = (int) (Math.random() * 100);
        }

        for (int elem : randomNum) {
            System.out.println(elem);
        }
    }

}
