package dsa_questions;

import java.util.Scanner;

class Ques11 {
    static class MathUtils {
        private MathUtils() {}

        public static boolean isEven(int n) {
            return n % 2 == 0;
        }

        public static int factorial(int n) {
            int res = 1;
            for (int i = 1; i <= n; i++) res *= i;
            return res;
        }

        public static int max(int a, int b) {
            return a > b ? a : b;
        }
    }

    public static void main(String[] args) {
        System.out.println(MathUtils.isEven(4));
        System.out.println(MathUtils.factorial(5));
        System.out.println(MathUtils.max(10, 20));
    }
}
