package week12.book;

public class Book {
    private String name;
    private String author;
    private int edition;

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book(String name, String author, int edition) {
        this.name = name;
        this.author = author;
        this.edition = edition;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getEdition() {
        return edition;
    }

    @Override
    public String toString(){
        return "Book = " + name + " - " + author + " - " + edition;
    }
}
