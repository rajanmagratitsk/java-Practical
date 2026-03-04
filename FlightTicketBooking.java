import java.util.ArrayList;
import java.util.Scanner;

// Flight class to store flight details
class Flight {
    String flightNumber;
    String source;
    String destination;
    int seatsAvailable;

    Flight(String flightNumber, String source, String destination, int seatsAvailable) {
        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.seatsAvailable = seatsAvailable;
    }

    void displayFlight() {
        System.out.println("Flight No: " + flightNumber + ", From: " + source + ", To: " + destination + ", Seats: " + seatsAvailable);
    }
}

// Booking class to store booking info
class Booking {
    String passengerName;
    String flightNumber;

    Booking(String passengerName, String flightNumber) {
        this.passengerName = passengerName;
        this.flightNumber = flightNumber;
    }
}

public class FlightTicketBooking {

    static ArrayList<Flight> flights = new ArrayList<>();
    static ArrayList<Booking> bookings = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Sample flights
        flights.add(new Flight("F101", "Kathmandu", "Pokhara", 5));
        flights.add(new Flight("F102", "Kathmandu", "Biratnagar", 3));
        flights.add(new Flight("F103", "Pokhara", "Kathmandu", 4));

        int choice;
        do {
            System.out.println("\n--- Flight Booking System ---");
            System.out.println("1. View Flights");
            System.out.println("2. Book Ticket");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. View Bookings");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: viewFlights(); break;
                case 2: bookTicket(); break;
                case 3: cancelTicket(); break;
                case 4: viewBookings(); break;
                case 5: System.out.println("Thank you!"); break;
                default: System.out.println("Invalid choice!"); break;
            }

        } while (choice != 5);
    }

    // Display all flights
    static void viewFlights() {
        System.out.println("\nAvailable Flights:");
        for (Flight f : flights) {
            f.displayFlight();
        }
    }

    // Book a ticket
    static void bookTicket() {
        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Flight Number: ");
        String fno = sc.nextLine();

        for (Flight f : flights) {
            if (f.flightNumber.equalsIgnoreCase(fno)) {
                if (f.seatsAvailable > 0) {
                    bookings.add(new Booking(name, fno));
                    f.seatsAvailable--;
                    System.out.println("Ticket booked successfully for " + name);
                    return;
                } else {
                    System.out.println("Sorry, no seats available!");
                    return;
                }
            }
        }
        System.out.println("Flight not found!");
    }

    // Cancel a ticket
    static void cancelTicket() {
        System.out.print("Enter Passenger Name to cancel: ");
        String name = sc.nextLine();

        for (int i = 0; i < bookings.size(); i++) {
            if (bookings.get(i).passengerName.equalsIgnoreCase(name)) {
                String fno = bookings.get(i).flightNumber;
                bookings.remove(i);
                // Increment seat in flight
                for (Flight f : flights) {
                    if (f.flightNumber.equalsIgnoreCase(fno)) {
                        f.seatsAvailable++;
                        break;
                    }
                }
                System.out.println("Booking canceled for " + name);
                return;
            }
        }
        System.out.println("No booking found for " + name);
    }

    // View all bookings
    static void viewBookings() {
        System.out.println("\nBooked Tickets:");
        if (bookings.isEmpty()) {
            System.out.println("No bookings yet.");
            return;
        }
        for (Booking b : bookings) {
            System.out.println("Passenger: " + b.passengerName + ", Flight: " + b.flightNumber);
        }
    }
}