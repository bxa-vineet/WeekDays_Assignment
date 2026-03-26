package dsa_questions;

import java.util.regex.*;

class Ques7 {
    public static boolean validate(String s) {
        String pattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%&]).{8,}$";
        return Pattern.matches(pattern, s);
    }

    public static void main(String[] args) {
        System.out.println(validate("Aa1@abcd"));
    }
}}