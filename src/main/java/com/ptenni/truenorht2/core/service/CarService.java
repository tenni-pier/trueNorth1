package com.ptenni.truenorht2.core.service;


import com.ptenni.truenorht2.core.model.CarModel;

public class CarService {

    private Object externalAPi;
    public CarModel searchByVin(String vin){

        //simulate db search

        return CarModel.builder().vin("asdfg244").build();
    }
}
