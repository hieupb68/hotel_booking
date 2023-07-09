package com.hieupb68.hotel_booking.model;

import com.hieupb68.hotel_booking.entity.UsersEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterResponseModel {
    private UsersEntity usersEntity;
    private String linkActive;
}
