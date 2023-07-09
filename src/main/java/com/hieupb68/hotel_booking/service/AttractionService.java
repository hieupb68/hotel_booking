package com.hieupb68.hotel_booking.service;

import com.hieupb68.hotel_booking.model.AttractionModel;

import java.util.List;

public interface AttractionService {
    public List<AttractionModel> findAttractionsByHotelId(int id);
}