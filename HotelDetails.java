package com.bridgelabz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HotelDetails {

    ArrayList<Hotel> myHotelList = new ArrayList();

    public void addHotel() {

        Hotel LakeWood = new Hotel("LakeWood", 100, 85, 90, 70, 3);
        Hotel BridgeWood = new Hotel("BridgeWood", 200, 120, 80, 40, 4);
        Hotel RidgeWood = new Hotel("RidgeWood", 300, 110, 130, 30, 5);

        myHotelList.add(LakeWood);
        myHotelList.add(BridgeWood);
        myHotelList.add(RidgeWood);

        System.out.println(myHotelList);
    }

    public void CheapestHotel(String startDateRange, String endDateRange) {

        LocalDate startDate = LocalDate.parse(startDateRange, DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        LocalDate endDate = LocalDate.parse(endDateRange, DateTimeFormatter.ofPattern("dd-MMM-yyyy"));

        int numberOfDays = endDate.getDayOfMonth() - startDate.getDayOfMonth() + 1;

        Optional<Hotel> cheapestHotel = this.myHotelList.stream().sorted(Comparator.comparing(Hotel::getWeekdayRegularRate)).findFirst();

        Hotel hotel = new Hotel();
        hotel.setHotelName(cheapestHotel.get().getHotelName());
        hotel.setTotal(cheapestHotel.get().getWeekdayRegularRate() * numberOfDays);
        System.out.println("HotelName :" + hotel.getHotelName());
        System.out.println("NumberOfDaysStayed  WeekdayRegularRate :" + hotel.getTotal() + "$");

    }

}