package assignments.loops;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentInput = -1;
        int largestNumber = -1;
        while (currentInput != 0) {
            System.out.println("Enter the number: ");
            currentInput = sc.nextInt();

            if (currentInput > largestNumber) {
                largestNumber = currentInput;
            }

        }
        System.out.println(largestNumber + " is the largest from all the inputs provided");
    }
}
