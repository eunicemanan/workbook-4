package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // ANSI escape codes
        final String RESET = "\u001B[0m";
        final String RED = "\u001B[31m";
        final String GREEN = "\u001B[32m";
        final String YELLOW = "\u001B[33m";
        final String BLUE = "\u001B[34m";
        final String PURPLE = "\u001B[35m";
        final String CYAN = "\u001B[36m";


        /*System.out.println(RED + "This text is red!" + RESET); // EXAMPLE!!!
        System.out.println(GREEN + "This text is green!" + RESET);*/


        Room room116 = new Room(2, 139.00, false, true);

        String occupiedColor = room116.isOccupied() ? RED : GREEN; // Bellow Room so it can read it
        String dirtyColor = !room116.isDirty() ? GREEN : RED;

        System.out.println("\n+------------------------------+----------------------+");
        System.out.printf("| %-28s | %-20s |%n", "ROOM INFO", "");
        System.out.println("+------------------------------+----------------------+");
        System.out.printf("| %-28s | %s%-20d%s |%n", "Number of beds", GREEN, room116.getNumberOfBeds(), RESET);
        System.out.printf("| %-28s | %s$%-19.2f%s |%n", "Price", GREEN, room116.getPrice(), RESET);
        System.out.printf("| %-28s | %s%-20s%s |%n", "Is this room occupied?", occupiedColor, room116.isOccupied(), RESET);
        System.out.printf("| %-28s | %s%-20s%s |%n", "Is this room dirty?", dirtyColor, room116.isDirty(), RESET);
        System.out.println("+------------------------------+----------------------+");
        // Attempting check in (this will fail if already occupied and dirty)
        System.out.println("Attempting to check in...");
        room116.checkIn();
        System.out.println("\nChecking out...");
        room116.checkout();

        // Attempting check in again (This will still fail because the room is dirty)
        System.out.println("\nAttempting to check in again...");// Try checking in again (will still fail because the room is dirty)
        room116.checkIn();

        // Clean the room
        System.out.println("\nCleaning room...");
        room116.cleanRoom();

        // Now check in should work
        System.out.println("\nFinal check-in attempt...");
        room116.checkIn();
        System.out.println("\n---------------------------------------------------------------------------------------------");

        //Since our methods have print statements within them, we don't need to wrap it in a print line i.e. System.out.println(room116.checkIn());
        //If we print the method itself it will print out the return of the method as well i.e. true or false

       /* Reservation reservation0703 = new Reservation("King", 3, true);
        System.out.println("\nRESERVATIONS: ");

        System.out.println("\n+----------------------- RESERVATION DETAILS -----------------------+");
        System.out.printf("| %-25s : %-35s |\n", "Selected Room Type", reservation0703.getRoomType());
        System.out.printf("| %-25s : %-35d |\n", "Number of Nights", reservation0703.getNumberOfNights());
        System.out.printf("| %-25s : %-35s |\n", "Weekend Stay?", reservation0703.isWeekend());
        System.out.printf("| %-25s : $%-34.2f |\n", "Price per Night", reservation0703.getPrice());
        System.out.printf("| %-25s : $%-34.2f |\n", "Total Reservation Cost", reservation0703.getReservationTotal());
        System.out.println("+------------------------------------------------------------------+");
        System.out.println("\n---------------------------------------------------------------------------------------------");


        Employee employee1116 = new Employee(072503, "Eunice", "Manan", "Bakery", 18.00, 47,9.00,15.00);
        System.out.println("\nEMPLOYEES:");

        System.out.println("\n+------------------------ EMPLOYEE DETAILS ------------------------+");
        System.out.printf("| %-25s : %-35d |\n", "Employee ID", employee1116.getEmployeeId());
        System.out.printf("| %-25s : %-35s |\n", "First Name", employee1116.getFirstName());
        System.out.printf("| %-25s : %-35s |\n", "Last Name", employee1116.getLastName());
        System.out.printf("| %-25s : %-35s |\n", "Department", employee1116.getDepartment());
        System.out.printf("| %-25s : $%-34.2f |\n", "Base Pay Rate", employee1116.getHourlyRate());
        System.out.printf("| %-25s : %-35.2f |\n", "Clock In Time", employee1116.getPunchInTime());
        System.out.printf("| %-25s : %-35.2f |\n", "Clock Out Time", employee1116.getPunchOutTime());
        System.out.printf("| %-25s : %-35.2f |\n", "Hours Worked", employee1116.getHoursWorked());
        System.out.printf("| %-25s : %-35.2f |\n", "Overtime Hours", employee1116.getOvertimeHours());
        System.out.printf("| %-25s : $%-34.2f |\n", "Total Wage", employee1116.getTotalPay());
        System.out.println("+------------------------------------------------------------------+");*/


    }
}