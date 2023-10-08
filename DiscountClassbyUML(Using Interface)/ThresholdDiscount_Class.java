package lab.pkg13;

public class ThresholdDiscount implements Discountable{
    private double threshold;
    private double discount;

    public ThresholdDiscount(double threshold, double discount) {
        this.threshold = threshold;
        this.discount = discount;
    }

    public double getThreshold() {
        return threshold;
    }

    public double getDiscount() {
        return discount;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    public double discountedPrice(double price){
        if(price>=this.threshold){
            return price - this.discount;
        }
        else{
            return price;
        }
    }
}
