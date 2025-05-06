package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }
    public double getPrice() {
        double basePrice;

        if (roomType.equalsIgnoreCase("King")) {
            basePrice = 139.00;
        } else if (roomType.equalsIgnoreCase("Double")) {
            basePrice = 124.00;
        } else {
            throw new IllegalArgumentException("Invalid option. Please select either 'King' or 'Double'");
        }
        if (isWeekend) {
            basePrice *= 1.10;
        }
        return basePrice;
    }
    public double getReservationTotal() {
        return getPrice() * numberOfNights;
    }
}
