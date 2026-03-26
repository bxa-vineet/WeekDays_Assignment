package dsa_questions;

import java.util.Scanner;

public class Ques11 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        for (int i = 1; i <= r; i++) {

            for (int s = 1; s <= r - i; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    } 
}
