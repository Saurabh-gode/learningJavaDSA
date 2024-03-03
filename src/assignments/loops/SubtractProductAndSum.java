package assignments.loops;

import java.util.Scanner;

public class SubtractProductAndSum {

    public static int subtractProductAndSum(int n) {
        int remainder;
        int product = 1;
        int sum = 0;

        while (n != 0) {
            remainder = n % 10;
            n = n / 10;
            product *= remainder;
            sum += remainder;
        }

        return product - sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the number: ");
        int inputValue = input.nextInt();

        System.out.println(subtractProductAndSum(inputValue));
    }
}
