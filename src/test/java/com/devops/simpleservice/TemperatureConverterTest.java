package com.devops.simpleservice;

import com.devops.simpleservice.service.TemperatureConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
public class TemperatureConverterTest {
    @Autowired
    TemperatureConverter temperatureConverter;

    @Test
    void test_CToF(){
        float tempValue = 34.6F;
        Optional<String> response = Optional.ofNullable(temperatureConverter.tempConverter(tempValue, 1));
        Assertions.assertTrue(response.isPresent());
        Assertions.assertEquals("Input Temp:34.6 -->Input converter:1-->Your conversion is here.. 33.8°F", response.get());
    }
}
