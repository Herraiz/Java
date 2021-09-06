package ClasesPropias;

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

    /* Permitimos al método trabajar con instancias de Empleado y que heredan de ella */
    public static void printEmployee(Pareja<? extends Empleado> p) {
        Empleado primero = p.getPrimero();
        System.out.println(primero);
    }

}

