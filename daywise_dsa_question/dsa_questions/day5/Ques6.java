package dsa_questions;

import java.util.*;

class Ques6 {
    static class Document {
        String text;

        Document(String text) {
            this.text = text;
        }

        void sendToPrinter(Printer p) {
            p.printDocument(this);
        }
    }

    static class Printer {
        void printDocument(Document doc) {
            System.out.println(doc.text);
        }
    }

    public static void main(String[] args) {
        Printer p = new Printer();
        Document d = new Document("Hello");
        d.sendToPrinter(p);
    }
}