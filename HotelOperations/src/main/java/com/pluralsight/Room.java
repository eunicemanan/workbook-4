package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean dirty;
    private boolean isAvailable;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean dirty, boolean isAvailable) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.dirty = dirty;
        this.isAvailable = isAvailable;
    }

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

    public boolean isAvailable() {
        return isAvailable;
    }
}


