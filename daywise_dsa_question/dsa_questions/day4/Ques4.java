package dsa_questions;
class Ques4 {
   public  static void cd(int n) {
        if (n == 0) return;
        System.out.println(n);
        cd(n - 1);
    }

   public  static void cu(int n) {
        if (n == 0) return;
        cu(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        cd(5);
        cu(5);
    }
}