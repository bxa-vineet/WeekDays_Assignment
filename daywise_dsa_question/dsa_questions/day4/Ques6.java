package dsa_questions;

import java.util.*;

class Ques6 {
    public static int sum(int c) {
        if(c == 0){
            return 0;
        }
        return c%10 + sum(c/10);
    }

    public static void main(String[] args) {
       int ans = sum(253);
        System.out.println(ans);
    }
}