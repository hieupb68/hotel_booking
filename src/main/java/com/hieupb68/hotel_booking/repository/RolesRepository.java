package com.hieupb68.hotel_booking.repository;

import com.hieupb68.hotel_booking.entity.RolesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository<RolesEntity,Integer> {
    public RolesEntity findByRoleName(String roleName);
}
