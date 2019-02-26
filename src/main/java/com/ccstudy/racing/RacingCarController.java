package com.ccstudy.racing;

import com.ccstudy.racing.model.Car;
import com.ccstudy.racing.model.CarResult;

import java.util.List;
import java.util.Scanner;

public class RacingCarController {

    private RacingCarService racingCarService;

    public RacingCarController(RacingCarService racingCarService) {
        this.racingCarService = racingCarService;
    }


    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split(",");
        int numberOfAttempt = scanner.nextInt();
        List<Car> cars = racingCarService.race(names, numberOfAttempt);

        cars.stream()
                .map(Car::converter)
                .forEach(System.out::println);


        CarResult result = new CarResult(cars);

        System.out.println(result.getWinner() + "가 최종 우승했습니다.");
    }

    public void fixedStartGame() {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[]{"aaa","bb","cccc"};
        int numberOfAttempt = 5;

        List<Car> cars = racingCarService.race(names, numberOfAttempt);

        cars.stream()
                .map(Car::converter)
                .forEach(System.out::println);


        CarResult result = new CarResult(cars);

        System.out.println(result.getWinner() + "가 최종 우승했습니다.");
    }

}
