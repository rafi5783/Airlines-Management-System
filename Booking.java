package com.src.AirWay.TravellingandBooking;

public class Booking {
    private Flight flight;
    private int numPassengers;

    public Booking(Flight flight, int numPassengers) {
        this.flight = flight;
        this.numPassengers = numPassengers;
    }

    public Flight getFlight() {
        return flight;
    }

    public int getNumPassengers() {
        return numPassengers;
    }
}
