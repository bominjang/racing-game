package com.ccstudy.racing;

import com.ccstudy.racing.dto.CarCollectionDto;
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
        String[] names = scanner.nextLine().split(",");
        int numberOfAttempt = scanner.nextInt();
        List<Car> cars = racingCarService.race(names, numberOfAttempt);

        printResult(cars);
    }

    private void printResult(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.convertLocation());
        }

        CarCollectionDto carCollectionDto = new CarCollectionDto(cars);
        System.out.println(carCollectionDto.getWinners() + "가 최종 우승했습니다.");
    }
}
