package dsa_questions;

class Ques5 {
    static class Employee {
        int id;
        String name;
        String department;
        double salary;

        Employee(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        Employee(int id, String name) {
            this(id, name, "Unassigned", 0.0);
        }

        Employee(int id) {
            this(id, "Unknown", "Unassigned", 0.0);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(1, "A");
        Employee e2 = new Employee(2);

        System.out.println(e1.name + " " + e1.department);
        System.out.println(e2.name + " " + e2.department);
    }
}