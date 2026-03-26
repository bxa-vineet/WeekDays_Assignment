
package dsa_questions;
import java.util.Scanner;

class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = Character.toLowerCase(sc.next().charAt(0));

        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }
}