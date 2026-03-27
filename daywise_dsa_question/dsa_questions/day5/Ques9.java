package dsa_questions;

import java.util.Scanner;

class Ques9 {
    static class BankAccount {
        private double balance;

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
            }
        }
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.deposit(1000);
        b.withdraw(500);

        System.out.println(b.getBalance());
    }
}