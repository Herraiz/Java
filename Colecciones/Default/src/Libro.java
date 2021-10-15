public class Libro {

    String title;
    String author;
    int ISBN;

    public Libro(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }



    public String getData(){
        return "El título es: " + title + ". El autor es: " + author + ". El ISBN es: + ISBN" ;
    }
}
