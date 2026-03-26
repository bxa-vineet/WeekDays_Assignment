package dsa_questions;

import java.util.Scanner;

public class Ques12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bal = 1000;

        while (true) {
            System.out.println("1 Check Balance");
            System.out.println("2 Deposit");
            System.out.println("3 Withdraw");
            System.out.println("4 Exit");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Balance: " + bal);
                    break;

                case 2:
                    double d = sc.nextDouble();
                    bal += d;
                    System.out.println("Balance: " + bal);
                    break;

                case 3:
                    double w = sc.nextDouble();
                    if (w > bal) {
                        System.out.println("Insufficient funds");
                    } else {
                        bal -= w;
                        System.out.println("Balance: " + bal);
                    }
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid option");
            }
        }
    } 
}
