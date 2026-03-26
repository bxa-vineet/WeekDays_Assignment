package dsa_questions;

import java.util.*;

class Ques2 {
   public  static double ca(double... n) {
        double s = 0;
        for (double x : n)
            s += x;
        return s / n.length;
    }

    public static void main(String[] args) {
        System.out.println(ca(2, 4, 6));
        System.out.println(ca(10, 20));
        double[] a = {5, 10, 15};
        System.out.println(ca(a));
    }
}