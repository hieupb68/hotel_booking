package com.hieupb68.hotel_booking.serviceImp;

import com.hieupb68.hotel_booking.entity.RoomCategoryEntity;
import com.hieupb68.hotel_booking.model.RoomCategoryModel;
import com.hieupb68.hotel_booking.repository.RoomCategoryRepository;
import com.hieupb68.hotel_booking.service.RoomCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoomCategoryServiceImp implements RoomCategoryService {
    @Autowired
    RoomCategoryRepository roomCategoryRepository;
    @Override
    public RoomCategoryModel findRoomModelById(int id) {
        Optional<RoomCategoryEntity> roomCategoryEntity = roomCategoryRepository.findById(id);
        RoomCategoryModel roomCategoryModel = new RoomCategoryModel();
        roomCategoryModel.setId(roomCategoryEntity.get().getId());
        roomCategoryModel.setRoomCategory(roomCategoryEntity.get().getRoomCategory());
        return roomCategoryModel;
    }
}