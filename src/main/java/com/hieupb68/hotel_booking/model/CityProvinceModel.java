package com.hieupb68.hotel_booking.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CityProvinceModel {
    /**
     *  hotel
     */
    private List<HotelModel> hotelModels;
    /**
     *  Search
     */
    private int dateOfStay;
    private int adultNumber;
    private int childNumber;
    private int countAccommodation;
}
