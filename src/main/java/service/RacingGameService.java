package service;

import model.Car;
import model.RacingGameInfo;
import util.ExtractRandom;

public class RacingGameService {

    private RacingGameInfo racingGameInfo;

    public RacingGameService(RacingGameInfo racingGameInfo) {
        this.racingGameInfo = racingGameInfo;
    }

    public void startGame(){
        int numberOfGames=racingGameInfo.getCountOfAttempt();
        for(Car car : racingGameInfo.getCars()){
             racing(car, numberOfGames);
        }
    }

    public void racing(Car car, int numberOfGames){
        int conditionToMove = racingGameInfo.getConditionToMove();
        for (int i=0; i<numberOfGames; i++) {
            attemptMoving(car, conditionToMove);
        }
    }

    public void attemptMoving(Car car, int conditionToMove){
        if(ExtractRandom.getRandomNumber() >= conditionToMove) car.move();
    }


    public void printResult(){
        racingGameInfo.getCars().forEach(car -> System.out.println(car.status()));
    }

}
