package com.ptenni.truenorht2.infra.controller;


import com.ptenni.truenorht2.core.model.CarModel;
import com.ptenni.truenorht2.core.service.CarService;
import com.ptenni.truenorht2.infra.controller.entity.CarResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

class CarControllerTest {

    private CarController carController;

    @Mock
    private CarService carService;

    @BeforeEach
    void setUp() {
        carController = new CarController(carService);
    }

    @Test
    void shouldSearchCarByBin() {

        when(carService.searchByVin("abc123")).thenReturn(CarModel.builder().vin("abc123").build());

        CarResponse response = carController.search("abc123");

        assertNotNull(response);
        assertThat(response.getVin(), is("abc123"));
    }
}