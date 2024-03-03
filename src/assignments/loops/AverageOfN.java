package assignments.loops;

import java.util.Scanner;

public class AverageOfN {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int inputNumberCount = 0;
        double inputValue = -1;
        double sum = 0;
        while (inputValue != 0) {
            System.out.println("Enter the number or enter 0 to exit:");
            inputValue = input.nextDouble();
            sum += inputValue;
            if (inputValue != 0) {
                inputNumberCount++;
            }
        }
        
        System.out.println("average from all the provided numbers is " + sum / inputNumberCount);
    }
}
