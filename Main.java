package com.src.AirWay.TravellingandBooking;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        FlightManager manager = new FlightManager();
        List<Booking> bookings = new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        // Creating Airports
        
        Airport delhi = new Airport("DEL", "Indira Gandhi International Airport (DEL)");
        Airport mumbai = new Airport("BOM", "Chhatrapati Shivaji International Airport (BOM)");
        Airport AbuDhabi = new Airport("AUH", "Abu Dhabi International Airport (AUH)");
        Airport newdelhi = new Airport("NDLS", "New Delhi");
        Airport vijayawada = new Airport("VGA", "Vijayawada airport");
        Airport sydney = new Airport("SYD", "Kingsford Smith Sydney");
        Airport Auckland = new Airport("AKL", "Auckland (New Zealand)");
        Airport hyderbad = new Airport("HYD", "Rajiv Gandhi International Airport");
        Airport doha = new Airport("DOH", "Doha");
        Airport john_F_kennedy = new Airport("JFK", "John F Kennedy Intl");
        Airport chennai = new Airport("MAA", "Chennai International Airport");
        Airport guwahati = new Airport("GAU", "Lokpriya Gopinath Bordoloi Intern");
        Airport jeddah = new Airport("JED", "King Abdulaziz Intl");
        Airport pairs = new Airport("CDG", "Ch. De Gaulle");
        Airport london = new Airport("LHR", "Heathrow London");
        Airport singapore = new Airport("SIN", "Changi Airport");
        Airport beijing = new Airport("PEK", "Beijing Capital International Airport");
        Airport tokyo = new Airport("HND", "Haneda Airport");
        Airport dubai = new Airport("DXB", "Dubai International Airport");
        Airport paris = new Airport("CDG", "Charles de Gaulle Airport");
        Airport istanbul = new Airport("IST", "Istanbul Airport");
        Airport shanghai = new Airport("PVG", "Shanghai Pudong International Airport");
        Airport sydney2 = new Airport("SYD2", "Sydney Kingsford Smith International Airport");
        Airport losAngeles = new Airport("LAX", "Los Angeles International Airport");
        Airport hongKong = new Airport("HKG", "Hong Kong International Airport");
        Airport seoul = new Airport("ICN", "Incheon International Airport");
        Airport tokyo2 = new Airport("NRT", "Narita International Airport");
        // Creating flights
        Flight flight1 = new Flight("A321", "AIRBUS");
        flight1.addAirport(delhi);
        flight1.addAirport(mumbai);
        flight1.addAirportSchedule(delhi, Arrays.asList(new Schedule(7, 7, 00)));
        flight1.addAirportSchedule(mumbai, Arrays.asList(new Schedule(7, 9, 15)));

        Flight flight2 = new Flight("A320NEO", "AIRBUS");
        flight2.addAirport(mumbai);
        flight2.addAirport(AbuDhabi);
        flight2.addAirportSchedule(mumbai, Arrays.asList(new Schedule(7, 23, 05)));
        flight2.addAirportSchedule(AbuDhabi, Arrays.asList(new Schedule(7, 0, 30)));
        
        Flight flight4 = new Flight("B777", "Boeing");
        flight4.addAirport(delhi);
        flight4.addAirport(singapore);
        flight4.addAirportSchedule(delhi, Arrays.asList(new Schedule(10, 8, 30)));
        flight4.addAirportSchedule(singapore, Arrays.asList(new Schedule(10, 14, 45)));

        Flight flight5 = new Flight("A380", "Airbus");
        flight5.addAirport(london);
        flight5.addAirport(beijing);
        flight5.addAirportSchedule(london, Arrays.asList(new Schedule(12, 9, 30)));
        flight5.addAirportSchedule(beijing, Arrays.asList(new Schedule(12, 16, 15)));

        Flight flight6 = new Flight("B747", "Boeing");
        flight6.addAirport(tokyo);
        flight6.addAirport(doha);
        flight6.addAirportSchedule(tokyo, Arrays.asList(new Schedule(14, 11, 15)));
        flight6.addAirportSchedule(doha, Arrays.asList(new Schedule(14, 19, 45)));
        
        Flight flight7 = new Flight("A350", "Airbus");
        flight7.addAirport(doha);
        flight7.addAirport(dubai);
        flight7.addAirportSchedule(doha, Arrays.asList(new Schedule(16, 13, 30)));
        flight7.addAirportSchedule(dubai, Arrays.asList(new Schedule(16, 16, 45)));

        Flight flight8 = new Flight("B737", "Boeing");
        flight8.addAirport(paris);
        flight8.addAirport(istanbul);
        flight8.addAirportSchedule(paris, Arrays.asList(new Schedule(18, 14, 30)));
        flight8.addAirportSchedule(istanbul, Arrays.asList(new Schedule(18, 17, 15)));

        Flight flight9 = new Flight("A330", "Airbus");
        flight9.addAirport(dubai);
        flight9.addAirport(delhi);
        flight9.addAirportSchedule(dubai, Arrays.asList(new Schedule(20, 20, 15)));
        flight9.addAirportSchedule(delhi, Arrays.asList(new Schedule(20, 22, 45)));
        
        Flight flight10 = new Flight("B787", "Boeing");
        flight10.addAirport(losAngeles);
        flight10.addAirport(sydney2);
        flight10.addAirportSchedule(losAngeles, Arrays.asList(new Schedule(22, 8, 30)));
        flight10.addAirportSchedule(sydney2, Arrays.asList(new Schedule(22, 12, 45)));

        Flight flight11 = new Flight("A380", "Airbus");
        flight11.addAirport(sydney);
        flight11.addAirport(shanghai);
        flight11.addAirportSchedule(sydney, Arrays.asList(new Schedule(23, 10, 30)));
        flight11.addAirportSchedule(shanghai, Arrays.asList(new Schedule(23, 16, 15)));

        Flight flight12 = new Flight("B747", "Boeing");
        flight12.addAirport(sydney);
        flight12.addAirport(losAngeles);
        flight12.addAirportSchedule(sydney, Arrays.asList(new Schedule(20, 11, 15)));
        flight12.addAirportSchedule(losAngeles, Arrays.asList(new Schedule(20, 17, 45)));
        
        Flight flight13 = new Flight("A330", "Airbus");
        flight13.addAirport(seoul);
        flight13.addAirport(hongKong);
        flight13.addAirportSchedule(seoul, Arrays.asList(new Schedule(9, 8, 30)));
        flight13.addAirportSchedule(hongKong, Arrays.asList(new Schedule(9, 11, 45)));

        Flight flight14 = new Flight("B737", "Boeing");
        flight14.addAirport(hongKong);
        flight14.addAirport(tokyo2);
        flight14.addAirportSchedule(hongKong, Arrays.asList(new Schedule(11, 14, 30)));
        flight14.addAirportSchedule(tokyo2, Arrays.asList(new Schedule(11, 17, 15)));

        Flight flight15 = new Flight("A320NEO", "Airbus");
        flight15.addAirport(hongKong);
        flight15.addAirport(singapore);
        flight15.addAirportSchedule(hongKong, Arrays.asList(new Schedule(14, 12, 15)));
        flight15.addAirportSchedule(singapore, Arrays.asList(new Schedule(14, 15, 45)));
        // Add more flights and airports as needed...

        // Adding Airports and Flights to the manager
        manager.addAirport(delhi);
        manager.addAirport(mumbai);
        manager.addAirport(AbuDhabi);
        manager.addAirport(newdelhi);
        manager.addAirport(vijayawada);
        manager.addAirport(sydney);
        manager.addAirport(Auckland);
        manager.addAirport(hyderbad);
        manager.addAirport(doha);
        manager.addAirport(john_F_kennedy);
        manager.addAirport(chennai);
        manager.addAirport(guwahati);
        manager.addAirport(jeddah);
        manager.addAirport(pairs);
        manager.addAirport(london);
        manager.addFlight(flight1);
        manager.addFlight(flight2);
        manager.addAirport(singapore);
        manager.addAirport(beijing);
        manager.addAirport(tokyo);
        manager.addFlight(flight4);
        manager.addFlight(flight5);
        manager.addFlight(flight6);
        manager.addAirport(dubai);
        manager.addAirport(paris);
        manager.addAirport(istanbul);
        manager.addFlight(flight7);
        manager.addFlight(flight8);
        manager.addFlight(flight9);
        manager.addAirport(shanghai);
        manager.addAirport(sydney2);
        manager.addAirport(losAngeles);
        manager.addFlight(flight10);
        manager.addFlight(flight11);
        manager.addFlight(flight12);
        manager.addAirport(hongKong);
        manager.addAirport(seoul);
        manager.addAirport(tokyo2);
        manager.addFlight(flight13);
        manager.addFlight(flight14);
        manager.addFlight(flight15);
        Map<String, Integer> loginDetails = new HashMap<>();
        System.out.println("WELCOME TO AIRPORT MANAGEMENT SYSTEM");
        System.out.println("What do you want to do?");
        System.out.println("1. Login\n2. Airport booking\n");
        String username;
        int password;

        while (true) {
        	System.out.println("enter the choice");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the username:");
                    username = sc.next();
                    System.out.println("Enter the password:");
                    password = sc.nextInt();
                    loginDetails.put(username,password);

                    // Check if the user credentials exist in the database
                    if (loginDetails.containsKey(username) && loginDetails.get(username) == password) {
                        System.out.println("Login successful!");
                    } 
                    else {
                        System.out.println("Login failed. Invalid username or password.");
                    }
                   break;
              case 2:
            	  System.out.println("Enter the Starting point of your journey (Airport code):");
        		  Scanner RAF=new Scanner(System.in);
                String sourceAirportCode = RAF.nextLine().toUpperCase();
                Airport sourceAirport = manager.getAirportById(sourceAirportCode);

                System.out.println("Enter the Destination point of your journey (Airport code):");
                String destinationAirportCode = RAF.nextLine().toUpperCase();
                Airport destinationAirport = manager.getAirportById(destinationAirportCode);

                List<Airport> shortestPath = manager.findShortestPath(sourceAirport, destinationAirport);

                // Booking logic (as previously shown)
                System.out.println("Enter the Flight ID to book:");
                String flightIdToBook = RAF.nextLine();
                Flight flightToBook = manager.getFlightById(flightIdToBook);

                if (flightToBook != null) {
                    System.out.println("Enter the number of passengers:");
                    int numPassengers = RAF.nextInt();

                    // Payment methods and prices
                    System.out.println("Select a payment method:");
                    System.out.println("1. Credit Card");
                    System.out.println("2. PayPal");
                    System.out.println("3. Cash");
                    int paymentMethodChoice = RAF.nextInt();
                    double totalPrice = calculateTotalPrice(flightToBook, numPassengers, paymentMethodChoice);

                    Booking booking = new Booking(flightToBook, numPassengers);
                    System.out.println("Booking successful!");
                } else {
                    System.out.println("Flight not found with ID: " + flightIdToBook);
                }

                // Display existing bookings
                System.out.println("Existing Bookings:");
                break;
                
               
            }
           
       
            
            	
        }
        }
        
                // ... Your existing code for creating airports and flights ...   
    
    public static double calculateTotalPrice(Flight flight, int numPassengers, int paymentMethodChoice) {
        double basePrice = 100.0; // Replace with your pricing logic
        double priceModifier = 1.0;
        int final_prize=200;
        Scanner scanner=new Scanner(System.in);

        switch (paymentMethodChoice) {
            case 1: // Credit Card
            	System.out.println("WELCOME TO CREDIT CARD PAYMENT");
            	System.out.println("ENTER THE CREDIT CARD DETAILS");
            	System.out.println("you have to pay the price of "+final_prize);
            	
            	String cardName=scanner.nextLine();
            	int creditNumber=scanner.nextInt();
            	System.out.println("check the phone and continue with the payment process");
            	
                priceModifier = 1.05; // 5% surcharge
                break;
            case 2: // PayPal
            	System.out.println("WELCOME TO PAYPAL PAYMENT");
            	System.out.println("ENTER THE CREDIT CARD DETAILS");
            	System.out.println("you have to pay the price of "+final_prize);
            	String paypalcardName=scanner.nextLine();
            	int paypalcreditNumber=scanner.nextInt();
            	System.out.println("check the phone and continue with the payment process");
            	
            	
                priceModifier = 1.03; // 3% surcharge
                break;
            case 3: // Cash
            	System.out.println("enter the name of the payer");
            	String name=scanner.nextLine();
            	System.out.println("you have to pay the price of "+final_prize);
            	int cash=scanner.nextInt();
            	System.out.println("check the phone and continue with the payment process");
                priceModifier = 1.0; // No surcharge
                break;
            default:
                System.out.println("Invalid payment method choice. Defaulting to cash.");
                break;
        }

        double totalPrice = basePrice * numPassengers * priceModifier;

        return totalPrice;
    }
}
