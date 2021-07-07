package lenguaje;

public class Array_Bidimensional_Calculado {

    public static void main(String[] args) {

        double acumulado;
        double interes = 0.10;

        double[][] saldo = new double[6][5];

        for (int i = 0; i < 6; i++) {

            saldo[i][0] = 10000;
            acumulado = 10000;

            for (int j = 1; j < 5; j++) {  // j = 1 porque ya tenemos el j = 0 arriba

                acumulado += (acumulado * interes); // aumentamos el acumulado
                saldo[i][j] = acumulado; // lo indexamos
            }

            interes += 0.01;
        }

        for (double[] doubles : saldo) {
            /* Lo recorremos con un enchanced for loop */
            for (int h = 0; h < saldo[0].length; h++) {
                System.out.printf("%1.2f", doubles[h]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
