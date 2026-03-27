package dsa_questions;

import java.util.regex.*;

class Ques7 {
    static class Student {
        private int studentId;
        private String name;
        private double gpa;

        public int getStudentId() {
            return studentId;
        }

        public void setStudentId(int studentId) {
            this.studentId = studentId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getGpa() {
            return gpa;
        }

        public void setGpa(double gpa) {
            this.gpa = gpa;
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setStudentId(1);
        s.setName("Vineet");
        s.setGpa(3.5);

        System.out.println(s.getName());
    }
}