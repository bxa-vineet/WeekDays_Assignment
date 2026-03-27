package dsa_questions;

import java.util.Scanner;

class Ques8 {
    static class Student {
        private double gpa;

        public double getGpa() {
            return gpa;
        }

        public void setGpa(double gpa) {
            if (gpa < 0.0 || gpa > 4.0) {
                System.out.println("Invalid GPA");
            } else {
                this.gpa = gpa;
            }
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setGpa(4.5);
        s.setGpa(3.2);

        System.out.println(s.getGpa());
    }
}