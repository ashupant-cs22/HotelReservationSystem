package com.bridgelabz;

public class HotelReservationInfo {

    public static void main(String[] args) {

        System.out.println("Welcome to Hotel Reservation Management");
        HotelInfo hotelInfo = new HotelInfo();
        hotelInfo.addHotel();
        System.out.println("Hotel Added");

        System.out.println("Cheapest Hotel Weekday Regular Rate");
        hotelInfo.findCheapestHotelOne("10-Sep-2020", "11-Sep-2020");

        System.out.println("Cheapest Hotel Weekend Regular Rate");
        hotelInfo.findCheapestHotelTwo("11-Sep-2020", "12-Sep-2020");

        System.out.println("Cheapest Hotel Based on Weekday Regular Rate");
        hotelInfo.findCheapestHotelOne("10-Sep-2020", "11-Sep-2020");

        System.out.println("Cheapest Hotel Based on Weekend Regular Rate");
        hotelInfo.findCheapestHotelTwo("11-Sep-2020", "12-Sep-2020");

        System.out.println("Cheapest best Rated Hotel Based on WeekendRegularRate");
        hotelInfo.findCheapestHotelRating("11-Sep-2020", "12-Sep-2020");

        System.out.println("Cheapest best Rated Hotel Based on WeekendRewardRate");
        hotelInfo.findCheapestHotelRaitingForReward("11-Sep-2020", "12-Sep-2020");
        


    }
}
