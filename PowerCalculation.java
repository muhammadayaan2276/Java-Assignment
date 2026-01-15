 import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        double voltage, current, power;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Voltage (in volts): ");
        voltage = input.nextDouble();

        System.out.println("Enter Current (in amperes): ");
        current = input.nextDouble();

        power = voltage * current;

        System.out.println("Power consumption is: " + power + " Watts");

        input.close();
    }
}


