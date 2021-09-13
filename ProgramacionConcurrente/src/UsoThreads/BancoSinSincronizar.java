package UsoThreads;

public class BancoSinSincronizar {

    public static void main(String[] args) {


    }

}

class Banco {

    private final double[] cuentas;

    public Banco() {
        cuentas = new double[100];

        for (int i = 0; i<cuentas.length; i++) {

            cuentas[i] = 2000;

        }

    }

    public void transferencia(int origen, int destino, double cantidad) {

        if (cuentas[origen] < cantidad) {
            return;
        }

        System.out.println("Iniciando transferencia en " + Thread.currentThread());

        cuentas[origen] -= cantidad;
        System.out.printf("%10.2f de %d para %d", cantidad, origen, destino);
        cuentas[destino] += cantidad;

        System.out.printf("Saldo total: %10.2f%n", getSaldoTotal());

    }

    public double getSaldoTotal(){
        double sumaCuentas = 0;

        for (double c: cuentas) {
            sumaCuentas += c;
        }

        return sumaCuentas;
    }

}
