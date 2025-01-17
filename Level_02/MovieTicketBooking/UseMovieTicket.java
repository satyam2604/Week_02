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
public class UseMovieTicket {

    public static void main(String[] args) {
        // Create a MovieTicket object
        MovieTicket ticket = new MovieTicket("Inception", 12);

        // Attempt to display details before booking
        ticket.displayMovieDetails();

        // Book the ticket
        ticket.bookTicket(25);

        // Display ticket details after booking
        ticket.displayMovieDetails();

        // Attempt to book the ticket again
        ticket.bookTicket(30);
    }
}
