package dsa_questions;

import java.util.Scanner;

class Ques10 {
    static class User {
        private static int totalUsers = 0;

        User() {
            totalUsers++;
        }

        public static int getTotalUsers() {
            return totalUsers;
        }
    }

    public static void main(String[] args) {
        new User();
        new User();

        System.out.println(User.getTotalUsers());
    }
}
