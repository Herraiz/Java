package UsoThreads;

public class SincronizandoHilos {

    public static void main(String[] args) {

      HilosVarios thread1 = new HilosVarios();
      HilosVarios thread2 = new HilosVarios();
      thread1.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();

        try {
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Terminadas las tareas");
    }

}

class HilosVarios extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 15; i++) {
            System.out.println("Ejecutando hilo: " + this.getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
