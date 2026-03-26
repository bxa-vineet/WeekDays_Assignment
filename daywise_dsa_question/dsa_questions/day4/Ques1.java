
package dsa_questions;

class Ques1 {
    public static double ca(double r) {
        return Math.PI * r * r;
    }

   public  static int ca(int l, int w) {
        return l * w;
    }

   public  static double ca(double b, double h, boolean t) {
        return 0.5 * b * h;
    }

    public static void main(String[] args) {
        System.out.println(ca(5.0));
        System.out.println(ca(4, 6));
        System.out.println(ca(3.0, 4.0, true));
    }
}
