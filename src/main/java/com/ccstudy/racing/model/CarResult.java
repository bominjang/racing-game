package com.ccstudy.racing.model;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarResult {
    private List<Car> cars;

    public CarResult(List<Car> cars) {
        this.cars = cars;
    }

    public String getWinner(){
        String winners;
        int winnerLocation;

        cars = cars.stream()
                .sorted((car1 , car2) -> car2.getLocation() - car1.getLocation())
                .collect(Collectors.toList());

        winnerLocation = cars.stream()
                .findFirst()
                .get()
                .getLocation();

        winners = cars.stream()
                .filter(car -> car.getLocation() >= winnerLocation)
                .map(Car::getName)
                .collect(Collectors.joining(","));


        return winners;
    }
}
