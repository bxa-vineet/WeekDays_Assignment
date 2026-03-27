package dsa_questions;
class Ques4 {
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Person p = new Person("Vineet", 22);
        System.out.println(p.name + " " + p.age);
    }
}