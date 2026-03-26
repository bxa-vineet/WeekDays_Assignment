package dsa_questions;

import java.util.Scanner;

class Ques10 {
   public  static int bs(int[] a, int l, int r, int t) {
        if (l > r) return -1;

        int m = l + (r - l) / 2;

        if (a[m] == t) return m;
        if (a[m] > t) return bs(a, l, m - 1, t);
        else return bs(a, m + 1, r, t);
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9, 11};
        int t = 7;

        int res = bs(a, 0, a.length - 1, t);
        System.out.println(res);
    }
}
