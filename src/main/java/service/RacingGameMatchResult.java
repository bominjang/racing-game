package service;

import model.Car;
import model.RacingGameAttendeeGroup;


public class RacingGameMatchResult {

    public Car getWinner(RacingGameAttendeeGroup racingGameAttendeeGroup){
        return racingGameAttendeeGroup.getWinner();
    }

}
