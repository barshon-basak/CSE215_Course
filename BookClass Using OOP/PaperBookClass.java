
package javaapplication53;


public class PaperBook extends Book{
    private double shippingWeight;
    private boolean inStock;

     public PaperBook(String isbn, String title, String author, double price, double shippingWeight, boolean inStock){
        super(isbn, title, author, price);
        this.shippingWeight = shippingWeight;
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return "PaperBook{" + "shippingWeight=" + shippingWeight + ", inStock=" + inStock + '}';
    }
    
    
}
