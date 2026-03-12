package dsa_questions;

import java.util.Scanner;

public class Ques6 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = "java123";
        String in;

        do {
            System.out.print("Enter the password: ");
            in = sc.next();
        } while (!in.equals(pass));

        System.out.println("Access Granted");
    }
}
