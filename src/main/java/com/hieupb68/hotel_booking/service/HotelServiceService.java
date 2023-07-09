package com.hieupb68.hotel_booking.service;

import com.hieupb68.hotel_booking.model.ServiceModel;

import java.util.List;

public interface HotelServiceService  { //ServiceOfHotelService
    List<ServiceModel> findServiceByHotelId(int id);
}