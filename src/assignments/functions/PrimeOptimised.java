package assignments.functions;

public class PrimeOptimised {
    public static void main(String[] args) {

        if (isPrime(15)) {
            System.out.println("number is prime");
        } else {
            System.out.println("number is not prime");
        }

    }

    public static boolean isPrime(int numberToCheck) {

        //edge case
        if (numberToCheck <= 1) {
            return false;
        }

        if (numberToCheck == 2 || numberToCheck == 3) {
            return true;
        }

        if (numberToCheck % 2 == 0 || numberToCheck % 3 == 0) {
            return false;
        }

        for (int x = 5; x < Math.sqrt(numberToCheck); x = x + 6) {
            if (numberToCheck % x == 0 || numberToCheck % (x + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}

