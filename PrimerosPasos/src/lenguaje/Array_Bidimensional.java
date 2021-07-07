package com.herraiz;

public class Array_Bidimensional {

    public static void main(String[] args) {

//        int[][] matrix = new int[4][5];
//
//        matrix[0][0] = 15;
//        matrix[0][1] = 21;
//        matrix[0][2] = 18;
//        matrix[0][3] = 8;
//        matrix[0][4] = 15;
//
//        matrix[1][0] = 10;
//        matrix[1][1] = 52;
//        matrix[1][2] = 17;
//        matrix[1][3] = 19;
//        matrix[1][4] = 7;
//
//        matrix[2][0] = 19;
//        matrix[2][1] = 2;
//        matrix[2][2] = 19;
//        matrix[2][3] = 17;
//        matrix[2][4] = 7;
//
//        matrix[3][0] = 92;
//        matrix[3][1] = 13;
//        matrix[3][2] = 13;
//        matrix[3][3] = 32;
//        matrix[3][4] = 41;

        int[][] matrix = {
                {10, 15, 18, 19, 21 },
                {5, 25, 37, 41, 15},
                {7, 19, 32, 14, 90},
                {85, 2, 7, 40, 27}
        };

        /* Esto es tricky, hacemos un array con los elementos de la primera dimensión */
        for (int[] row : matrix) {
            /* Lo recorremos con un enchanced for loop */
            for (int z : row) {
                System.out.print(z + " ");
            }
            System.out.println(); // Separamos por filas
        }
    }
}
