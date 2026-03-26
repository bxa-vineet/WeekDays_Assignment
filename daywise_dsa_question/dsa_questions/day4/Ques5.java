package dsa_questions;

class Ques5 {
    public static void ir(int c) {
        System.out.println(c);
        ir(c + 1);
    }

    public static void main(String[] args) {
        ir(1);
    }
}