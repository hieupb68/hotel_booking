package com.hieupb68.hotel_booking.service;

import com.hieupb68.hotel_booking.entity.UsersEntity;

import java.util.List;


public interface SigninService {
    public List<UsersEntity> newPassword(String email, String password, String passwordConfirm);

}