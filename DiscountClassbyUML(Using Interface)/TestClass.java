
package lab.pkg13;

public class Lab13 {

    public static void main(String[] args) {
        PercentageDiscount p = new PercentageDiscount(15);
        double price = 400;
        
        System.out.println("Price after percentage discount: "+p.discountedPrice(price));
        
        ThresholdDiscount t = new ThresholdDiscount(500, 100);
        System.out.println("Price after threshold discount: "+t.discountedPrice(price));
        
    }
    
}
