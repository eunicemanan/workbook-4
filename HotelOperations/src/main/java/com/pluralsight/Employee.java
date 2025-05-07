package com.pluralsight;

public class Employee {
    // Fields that store employee info
    private long employeeId;
    private String firstName;
    private String lastName;
    private String department;
    private double hourlyRate;
    private double hoursWorked;
    private double punchInTime;
    private double punchOutTime;

    public Employee(long employeeId, String firstName, String lastName, String department, double hourlyRate, double hoursWorked, double punchInTime, double punchOutTime) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.punchInTime = punchInTime;
        this.punchOutTime = punchOutTime;
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
    public double getPunchInTime() {
        return punchInTime;
    }

    public double getPunchOutTime() {
        return punchOutTime;
    }

    // Method for employee to punch in before their shift
    public void punchIn(double time){
        this.punchInTime = convertTo24HourFormat(String.valueOf(time)); // record the punch-in time
        System.out.println("Employee punched in at: " + time + "hours.");
    }
    // Method for employee to punch out after their shift
    public void punchOut(double time) {
        this.punchOutTime = time; // Just set it directly since it's already in 24-hour format
        this.hoursWorked = calculateHoursWorked(); // Calculate how many hours worked
        System.out.println("Employee punched out at: " + time + " hours.");
        System.out.println("Total hours worked: " + this.hoursWorked + " hours.");
}
    // Method that calculates hours worked from punch-in to punch-out time
    public double calculateHoursWorked(){
        return punchOutTime - punchInTime; // subtract punch in time from punch out time
    }
    // Method to convert 12 hour AM/PM to a 24-hour time! :)
    private double convertTo24HourFormat(String time) { // e.g. 13.5 = 1:30PM
        String[] parts = time.split(" "); // 1:30 PM = "1:30" , "PM"
        String[] hourMinute = parts[0].split(":"); // Splits the hour and minute e.g. 1:30 = "1", "30"

        int hour = Integer.parseInt(hourMinute[0]);
        int minute = Integer.parseInt(hourMinute[1]);
        boolean isPM = parts[1].equalsIgnoreCase("PM"); // return true if PM
                                                                    // return false if AM
        // Convert to 24-hour format for more accurate data
        if (isPM && hour !=12){
            hour += 12; // this adds 12 to PM hours
        }
        else if (!isPM && hour == 12) {
            hour = 0; // Convert 12 AM to 00 hours
        }
        return hour + minute/60.0;

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

