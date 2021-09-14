package UsoThreads;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BancoSinSincronizar {

    public static void main(String[] args) {

        Banco banco = new Banco();

        /* Creamos 100 hilos, uno para cada cuenta de origen que irá transfiriendo dinero a cuentas random */
        for (int i = 0; i<100; i++) {
            EjecucionTransferencias r = new EjecucionTransferencias(banco, i, 2000);
            Thread t = new Thread(r);
            t.start();
        }
    }
}

class Banco {

    private final double[] cuentas;
    private Lock cierreBanco = new ReentrantLock();

    public Banco() {
        cuentas = new double[100];

        Arrays.fill(cuentas, 2000);

    }

    public void transferencia(int origen, int destino, double cantidad) {

        /* Vamos a usar un lock (imagino que un semáforo binario para impedir dos hilos ejecuten el código a la vez
        * Además, le hacemos un surround con un try-finally para desbloquearlo */

        /* Y también crearemos una condición de bloqueo */

        cierreBanco.lock();

        try {

            if (cuentas[origen] < cantidad) {

                System.out.println("Cantidad insuficiente: " + origen + " ..... Saldo: " + cuentas[origen] + " €. La transferencia era de " + cantidad + " €");

                return;
            } else {
                System.out.println("Cantidad OK. Cuenta: " + origen);
            }

            System.out.println("Iniciando transferencia en " + Thread.currentThread().getName());

            cuentas[origen] -= cantidad;
            System.out.printf("Transferencia de %10.2f € de %d para %d ", cantidad, origen, destino);
            cuentas[destino] += cantidad;

            System.out.printf("\nSaldo total: %10.2f%n", getSaldoTotal());

        } finally {
            cierreBanco.unlock();
        }

    }

    public double getSaldoTotal(){
        double sumaCuentas = 0;

        for (double c: cuentas) {
            sumaCuentas += c;
        }

        return sumaCuentas;
    }

}

class EjecucionTransferencias implements Runnable {

    private Banco banco;
    private int origen;
    private double cantidadMax;

    public EjecucionTransferencias(Banco b, int origen, double max){

        banco = b;
        this.origen = origen;
        this.cantidadMax = max;


    }

    @Override
    public void run() {

        while (true) {
            try {
                int destino = (int) (100 * Math.random());
                double cantidad = cantidadMax * Math.random();

                banco.transferencia(origen, destino, cantidad);

                    Thread.sleep((long) (Math.random() * 10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
