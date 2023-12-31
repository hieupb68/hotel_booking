package com.hieupb68.hotel_booking.DTO;

import com.hieupb68.hotel_booking.model.AttractionModelByDai;
import com.hieupb68.hotel_booking.model.CityProvinceModel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CitySearchDTO extends CityProvinceModel {
    private int id;
    private String nameCity;
    private String nameProvince;

    /**
     *  Attraction
     */
    private List<AttractionModelByDai> attractionModelByDais;
}
