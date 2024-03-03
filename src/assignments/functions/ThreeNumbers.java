package assignments.functions;

import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int first = in.nextInt();
        int second = in.nextInt();
        int third = in.nextInt();

        System.out.println(max(first, second, third));
        System.out.println(min(first, second, third));

    }

    static int max(int first, int second, int third) {
        int max = first;

        if (max < second) {
            max = second;
        }

        if (max < third) {
            max = third;
        }

        return max;
    }

    static int min(int first, int second, int third) {
        int min = first;

        if (min > second) {
            min = second;
        }

        if (min > third) {
            min = third;
        }

        return min;
    }
}
