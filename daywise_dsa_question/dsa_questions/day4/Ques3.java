
package dsa_questions;

class Ques3 {
    public static void mp(int x) {
        x = 99;
    }

    public static void ma(int[] a) {
        a[0] = 99;
    }

    public static void main(String[] args) {
        int a = 10;
        int[] b = {10, 20};

        mp(a);
        ma(b);

        System.out.println(a);
        System.out.println(b[0]);
    }
}