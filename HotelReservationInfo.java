package com.bridgelabz;

public class HotelReservationInfo {

    public static void main(String[] args) {
        System.out.println("Welcome to Hotel Reservation Management");
        HotelDetails hotelDetails = new HotelDetails();
        hotelDetails.addHotel();
        System.out.println("Hotel Added");
        System.out.println("Cheapest Hotel Based on WeekdayRegularRate");
        hotelDetails.CheapestHotel("1-june-2022", "11-june-2022");
    }
}
