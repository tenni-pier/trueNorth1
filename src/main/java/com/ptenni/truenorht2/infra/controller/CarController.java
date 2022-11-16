package com.ptenni.truenorht2.infra.controller;

import com.ptenni.truenorht2.core.model.CarModel;
import com.ptenni.truenorht2.core.service.CarService;
import com.ptenni.truenorht2.infra.controller.entity.CarResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/car")
@AllArgsConstructor
public class CarController {

    private CarService carService;

    @GetMapping("/search")
    public CarResponse search(@RequestParam String vin) {

        CarModel carModel = carService.searchByVin(vin);
        if(carModel == null){
            return CarResponse.builder().message("Not Found by vin = " + vin).build();
        }

        return CarResponse.builder().brand(carModel.getBrand())
                .name(carModel.getName())
                .vin(carModel.getVin())
                .build();
    }
}
