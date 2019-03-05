package com.ccstudy.racing;

import com.ccstudy.racing.common.RandomNumberGenerator;
import com.ccstudy.racing.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RacingCarService {
    public List<Car> race(String[] names, int numberOfAttempt) {
        List<Car> cars = new ArrayList<>();

        for (String name : names) {
            cars.add(new Car(name));
        }

        List<Integer> randomNumbers = new RandomNumberGenerator().generateNumber(numberOfAttempt);

        return cars.stream()
                .map(car -> car.attemptToMove(randomNumbers))
                .collect(Collectors.toList());
    }
}
