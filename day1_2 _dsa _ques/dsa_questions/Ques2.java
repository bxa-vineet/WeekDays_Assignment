package dsa_questions;
import java.util.Scanner;

class Ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();

        if (p < 0 || p > 100) {
            System.out.println("Invalid input");
        } else if (p >= 90) {
            System.out.println("A");
        } else if (p >= 80) {
            System.out.println("B");
        } else if (p >= 70) {
            System.out.println("C");
        } else if (p >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}