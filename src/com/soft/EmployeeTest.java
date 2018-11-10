package com.soft;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmployeeTest {
    Employee e0 = new Employee("Name", 20, 8);

    @Test
    void salary() {
        Assertions.assertEquals(160, e0.salary());
    }

    @Test
    void bonuses() {
        Assertions.assertEquals(16, e0.bonuses());
    }

//    @Test
//    void changeRate() {
//    }
//
//    @Test
//    void toString() {
//    }
}