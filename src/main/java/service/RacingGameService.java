package service;

import model.RacingGameAttendeeGroup;
import model.Car;
import dto.RacingGameInfo;
import util.ExtractRandom;

import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class RacingGameService {

    private RacingGameInfo racingGameInfo;
    private RacingGameAttendeeGroup racingGameAttendeeGroup;

    public RacingGameService(RacingGameInfo racingGameInfo) {
        this.racingGameInfo = racingGameInfo;
        this.racingGameAttendeeGroup = new RacingGameAttendeeGroup(racingGameInfo.getAttendeeList());
    }

    public void startGame(){
        racingGameAttendeeGroup.racing(racingGameInfo);
    }

    public RacingGameAttendeeGroup getRacingGameAttendeeGroup(){
        return this.racingGameAttendeeGroup;
    }




}
