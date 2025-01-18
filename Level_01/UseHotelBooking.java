/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week_02.Day_02.Level_01;

/**
 *
 * @author User
 */
public class UseHotelBooking {

    public static void main(String[] args) {
        System.out.println("Default constructor called!!!");
        // create object of HotelBooking class and call default constructor
        HotelBooking hotel1 = new HotelBooking();
        // call a method to display hotel details
        hotel1.displayDetails();
        System.out.println("Parameterized constructor called!!!");
        // create object of HotelBooking class and call parameterized constructor
        HotelBooking hotel2 = new HotelBooking("Shaun", "Double", 3);
        // call a method to display hotel details
        hotel2.displayDetails();
        System.out.println("Copy constructor called!!!");
        // create object of HotelBooking class and call copy constructor
        HotelBooking hotel3 = new HotelBooking(hotel2);
        // call a method to display hotel details
        hotel3.displayDetails();
    }
}

class HotelBooking {

    // default variables should be initialized
    private String guestName;
    private String roomType;
    private int nights;

    // create a default constructor
    public HotelBooking() {
        guestName = "Peter";
        roomType = "Single";
        nights = 2;
    }

    // create a parameterized cunstructor 
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // create a copy constructor
    public HotelBooking(HotelBooking hotel) {
        this.guestName = hotel.guestName;
        this.nights = hotel.nights;
        this.roomType = hotel.roomType;
    }

    // create a method to diplay details
    public void displayDetails() {
        System.out.println("Guest name: " + guestName);
        System.out.println("Room type: " + roomType);
        System.out.println("Nights: " + nights);
    }
}
