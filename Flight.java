package com.src.AirWay.TravellingandBooking;
import java.util.*;

public class Flight {
    private String id;
    private String name;
    private List<Airport> route;
    private Map<Airport, List<Schedule>> airportSchedules;

    public Flight(String id, String name) {
        this.id = id;
        this.name = name;
        this.route = new ArrayList<>();
        this.airportSchedules = new HashMap<>();
    }

    public void addAirport(Airport airport) {
        route.add(airport);
    }

    public void addAirportSchedule(Airport airport, List<Schedule> schedules) {
        airportSchedules.put(airport, schedules);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Airport> getRoute() {
        return route;
    }

    public Map<Airport, List<Schedule>> getAirportSchedules() {
        return airportSchedules;
    }
}
