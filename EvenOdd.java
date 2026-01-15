import java.util.Scanner;

public class EvenOdd {
    public static void main(String[]args){
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer number to check if it is even or odd: ");
        number = input.nextInt();
        if(number % 2 == 0){
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
        input.close();
        }

    }

