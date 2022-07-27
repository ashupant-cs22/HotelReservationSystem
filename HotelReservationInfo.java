package com.bridgelabz;

public class HotelReservationInfo {

    public static void main(String[] args) {

        System.out.println("Welcome to Hotel Reservation Management");
        HotelInfo hotelInfo = new HotelInfo();
        hotelInfo.addHotel();
        System.out.println("Hotel Added");
        System.out.println("Cheapest Hotel WeekdayRegularRate");
        hotelInfo.CheapestHotelWeekDay("1-june-2022", "11-june-2022");
        System.out.println("Cheapest Hotel Weekend Regular Rate");
        hotelInfo.CheapestHotelWeekend("5-Sep-2020", "8-Sep-2020");
    }
}
