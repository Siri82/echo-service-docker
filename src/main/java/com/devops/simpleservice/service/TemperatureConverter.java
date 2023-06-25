package com.devops.simpleservice.service;

import org.springframework.stereotype.Service;

@Service
public class TemperatureConverter {
    public String tempConverter(float tempValue, int convertTo) {
        System.out.println("\n\tWelcome to Temperature Converter\n");
        System.out.print("Enter temp value which you want to convert : " + tempValue);
        float returnValue = -1;
        StringBuffer output = new StringBuffer();
        output.append("Input Temp:"+tempValue);
        output.append(" -->Input converter:"+convertTo);
        if (convertTo == 1) {
            System.out.println("Converting Celsius to Fahrenheit....");
            returnValue = (float) ((convertTo*(1.8))+32);
            System.out.print("Your conversion is here.. "+returnValue+"°F");
            output.append("-->Your conversion is here.. "+returnValue+"°F");
        } else if (convertTo == 2) {
            System.out.println("Converting Fahrenheit to Celsius....");
            float value2 = (float) (convertTo-32);
            returnValue = (float) (value2*(5)/9);
            System.out.print("Your conversion is here.. "+returnValue+"°C");
            output.append("-->Your conversion is here.. "+returnValue+"°F");
        }else{
            output.append("--> Invalid convert option. Select 1 or 2");
        }
        System.out.println("\n\tThank You!!..");
        return output.toString();
    }
}
