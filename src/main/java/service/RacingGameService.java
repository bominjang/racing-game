package service;

import model.AttendeeGroup;
import model.Car;
import dto.RacingGameInfo;
import util.ExtractRandom;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class RacingGameService {

    private RacingGameInfo racingGameInfo;
    private AttendeeGroup attendeeGroup;

    public RacingGameService(RacingGameInfo racingGameInfo) {
        this.racingGameInfo = racingGameInfo;
        this.attendeeGroup = new AttendeeGroup(racingGameInfo.getAttendeeList());
    }

    public void startGame(){
        int numberOfGames=racingGameInfo.getCountOfAttempt();
        for(Car car : attendeeGroup.getCars()){
             racing(car, numberOfGames);
        }
    }

    private void racing(Car car, int numberOfGames){
        int conditionToMove = racingGameInfo.getConditionToMove();
        for (int i=0; i<numberOfGames; i++) {
            attemptMoving(car, conditionToMove);
        }
    }

    private void attemptMoving(Car car, int conditionToMove){
        if(ExtractRandom.getRandomNumber() >= conditionToMove){
            car.move();
        }
    }

    public AttendeeGroup getAttendeeGroup(){
        return this.attendeeGroup;
    }

    public Car getWinner(){
        List<Car> cars = attendeeGroup.getCars()
                .stream()
                .sorted(comparing(Car::getPosition).reversed())
                .collect(toList());
        return cars.get(0);
    }

}
