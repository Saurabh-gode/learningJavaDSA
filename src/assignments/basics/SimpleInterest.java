package assignments.basics;

import java.util.Scanner;

public class SimpleInterest {

    static double simpleInterestCalculator(double principalAmount, double rate, double durationTime) {
        double si = 0; // PrincipleAmount * Time * rate / 100

        return si = principalAmount * rate * durationTime / 100 * 12;
    }

    public static void main(String[] args) {

        double principalAmount, rate, durationTime;

        Scanner input = new Scanner(System.in);

        System.out.println("enter the principle amount rate and durationTime (in months) respectively");
        principalAmount = input.nextDouble();
        rate = input.nextDouble();
        durationTime = input.nextDouble();

        System.out.println("Simple Interest Calculation is " + simpleInterestCalculator(principalAmount, rate, durationTime));

    }
}
