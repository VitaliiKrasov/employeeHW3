package com.soft;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Vasia Pupkin");
        e1.setHours(24);
        e1.setRate(100);

        Employee e2 = new Employee("Eva Pupkina", 100);
        Employee e3 = new Employee("Bob Marley", 200, 120);

        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println("\nTotal Compensation: " + Employee.totalSum);
        e1.changeRate(200);
        System.out.println("\nTotal Compensation: " + Employee.totalSum);

    }
}
