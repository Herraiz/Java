package poo;

/* Ahora Coche es superclase y Furgoneta es subclase */

public class Furgoneta extends Coche {

    private final int loadingCapacity;
    private final int extraSeats;

    public Furgoneta(int extraSeats, int loadingCapacity) {

        super();  // Llamamos al constructor de la superclase

        this.loadingCapacity = loadingCapacity;
        this.extraSeats = extraSeats;

    }

}
