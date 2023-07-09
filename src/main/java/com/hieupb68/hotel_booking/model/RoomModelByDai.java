package com.hieupb68.hotel_booking.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RoomModelByDai {
    private int id;
    private String roomName;
    private int maxOccupyAdult;
    private int maxOccupyChild;
    private float price;
    List<RoomDatesModel> roomDatesModels;

}
