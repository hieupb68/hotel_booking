package com.hieupb68.hotel_booking.repository;

import com.hieupb68.hotel_booking.entity.HotelServiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelServiceRepository extends JpaRepository<HotelServiceEntity,Integer> {//
//    @Query("select hs from hotel_service hs where hs.hotelId =?1")
//    List<HotelServiceEntity> findHotelServiceByHotelId (int hotelId);

    @Query(value = "SELECT * FROM hotel_service WHERE hotel_service.hotel_id =?1", nativeQuery=true)
    List<HotelServiceEntity> findHotelServiceByHotelId(int id);


}