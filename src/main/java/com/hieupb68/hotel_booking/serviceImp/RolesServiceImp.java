package com.hieupb68.hotel_booking.serviceImp;

import com.hieupb68.hotel_booking.entity.RolesEntity;
import com.hieupb68.hotel_booking.repository.RolesRepository;
import com.hieupb68.hotel_booking.service.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolesServiceImp implements RolesService {
    @Autowired
    private RolesRepository rolesRepository;


    @Override
    public RolesEntity getRole(String roleName) {
        return rolesRepository.findByRoleName(roleName);
    }
}