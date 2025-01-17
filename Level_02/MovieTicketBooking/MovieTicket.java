/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_02.Day_01.Level_02.MovieTicketBooking;

/**
 *
 * @author User
 */
public class MovieTicket {

    // declare variable for Movie ticket class
    private String movieName;
    private int seatNumber;
    private int price;
    private boolean isBooked;

    // create constructor to initialize values
    public MovieTicket(String movieName, int price) {
        this.movieName = movieName;
        this.isBooked = false; // Initially ticket is not booked
        this.price = price;
    }

    // Method to book a ticket
    public boolean bookTicket(int seatNumber) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            this.isBooked = true;
            System.out.println("Seat is successfully booked!");
            return true;
        } else {
            System.out.println("Ticket is already booked.");
            return false;
        }
    }

    // Method to display ticket details
    public void displayMovieDetails() {
        if (isBooked) {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat number: " + seatNumber);
            System.out.println("Price:  " + price);
        } else {
            System.out.println("No movie ticket is booked yet: " + movieName);
        }
    }
}
