package assignments.functions;

public class EvenOdd {

    public static void main(String[] args) {
        if (isOddWithBitwise(4)) {
            System.out.println("the number is odd");
        } else {
            System.out.println("the number is even");
        }
    }

    public static boolean isOddWithBitwise(int number) {

        if ((number & 1) != 0) {
            return true;
        } else {
            return false;
        }

    }
}
