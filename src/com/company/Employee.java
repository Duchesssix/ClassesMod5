package com.company;

public class Employee {
    //declare private variables for employee record
    private String empName;
    private int empID;
    private int shift;

    //Employee constructor
    public Employee (String empName, int empID, int shift) {
        this.empName = empName;
        this.empID = empID;
        this.shift = shift;
    }

    //Retrieve employee name
    public String getEmpName() {
        return empName;
    }

    //Retrieve employee ID
    public int getEmpID() {
        return empID;
    }

    //Retrieve employee shift
    public int getShift() {
        return shift;
    }

    //Change employee name
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    //Change employee ID
    public void setEmpID(int empID) {
        this.empID = empID;
    }

    //Change employee shift
    public void setShift(int shift) {
        this.shift = shift;
    }

    //Print employee data to console
    public void printAll() {
        System.out.println("Employee ID: " + empID + "\n" +
                "Employee Name: " + empName + "\n" +
                "Current Shift: " + shift + "\n");
    }
}
