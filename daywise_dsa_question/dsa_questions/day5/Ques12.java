package dsa_questions;

import java.util.Scanner;

class Ques12 {
    static class MenuItem {
        private String name;
        private double price;

        MenuItem(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public double getPrice() {
            return price;
        }

        public String getName() {
            return name;
        }
    }

    static class Order {
        private MenuItem[] items = new MenuItem[10];
        private int itemCount = 0;

        void addMenuItem(MenuItem item) {
            if (itemCount < 10) {
                items[itemCount++] = item;
            }
        }

        double calculateTotal() {
            double total = 0;
            for (int i = 0; i < itemCount; i++) {
                total += items[i].getPrice();
            }
            return total;
        }
    }

    public static void main(String[] args) {
        MenuItem m1 = new MenuItem("Coffee", 100);
        MenuItem m2 = new MenuItem("Tea", 50);
        MenuItem m3 = new MenuItem("Sandwich", 150);

        Order order = new Order();
        order.addMenuItem(m1);
        order.addMenuItem(m2);
        order.addMenuItem(m3);

        System.out.println(order.calculateTotal());
    }
}
