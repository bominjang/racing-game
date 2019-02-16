package com.ccstudy.racing.common;

import com.ccstudy.racing.model.Car;

public class RacingResultConverter {
    public static String convert(Car car) {
        StringBuilder temp = new StringBuilder();
        for (int i = 0 ; i < car.getLocation() ; i++) {
            temp.append("-");
        }
        return temp.toString();
    }
}
