package com.ccstudy.racing.dto;

import com.ccstudy.racing.model.Car;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarCollectionDto {
    private List<Car> sortedCars;

    public CarCollectionDto(List<Car> cars) {
        this.sortedCars = cars.stream()
                .sorted(Comparator.comparing(Car::getLocation).reversed())
                .collect(Collectors.toList());
    }

    public String getWinners() {
        int winnerLocation = sortedCars.stream()
                .findFirst()
                .orElseThrow(RuntimeException::new)
                .getLocation();

        return sortedCars.stream()
                .filter(car -> car.isEqualLocation(winnerLocation))
                .map(Car::getName)
                .collect(Collectors.joining(","));
    }
}
