package assignments.functions;

import java.util.Scanner;

public class factorials {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        int factorial = 1;
        for (int i = number; i > 0; i--) {
            factorial *= i;
        }

        System.out.println(factorial);
        System.out.println(recursivelyFindFactorial(number));
    }

    public static int recursivelyFindFactorial(int number) {

        if (number == 1) {
            return number;
        }

        return number * recursivelyFindFactorial(number - 1);
    }
}
