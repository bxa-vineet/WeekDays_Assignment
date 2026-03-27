
package dsa_questions;

class Ques3 {
    static class Rectangle {
        int length;
        int width;

        Rectangle() {
            length = 1;
            width = 1;
        }

        Rectangle(int x) {
            length = x;
            width = x;
        }

        Rectangle(int l, int w) {
            length = l;
            width = w;
        }
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5);
        Rectangle r3 = new Rectangle(4, 6);

        System.out.println(r1.length + " " + r1.width);
        System.out.println(r2.length + " " + r2.width);
        System.out.println(r3.length + " " + r3.width);
    }
}