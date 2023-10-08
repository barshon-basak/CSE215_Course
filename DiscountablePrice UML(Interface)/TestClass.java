public class BestForCustomerTest {
    public static void main(String[] args) {
        BestForCustomer customer = new BestForCustomer(10, 100, 5);

        double originalPrice1 = 80;
        double discountedPrice1 = customer.discountedPrice(originalPrice1);
        System.out.println("Original Price 1: $" + originalPrice1);
        System.out.println("Discounted Price 1: $" + discountedPrice1);

        double originalPrice2 = 120;
        double discountedPrice2 = customer.discountedPrice(originalPrice2);
        System.out.println("Original Price 2: $" + originalPrice2);
        System.out.println("Discounted Price 2: $" + discountedPrice2);

        double originalPrice3 = 150;
        double discountedPrice3 = customer.discountedPrice(originalPrice3);
        System.out.println("Original Price 3: $" + originalPrice3);
        System.out.println("Discounted Price 3: $" + discountedPrice3);
    }
}
