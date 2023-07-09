package com.hieupb68.hotel_booking.service;

import com.hieupb68.hotel_booking.entity.HotelEntity;

import java.util.List;
import java.util.Optional;

public interface HotelService {

    public Optional<HotelEntity> findById(int id); //Hưng

    //CRUD
    HotelEntity addHotel(HotelEntity hotelEntity);
    List<HotelEntity> findAllHotel();
    HotelEntity findHotelById(Integer id);
    HotelEntity updateHotel(Integer id, HotelEntity hotelEntity);
    boolean deleteHotelById(Integer id);

}
