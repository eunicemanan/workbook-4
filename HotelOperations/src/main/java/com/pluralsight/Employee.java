package com.pluralsight;

public class Employee {
    // Fields that store employee info
    private long employeeId;
    private String firstName;
    private String lastName;
    private String department;
    private double hourlyRate;
    private double hoursWorked;

    // Constructor to set up employee data
    public Employee(long employeeId, String firstName, String lastName, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.hourlyRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    // Basic getters
    public long getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    // Returns regular hours (up to 40 max)
    public double getRegularHours() {
        // If hoursWorked is more than 40, cap it at 40. 40 + overtime
        if (hoursWorked > 40) {
            return 40;
        } else {
            return hoursWorked; // less than 40!
        }
    }

    // Returns overtime hours (any hours over 40)
    public double getOvertimeHours() {
        // If hoursWorked is over 40, return the extra hours only!
        if (hoursWorked > 40) {
            return hoursWorked - 40;
        } else {
            return 0;
        }
    }

    // Calculates total pay (regular + overtime at 1.5x)
    public double getTotalPay() {
        // Regular pay = regular hours * rate
        double regularPay = getRegularHours() * hourlyRate;

        // Overtime pay = overtime hours * rate * 1.5
        double overtimePay = getOvertimeHours() * hourlyRate * 1.5;

        // Total pay = regular + overtime
        return regularPay + overtimePay;
    }
}

