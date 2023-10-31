package com.src.AirWay.TravellingandBooking;
import java.util.*;

public class Airport {
    private String Id;
    private String name;
    private Map<Integer, List<Schedule>> flightSchedules;

    public Airport(String Id, String name) {
        this.Id = Id;
        this.name = name;
        this.flightSchedules = new HashMap<>();
    }

    public String getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void addFlightSchedule(int flightId, List<Schedule> schedules) {
        flightSchedules.put(flightId, schedules);
    }

    public List<Schedule> getFlightSchedule(int flightId) {
        return flightSchedules.getOrDefault(flightId, new ArrayList<>());
    }
}
