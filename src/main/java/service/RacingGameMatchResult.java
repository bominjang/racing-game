package service;

import model.Car;
import model.RacingGameAttendeeGroup;

import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class RacingGameMatchResult {

    public Car getWinner(RacingGameAttendeeGroup racingGameAttendeeGroup){
        List<Car> cars = racingGameAttendeeGroup.getCars()
                .stream()
                .sorted(comparing(Car::getPosition).reversed())
                .collect(toList());
        return cars.get(0);
    }

}
