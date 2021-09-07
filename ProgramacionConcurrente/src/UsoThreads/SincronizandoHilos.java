package UsoThreads;

public class SincronizandoHilos {

    public static void main(String[] args) {

      HilosVarios thread1 = new HilosVarios();
      HilosVarios thread2 = new HilosVarios();
      thread1.start();
      thread2.start();
    }

}

class HilosVarios extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println("Ejecutando hilo: " + this.getName());
        }
    }

}
