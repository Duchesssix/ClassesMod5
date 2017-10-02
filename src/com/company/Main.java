package com.company;

public class Main {

    public static void main(String[] args) {
        //populate three employee records
        Employee emp1 = new Employee("Diana Prince", 1941, 1);
        Employee emp2 = new Employee("Bruce Wayne", 1939, 3);
        Employee emp3 = new Employee("Clark Kent", 1938, 2);

        //print employee records to console
        emp1.printAll();
        emp2.printAll();
        emp3.printAll();
    }
}
