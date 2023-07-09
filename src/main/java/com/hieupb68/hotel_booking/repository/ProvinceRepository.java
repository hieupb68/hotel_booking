package com.hieupb68.hotel_booking.repository;

import com.hieupb68.hotel_booking.entity.ProvinceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinceRepository extends JpaRepository<ProvinceEntity,Integer> {
    public List<ProvinceEntity> findByProvince(String provinceName);
}