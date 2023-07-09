package com.hieupb68.hotel_booking.model;

import com.hieupb68.hotel_booking.entity.RoomEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoomDatesModel {
    private int id;
    private int roomStatus;
    private RoomEntity room;
    private CalendarModel calendarModel;

}
