package model;

import dto.RacingGameInfo;
import util.ExtractRandom;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class RacingGameAttendeeGroup {

    private List<Car> cars = new ArrayList<>();

    public RacingGameAttendeeGroup(String attendeeList) {
        addCars(attendeeList.split(","));
    }

    public List<Car> getCars() {
        return cars;
    }

    private List<Car> addCars(String[] attendeeList){
        for(int i=0; i<attendeeList.length; i++) {
            cars.add(new Car(attendeeList[i]));
        }
        return this.cars;
    }

    public void racing(RacingGameInfo racingGameInfo){
        for(Car car: cars){
            attemptMoving(car, racingGameInfo.getNumberOfAttempt(), racingGameInfo.getConditionToMove());
        }
    }

    private void attemptMoving(Car car, int numberOfGames, int conditionToMove){
        for(int i=0; i<numberOfGames; i++) {
           moveCarByRandomNumber(car, conditionToMove);
        }
    }

    private void moveCarByRandomNumber(Car car, int conditionToMove){
        if (ExtractRandom.getRandomNumber() >= conditionToMove)
            car.move();
    }


    public Car getWinner(){
       this.cars.stream()
                .sorted(comparing(Car::getPosition).reversed())
                .collect(toList());
        return cars.get(0);
    }


}
