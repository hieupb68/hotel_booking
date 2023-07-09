package com.hieupb68.hotel_booking.repository;

import com.hieupb68.hotel_booking.entity.ServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ServiceRepository extends JpaRepository<ServiceEntity,Integer> {//Vũ sửa từ ServiceHotelRepository by Hưng
}

