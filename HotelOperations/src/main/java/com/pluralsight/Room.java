package com.pluralsight;

public class Room {
    final String RESET = "\u001B[0m";
    final String RED = "\u001B[31m";
    final String GREEN = "\u001B[32m";
    final String YELLOW = "\u001B[33m";
    final String BLUE = "\u001B[34m";
    final String PURPLE = "\u001B[35m";
    final String CYAN = "\u001B[36m";

    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean dirty;

    // Constructor
    public Room(int numberOfBeds, double price, boolean isOccupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.dirty = dirty;
    }

    // Getters
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    // Check-in method
    public boolean checkIn() {
        // Only allow check-in if the room is clean and not occupied
        if (!isOccupied && !dirty) {
            isOccupied = true;
            dirty = true; // Room becomes dirty when someone checks in
            System.out.println(RED + "- Guest has checked in." + RESET);
            return true;
        } else {
            System.out.println(RED + "- Room is not available for check-in. It might be dirty or already occupied." + RESET);
            return false;
        }
    }

    // Checkout method
    public void checkout() {
        if (isOccupied) {
            isOccupied = false; // Room becomes unoccupied
            System.out.println(RED + "- Guest has checked out. Room now needs cleaning." + RESET);
        } else {
            System.out.println(YELLOW + "- Cannot checkout. Room is already vacant." + RESET);
        }
    }

    // Clean room method
    public void cleanRoom() {
        if (dirty) {
            dirty = false;
            System.out.println(GREEN + "- Room has been cleaned." + RESET);
        } else {
            System.out.println(GREEN + "- Room is already clean." + RESET);
        }
    }
}

