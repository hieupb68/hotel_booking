package com.hieupb68.hotel_booking.repository;

import com.hieupb68.hotel_booking.entity.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<CityEntity,Integer> {
    public List<CityEntity> findByCity(String cityName);
}
