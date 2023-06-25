package com.devops.simpleservice.controller;

import com.devops.simpleservice.service.TemperatureConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SimpleTempConverterController {
    @Autowired
    TemperatureConverter temperatureConverter;
    @GetMapping("{tempValue}/{convertTo}")
    public String convert(@PathVariable("tempValue") float tempValue, @PathVariable("convertTo") int converter){
        return temperatureConverter.tempConverter(tempValue, converter);
    }
}
