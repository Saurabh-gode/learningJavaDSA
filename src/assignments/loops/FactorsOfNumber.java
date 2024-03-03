package assignments.loops;

import java.util.Scanner;

public class FactorsOfNumber {

    static boolean isFactor(int number, int numberToCheck) {
        return number % numberToCheck == 0;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = input.nextInt();

        String outputStr = "";

        for (int i = 1; i <= num; i++) {

            if (isFactor(num, i)) {
                outputStr += " " + String.valueOf(i);
            }
        }

        System.out.println("Factors of the given numbers are: " + outputStr);

    }
}
