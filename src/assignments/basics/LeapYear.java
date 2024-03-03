package assignments.basics;

import java.util.Scanner;

public class LeapYear {

    static boolean checkLeapYear(int year) {

        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year:");

        int inputYear = input.nextInt();

        if(checkLeapYear(inputYear)){
            System.out.println( inputYear + " Is leap year.");
        }else{
            System.out.println( inputYear + " Is not leap year.");
        }

    }
}
