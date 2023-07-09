package com.hieupb68.hotel_booking.repository;

import com.hieupb68.hotel_booking.entity.BedCategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BedCategoryRepository extends JpaRepository<BedCategoryEntity,Integer> {
}