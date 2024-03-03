package assignments.basics;

import java.util.Scanner;

public class Palindrome {

    static boolean checkPalindrome(String str) {

        int start = 0, end = str.length() - 1;

        while (start < end) {
            if (!(str.charAt(start) == str.charAt(end))) {
                return false;
            }
            ;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check palindrome");

        String str = sc.next();

        if(checkPalindrome(str)){
            System.out.println(str + " is a palindromic string");
        }else{
            System.out.println(str + " is not a palindromic string");
        }


    }
}
