package com.src.AirWay.TravellingandBooking;
import java.util.*;
import java.util.Map.Entry;

public class FlightManager {
    private Map<String, Airport> airports;
    private Map<String, Flight> flights;
    private Map<Airport, List<Airport>> adjacencyList;

    public FlightManager() {
        airports = new HashMap<>();
        flights = new HashMap<>();
        adjacencyList = new HashMap<>();
    }

    public void addAirport(Airport airport) {
        airports.put(airport.getId(), airport);
        adjacencyList.put(airport, new ArrayList<>());
    }

    public void addFlight(Flight flight) {
        flights.put(flight.getId(), flight);
        List<Airport> route = flight.getRoute();
        for (int i = 0; i < route.size() - 1; i++) {
            Airport source = route.get(i);
            Airport destination = route.get(i + 1);
            if (!adjacencyList.containsKey(source)) {
                adjacencyList.put(source, new ArrayList<>());
            }
            if (!adjacencyList.containsKey(destination)) {
                adjacencyList.put(destination, new ArrayList<>());
            }
            adjacencyList.get(source).add(destination);
            adjacencyList.get(destination).add(source);
        }
    }

    public List<Flight> findFlightsBetweenAirports(Airport source, Airport destination, int hour, int minute) {
        List<Flight> result = new ArrayList<>();

        for (Entry<String, Flight> entry : flights.entrySet()) {
            Flight flight = entry.getValue();
            List<Airport> route = flight.getRoute();
            int sourceIndex = route.indexOf(source);
            int destIndex = route.indexOf(destination);

            if (sourceIndex != -1 && destIndex != -1 && sourceIndex < destIndex) {
                List<Schedule> schedule = flight.getAirportSchedules().get(source);
                if (schedule != null) {
                    for (Schedule s : schedule) {
                        if (s.getHour() > hour || (s.getHour() == hour && s.getMinute() >= minute)) {
                            result.add(flight);
                            break;
                        }
                    }
                }
            }
        }

        return result;
    }
    public Flight getFlightById(String flightId) {
    	return flights.get(flightId);
    }
    public Airport getAirportById(String airportId) {
        return airports.get(airportId);
    }

	public List<Airport> findShortestPath(Airport sourceAirport, Airport destinationAirport) {
		// TODO Auto-generated method stub
		return null;
	}
}
