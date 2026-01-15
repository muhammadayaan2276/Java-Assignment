import java.util.Scanner;


public class Circle {
    public static void main(String[] args){
        double  radius,area,circumference;
        Scanner read = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        radius = read.nextDouble();
        area = Math.PI * radius * radius;
        circumference = 2 * Math.PI * radius;
        System.out.println("Area of circle: " + area);
        System.out.println("Circumference of circle: " + circumference);
        read.close();
    }
}
