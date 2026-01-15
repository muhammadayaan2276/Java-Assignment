import java.util.Scanner;

public class AreaOfTrapezoid {
    public static void main(String[]args){
        double a,b,h,k;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of 1st parallel side:");
        a = input.nextDouble();
        System.out.println("Enter the length of 2nd parallel side:");
        b = input.nextDouble();
        System.out.println("Enter the height of the trapezoid:");
        h = input.nextDouble();
        k = h * (a+b) / 2;
        System.out.println("Area of Trapezoid: " + k + " cm²");
        input.close();
    }
}
