package lenguaje;

public class Declaraciones_Operadores {

    public static void main(String[] args) {

        // Video 7

        int a = 5;

        int b;
        b = 7;

//        int c = b + a;  // Operador +

//        c++;  // incremento
//
//        c += 2; // incremento en 2
//
//        c--; // decremento

        int c = b / a;

        System.out.println("Resultado como int: " + c);

        /* Si queremos el resultado de una división, todas las variables
        involucradas deben estar declaradas como float/double
         */

        double aa, bb, cc;  // reservamos las tres variables en una sola línea

        aa = 5;
        bb = 7;

        cc = bb / aa;

        System.out.println("Resultado como double: " + cc);

        // Vídeo 8

        final int e = 5; // Las constantes NO se pueden re-asignar

//        e = 3;  // esto NO FUNCIONA

//        System.out.println(e);

        final double apulgadas = 2.54;

        double cm = 6;

        double resultado = cm / apulgadas;

        System.out.println("En " + cm + " cm hay " + resultado + " pulgadas");



    }
}
