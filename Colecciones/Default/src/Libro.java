import java.util.Objects;

public class Libro {

    String title;
    String author;
    int ISBN;

    public Libro(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    /* Compararemos por ISBN - Lo podemos hacer manualmente o pedirle a Intellij que lo genere
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Libro) {

            Libro other = (Libro)obj;

            if (this.ISBN == other.ISBN) {
                return true;
            }

        }

        return false;
    } */

    /* Generados automáticamente */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return ISBN == libro.ISBN;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN);
    }

    public String getData(){
        return "El título es: " + title + ". El autor es: " + author + ". El ISBN es: + ISBN" ;
    }
}
