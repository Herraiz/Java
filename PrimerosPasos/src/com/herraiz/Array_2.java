package com.herraiz;

public class Array_2 {

    public static void main(String[] args) {

//        String[] countries = new String[8];
//
//        for (int k = 0; k < 8; k++) {
//            countries[k] = JOptionPane.showInputDialog(null,
//                    "Introduce el país " + (k + 1),
//                    "Países del mundo",
//                    JOptionPane.INFORMATION_MESSAGE);
//        }
//
//        int j = 0;
//        for (String i : countries) {
//            j++;
//            System.out.println("País " + j + " -> " + i);
//        }

        int[] random_matrix = new int[150];

        for (int i = 0; i < random_matrix.length; i++) {
            random_matrix[i] = (int)Math.round(Math.random()*100);
        }

        for (int number : random_matrix) {
            System.out.print(number + ", ");
        }
    }
}
