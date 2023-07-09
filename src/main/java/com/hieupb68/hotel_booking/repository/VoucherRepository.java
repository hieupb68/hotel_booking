package com.hieupb68.hotel_booking.repository;

import com.hieupb68.hotel_booking.entity.VoucherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VoucherRepository extends JpaRepository<VoucherEntity, Integer> {

}