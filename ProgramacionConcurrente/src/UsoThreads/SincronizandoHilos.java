package UsoThreads;

public class SincronizandoHilos {

    public static void main(String[] args) {

      HilosVarios thread1 = new HilosVarios();
      /* Nuestro HiloVarios2 estará supeditado a que finalice el hilo1 para ejecutarse */
      HilosVarios2 thread2 = new HilosVarios2(thread1);

      thread2.start();
      thread1.start();




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

class HilosVarios2 extends Thread {

    private Thread t;

    public HilosVarios2(Thread t){
        this.t = t;
    }

    @Override
    public void run() {

        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

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
