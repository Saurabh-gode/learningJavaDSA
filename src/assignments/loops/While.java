package assignments.loops;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int input = -1;
        while (input != 0) {
            System.out.println("Enter the number:");
            input = sc.nextInt();
            sum += input;
        }

        System.out.println("sum is " + sum);
    }
}
