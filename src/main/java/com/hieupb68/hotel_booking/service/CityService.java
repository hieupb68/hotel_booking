package com.hieupb68.hotel_booking.service;


import com.hieupb68.hotel_booking.DTO.CityHotelDTO;
import com.hieupb68.hotel_booking.DTO.CityProvinceDTO;

public interface CityService {

    public CityProvinceDTO findByCityId(int id); //Hưng
    public CityHotelDTO findByIdCity(int id); //Hưng
}
