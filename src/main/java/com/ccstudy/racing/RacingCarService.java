package com.ccstudy.racing;

import com.ccstudy.racing.common.RandomNumberGenerator;
import com.ccstudy.racing.model.Car;

import java.util.ArrayList;
import java.util.List;

public class RacingCarService {
    public List<Car> race(String[] names, int numberOfAttempt) {
        List<Car> cars = new ArrayList<>();

        for(String name : names){
            cars.add(new Car(name));
        }
        
        cars.forEach(car -> car.attemptToMove(new RandomNumberGenerator().generateNumber(numberOfAttempt)));
        return cars;
    }
}
