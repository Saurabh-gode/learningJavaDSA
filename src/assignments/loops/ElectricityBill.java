package assignments.loops;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

        int units;

        double billToPay = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of units for an electricity bill");

        units = input.nextInt();

        if (units < 100) {
            billToPay = units * 1.20;
        } else if (units < 300) {
            billToPay = units * 1.20 + (units - 100) * 2;
        } else if (units > 300) {
            billToPay = 100 * 1.20 + 200 * 2 + (units - 300) * 3;
        }

        System.out.println("Your electricity bill for units " + units + ": " + billToPay);

    }
}
