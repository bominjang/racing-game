package service;

import model.AttendeeGroup;
import model.Car;
import dto.RacingGameInfo;
import util.ExtractRandom;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
        //TODO: 정렬구현
        return attendeeGroup.getCars().get(0);
    }

}
