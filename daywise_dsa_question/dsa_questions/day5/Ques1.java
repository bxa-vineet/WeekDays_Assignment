
package dsa_questions;
import java.util.*;

class Ques1 {
    static class Car {
        String make;
        String model;
        int year;
        double currentSpeed;

        void accelerate(double speedIncrease) {
            currentSpeed += speedIncrease;
        }

        void brake(double speedDecrease) {
            currentSpeed -= speedDecrease;
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.make = "Toyota";
        c1.model = "Camry";
        c1.year = 2020;

        Car c2 = new Car();
        c2.make = "Honda";
        c2.model = "Civic";
        c2.year = 2022;

        c1.accelerate(50);
        c2.accelerate(30);

        System.out.println(c1.currentSpeed);
        System.out.println(c2.currentSpeed);
    }
}