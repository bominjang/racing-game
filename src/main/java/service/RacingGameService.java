package service;

import model.Attendee;
import model.Car;
import dto.RacingGameInfo;
import util.ExtractRandom;

public class RacingGameService {

    private RacingGameInfo racingGameInfo;
    private Attendee attendee;

    public RacingGameService(RacingGameInfo racingGameInfo) {
        this.racingGameInfo = racingGameInfo;
        this.attendee  = new Attendee(racingGameInfo.getNumberOfCars());
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

    public Attendee getAttendee(){
        return this.attendee;
    }

    //return 값 void 지양

}
