package com.hieupb68.hotel_booking.repository;

import com.hieupb68.hotel_booking.entity.TokenExpiredEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends JpaRepository<TokenExpiredEntity,Integer> {
    public TokenExpiredEntity findByName(String token);
}
