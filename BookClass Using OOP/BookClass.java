
package javaapplication53;


public class Book {
    private String isbn;
    private String title;
    private String author;
    private double price;

    public Book(String isbn, String title, String author, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "isbn=" + isbn + ", title=" + title + ", author=" + author + ", price=" + price + '}';
    }

    
}
