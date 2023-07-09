package com.hieupb68.hotel_booking.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class BookingModel {
    private int id;

    private int adultNumber;

    private int childNumber;

    private String bookingStatus;

    private String paymentMethod;

    private float totalPrice;

    private Date checkIn;

    private Date checkOut;
    private Date paidDate;
    private Date cancelDate;

    List<BookingRoomModel> bookingRoomModels;

}
