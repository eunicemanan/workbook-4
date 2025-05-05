package com.pluralsight;

public class Employee {

    private long employeeId;
    private String firstName;
    private String lastName;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(long employeeId, String firstName, String lastName, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }
}
