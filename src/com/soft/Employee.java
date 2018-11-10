/**
 * Create Console Application project in Java.
 * Add class Employee to the project.
 * Class Employee should consists of
 * 	three private fields: name, rate and hours;
 * 	static field totalSum
 * 	properties for access to these fields;
 * 	default constructor, constructor with 2 parameters (name and rate) and constructor with 3 parameters;
 * 	methods:
 * salary - to calculate the salary of person (rate * hours)
 * toString - to output information about employee
 * changeRate - to change the rate of employee
 * bonuses – to calculate 10% from salary
 * In the method main() create 3 objects of Employee type. Input information about them.
 * Display the total salary of all workers to screen
 */

package com.soft;

public class Employee {

    static int totalSum;
    private String name;
    private int rate;
    private int hours;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        totalSum -= salary() + bonuses();
        this.rate = rate;
        totalSum += salary() + bonuses();
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        totalSum -= salary() + bonuses();
        this.hours = hours;
        totalSum += salary() + bonuses();
    }

    public Employee() {
        totalSum += salary() + bonuses();
    }

    public Employee(String name, int rate) {
        this.name = name;
        setRate(rate);
        totalSum += salary() + bonuses();
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        setRate(rate);
        setHours(hours);
        totalSum += salary() + bonuses();
    }

    int salary() {
        return rate * hours;
    }

    int bonuses() {
        return salary() / 10;
    }

    void changeRate(int newRate){
        totalSum -= salary() + bonuses();
        setRate(newRate);
        totalSum += salary() + bonuses();
    }

    @Override
    public String toString() {
        String info = String.format("Name: %1$s, Rate: %2$s, Hours: %3$s", getName(), getRate(), getHours());
        return info;
    }
}
