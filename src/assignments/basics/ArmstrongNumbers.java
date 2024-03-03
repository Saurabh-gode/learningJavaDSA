package assignments.basics;

import java.lang.*;

public class ArmstrongNumbers {

    static boolean checkArmstrongforThreeDigitInteger(int threeDigitnumber) {

        int remainder = 0, finalValue = 0, tempNumber = threeDigitnumber;
        while (tempNumber != 0) {

            remainder = tempNumber % 10;
            finalValue += Math.pow(remainder, 3);
            tempNumber = tempNumber / 10;

        }

        return threeDigitnumber == finalValue;
    }

    static boolean checkArmstrong(int number) {

        int numberOfDigits = String.valueOf(number).length(), remainder = 0, finalValue = 0, num = number;

        while (num != 0) {
            remainder = num % 10;
            finalValue += Math.pow(remainder, numberOfDigits);
            num = num / 10;
        }

        return finalValue == number;
    }

    public static void main(String[] args) {

        System.out.println(checkArmstrong(1634));

    }
}
