package dsa_questions;

import java.util.Scanner;

public class Ques9 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int orig = n;
        int rev = 0;

        while (n > 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n /= 10;
        }

        if (orig == rev) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    } 
}
