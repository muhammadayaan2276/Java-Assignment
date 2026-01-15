import java.util.Scanner;

public class OrignalSellingPrice {
    public  static void main (String[]args){
        double OrignalSellingPrice,DiscountedSellingPrice,DiscountPercentage;
          Scanner input = new Scanner(System.in);

        System.out.println("Enter Discounted Selling Price : ");
        DiscountedSellingPrice = input.nextDouble();

        System.out.println("Enter Discounted Percentage : ");
        DiscountPercentage = input.nextDouble();

        OrignalSellingPrice = (DiscountedSellingPrice * 100) / (100 - DiscountPercentage);

        System.out.println("Orignal Selling Price is : " + OrignalSellingPrice);
        input.close();
    }
}
