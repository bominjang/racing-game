package com.ccstudy.racing;

import com.ccstudy.racing.common.RandomNumberGenerator;
import com.ccstudy.racing.model.Car;

import java.util.ArrayList;
import java.util.List;

public class RacingCarService {
    public List<Car> race(int countOfCar, int numberOfAttempt) {
        List<Car> cars = new ArrayList<>();

        for (int i = 0 ; i < countOfCar ; i ++){
            cars.add(new Car());
        }

        cars.forEach(car -> car.attemptToMove(new RandomNumberGenerator().generateNumber(numberOfAttempt)));
        return cars;
    }
}
