package com.ptenni.truenorht2.infra.controller.advice;

import com.ptenni.truenorht2.infra.controller.entity.CarResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.net.http.HttpResponse;

@ControllerAdvice
public class CarAdvice {

    //Not_Found
    public HttpResponse<CarResponse> carNotFound(){
        return null;
    }
}
