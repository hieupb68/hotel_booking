package com.hieupb68.hotel_booking.service;

import com.hieupb68.hotel_booking.entity.RoomEntity;
import com.hieupb68.hotel_booking.DTO.RoomDetailDTO;
import com.hieupb68.hotel_booking.payload.request.SearchRequest;

import java.util.List;

public interface RoomService {

    public List<RoomDetailDTO> findRoomsByHotelId(int id); //Hung
    public List<RoomDetailDTO> findRoomsByHotelIdAndSearchRequest(int id, SearchRequest searchRequest); //Đại
    //CRUD
    RoomEntity addRoom(RoomEntity roomEntity);
    List<RoomEntity> findAllRoom();
    RoomEntity findRoomById(Integer id);
    RoomEntity updateRoom(Integer id, RoomEntity roomEntity);
    boolean deleteRoomById(Integer id);
}