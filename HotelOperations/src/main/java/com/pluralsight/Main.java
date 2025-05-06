package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Room room116 = new Room(2, 139.00, false, false, true);
        System.out.println("\nNumber of beds in the room: " + room116.getNumberOfBeds());
        System.out.println("Price of the room: $" + room116.getPrice());
        System.out.println("Is this room occupied?: " + room116.isOccupied());
        System.out.println("Is this room dirty?: " + room116.isDirty());
        System.out.println("Is this room available?: " + room116.isAvailable() + "\n");

        Reservation reservation0703 = new Reservation("King", 3, true);
        System.out.println("Selected room type: " + reservation0703.getRoomType());
        System.out.println("Number of nights: " + reservation0703.getNumberOfNights());
        System.out.println("Weekend stay?: " + reservation0703.isWeekend());
        System.out.println("Price per night: $" + reservation0703.getPrice());
        System.out.println("Total reservation cost: $" + String.format("%.2f", reservation0703.getReservationTotal()));

        Employee employee1116 = new Employee(072503, "Eunice", "Manan", "Bakery", 18.00, 47
        );
        System.out.println("\nEmployee ID: " + employee1116.getEmployeeId());
        System.out.println("First name: " + employee1116.getFirstName());
        System.out.println("Last name: " + employee1116.getLastName());
        System.out.println("Department: " + employee1116.getDepartment());
        System.out.println("Base pay rate: " + employee1116.getHourlyRate());
        System.out.println("Hours worked: " + employee1116.getHoursWorked());
        System.out.println("Over time: " + employee1116.getOvertimeHours());
        System.out.println("Total wage: $" + employee1116.getTotalPay());
    }
}