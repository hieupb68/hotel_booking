package com.hieupb68.hotel_booking.service;

import com.hieupb68.hotel_booking.entity.VoucherEntity;

import java.util.List;

public interface VoucherService {
    //CRUD
    VoucherEntity addVoucher(VoucherEntity voucherEntity);
    List<VoucherEntity> findAllVoucher();
    VoucherEntity findVoucherById(Integer id);
    VoucherEntity updateVoucher(Integer id, VoucherEntity voucherEntity);
    boolean deleteVoucherById(Integer id);

}
