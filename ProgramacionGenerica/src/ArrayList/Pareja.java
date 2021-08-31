package ArrayList;

public class Pareja<T> {

    /* Se suelen usar las letras T, U, K para hacer las clases genéricas */

    private T primero;

    public Pareja() {
        primero = null;
    }

    public void setPrimero(T newValue) {
        this.primero = newValue;
    }

    public T getPrimero() {
        return primero;
    }
}

