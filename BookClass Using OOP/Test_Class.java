package javaapplication53;


public class JavaApplication53 {

    
    public static void main(String[] args) {
       Book book= new Book("1234", "Sample BOOK", "Joee", 19.33);
        System.out.println(book.toString());
       
        EBook eBook = new EBook("9876543210", "Sample eBook", "Jane Smith", 19.99, "https://example.com/ebook", 5.0);
        PaperBook paperBook = new PaperBook("5432109876", "Sample Paper Book", "Alice Johnson", 39.99, 2.0, true);

        System.out.println(eBook.toString());
        System.out.println(paperBook.toString());
    }
    
}
