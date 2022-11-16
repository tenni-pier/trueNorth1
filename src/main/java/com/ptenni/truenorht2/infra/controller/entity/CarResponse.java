package com.ptenni.truenorht2.infra.controller.entity;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CarResponse {

    private String name;
    private String brand;
    private String model;
    private String vin;
    private String message;
}
