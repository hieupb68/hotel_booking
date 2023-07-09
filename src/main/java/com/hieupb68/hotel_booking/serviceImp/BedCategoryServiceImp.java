package com.hieupb68.hotel_booking.serviceImp;

import com.hieupb68.hotel_booking.entity.BedCategoryEntity;
import com.hieupb68.hotel_booking.model.BedCategoryModel;
import com.hieupb68.hotel_booking.repository.BedCategoryRepository;
import com.hieupb68.hotel_booking.service.BedCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BedCategoryServiceImp implements BedCategoryService {
    @Autowired
    BedCategoryRepository bedCategoryRepository;
    @Override
    public BedCategoryModel findBedModelById(int id) {
        Optional<BedCategoryEntity> bedCategoryEntity = bedCategoryRepository.findById(id);
        BedCategoryModel bedCategoryModel = new BedCategoryModel();
        bedCategoryModel.setId(bedCategoryEntity.get().getId());
        bedCategoryModel.setBedCategory(bedCategoryEntity.get().getBedCategory());
        return bedCategoryModel;
    }
}