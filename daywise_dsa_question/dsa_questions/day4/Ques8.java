package dsa_questions;

import java.util.Scanner;

public class Ques8 {
    public static int fib(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
       int ans  = fib(40);
        System.out.println(ans);
    }
}
