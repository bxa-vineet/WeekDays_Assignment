package dsa_questions;

import java.util.*;

class Ques2 {
    static class Box {
        int width;
        int height;
        int depth;
    }

    public static void main(String[] args) {
        Box b1 = new Box();
        b1.width = 10;
        b1.height = 10;
        b1.depth = 10;

        Box b2 = b1;
        b2.width = 50;

        System.out.println(b1.width);
    }
}