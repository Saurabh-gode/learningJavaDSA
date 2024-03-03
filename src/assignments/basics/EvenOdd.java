package assignments.basics;

import java.util.Scanner;

public class EvenOdd {

    static boolean checkEven(int number) {
        return number % 2 == 0;
    }

    static boolean checkOdd(int number) {
        return number % 2 != 0;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of you choice");
        int inputVal = input.nextInt();

        if (checkEven(inputVal)) {
            System.out.println(inputVal + " Is a even Number.");
        } else if (checkOdd(inputVal)) {
            System.out.println(inputVal + " Is a odd Number.");
        }
    }
}
