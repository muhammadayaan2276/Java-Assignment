import java.util.Scanner;

public class DiscountedPrice {
    public static void main(String[] args) {

        double originalSellingPrice, discountedSellingPrice, discount;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Original Selling Price:");
        originalSellingPrice = input.nextDouble();

        System.out.println("Enter Discounted Selling Price:");
        discountedSellingPrice = input.nextDouble();

        discount = discountedSellingPrice * originalSellingPrice / 100;
        discountedSellingPrice = originalSellingPrice - discount;

        System.out.println("Discounted Price is: " + discountedSellingPrice);

        input.close();
    }
}
