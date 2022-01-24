package week12.book;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookShelf = new ArrayList<>();

    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("Java, The Complete Reference");
        Book book2 = new Book("Java, The Complete Reference", "Herbert Schildt");
        Book book3 = new Book("Java, The Complete Reference", "Herbert Schildt", 8);
        Book book4 = new Book("Hitchhiker's Guide to the Galaxy", "Douglas Adams", 42);
        Book book5 = new Book("Hitchhiker's Guide to the Galaxy 2", "Douglas Adams", 42);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(new Book("Test", "Steve", 6));

        library.displayBooks();

    }

    public void addBook(Book book){
        this.bookShelf.add(book);
    }

    public void displayBooks(){
        for(Book book : bookShelf){
            System.out.println(book);
        }
    }

    public void printBook(Book book){
        System.out.println("Book = " + book.getName() + " - " + book.getAuthor() + " - " + book.getEdition());
    }
}
