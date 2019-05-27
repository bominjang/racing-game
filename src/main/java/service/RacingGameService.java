package service;

import model.AttendeeGroup;
import model.Car;
import dto.RacingGameInfo;
import util.ExtractRandom;

public class RacingGameService {

    private RacingGameInfo racingGameInfo;
    private AttendeeGroup attendee;

    public RacingGameService(RacingGameInfo racingGameInfo) {
        this.racingGameInfo = racingGameInfo;
        this.attendee  = new AttendeeGroup(racingGameInfo.getNumberOfCars());
    }

    public void startGame(){
        int numberOfGames=racingGameInfo.getCountOfAttempt();
        for(Car car :attendee.getCars()){
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

    public AttendeeGroup getAttendee(){
        return this.attendee;
    }



}
