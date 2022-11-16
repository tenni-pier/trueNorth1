package com.ptenni.truenorht2.core.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarModel {

    private String name;
    private String brand;
    private String model;
    private String vin;
}
