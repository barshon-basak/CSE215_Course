class BestForCustomer implements Discountable {
    private double percentage;
    private double threshold;
    private double discount;

    public BestForCustomer(double percentage, double threshold, double discount) {
        this.percentage = percentage;
        this.threshold = threshold;
        this.discount = discount;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public double getThreshold() {
        return threshold;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public double discountedPrice(double price) {
        if (price >= threshold) {
            // Apply percentage discount if the price is greater than or equal to the threshold
            double discountedPrice = price * (1 - percentage / 100);
            // Apply additional discount if available
            discountedPrice -= discount;
            return discountedPrice;
        } else {
            // If price is below threshold, apply only the additional discount
            return price - discount;
        }
    }
}
