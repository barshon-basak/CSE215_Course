
package javaapplication64;

public class PromoCodeDiscount implements Discountable {
    private String promoCode;

    public PromoCodeDiscount(String promoCode) {
        this.promoCode = promoCode;
    }
    
    @Override
    public double applyDiscount(double currentFare) {
        switch (promoCode) {
            case "NSU10":
                return currentFare * 0.9;
            case "LAB15":
                return currentFare * 0.85;
            case "NSU20":
                return currentFare * 0.8;
            default:
                return currentFare;
        }
    }

    @Override
    public String toString() {
        return "PromoCodeDiscount{" + "promoCode=" + promoCode + '}';
    }
    
    
}
