package assignments.basics;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        int a = 0, b = 1, c = 1, n;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(a+ " ");
            a=b;
            b=c;
            c=a+b;
        }
    }
}
