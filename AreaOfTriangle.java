import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String []args){
        
        Scanner ki = new Scanner(System.in);
    
        double a , b , c;
        System.out.println("Enter The Length of three sides of the Triangle");
        System.out.print("Side a :");
        a = ki.nextDouble();

        System.out.print("Side b :");
        b = ki.nextDouble();
        
        System.out.print("Side c :");
        c = ki.nextDouble();

        double s = (a + b + c)/2.0;
        double area = s * (s - a) * (s - b) * (s - c);
        double areaOfTriangle = Math.sqrt(area);
        System.out.println("Area of the Triangle is : " + areaOfTriangle);

        ki.close();
    }
    
}