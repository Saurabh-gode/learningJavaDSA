package assignments.basics;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class MathGame {

    public static void AddTwoNumbers() {
        int firstNumber, secondNumber, sum = 0;
        Scanner numberInputs = new Scanner(System.in);

        System.out.println("Enter the first number");
        firstNumber = numberInputs.nextInt();
        System.out.println("Enter the second number");
        secondNumber = numberInputs.nextInt();

        sum = firstNumber + secondNumber;
        System.out.println("Sum of provided numbers is" + " " + sum);

    }

    public static void PrintMultiplicationTable(int number) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("- " + (number * i) + " ");
        }
    }

    public static int GetHighestCommonDivisor(int number1, int number2) {

        int hcf = 0;

        int greatestNumber = (number1 > number2) ? number1 : number2;

        int i = 1;
        while (i != greatestNumber) {

            if (number1 % i == 0 && number2 % i == 0) {
                hcf = i;
            }
            i++;
        }

        return hcf;
    }

    public static int getLowestCommonDivisor(int number1, int number2) {
        int lcm = 0;
        int hcf = GetHighestCommonDivisor(number1, number2);

        lcm = number1 * number2 / hcf;

        return lcm;

    }

    public static int sumOfNumbers() {
        Scanner inputTaker = new Scanner(System.in);
        int sum = 0;

        while (sum >= 0) {
            String inputVal = "";
            System.out.println("enter the number of your choice or x to exit");
            if (inputVal == "x") {
                break;
            }
            sum += parseInt(inputTaker.next());
        }

        return sum;
    }

    public static void main(String[] args) {
//        AddTwoNumbers();
//        PrintMultiplicationTable(26);
        sumOfNumbers();
//        System.out.println(getLowestCommonDivisor(8 ,24));

    }


}


