package assignments.arrays;

import java.util.Scanner;

public class SwapElements {

    public static void main(String[] args) {
        int[] arr = new int[5];

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
//        swap(arr, 0, arr.length - 1);
        reverseArray(arr);
        for (int a : arr) {
            System.out.print(a + ",");
        }
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
