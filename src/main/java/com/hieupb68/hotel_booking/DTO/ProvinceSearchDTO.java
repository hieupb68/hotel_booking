package com.hieupb68.hotel_booking.DTO;

import com.hieupb68.hotel_booking.model.CityModel;
import com.hieupb68.hotel_booking.model.CityProvinceModel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProvinceSearchDTO extends CityProvinceModel {
    private int id;
    private String nameProvince;
    protected List<CityModel> cityModels;

}
