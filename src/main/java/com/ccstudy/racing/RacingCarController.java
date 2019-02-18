package com.ccstudy.racing;

import com.ccstudy.racing.model.Car;

import java.util.List;
import java.util.Scanner;

public class RacingCarController {

    private RacingCarService racingCarService;

    public RacingCarController(RacingCarService racingCarService) {
        this.racingCarService = racingCarService;
    }


    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        int countOfCar = scanner.nextInt();
        int numberOfAttempt = scanner.nextInt();
        List<Car> cars = racingCarService.race(countOfCar, numberOfAttempt);

        for (Car car : cars) {
            System.out.println(car.converter());
        }
    }

}
