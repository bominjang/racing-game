package ui;

import model.RacingGameAttendeeGroup;
import model.Car;
import service.RacingGameMatchResult;

public class OutputView {

    public static void printTrack(RacingGameAttendeeGroup attendee){
        attendee.getCars().forEach(car -> System.out.println(car.getName()+":"+drawTrack(car.getPosition())));
    }

    public static void printWinner(RacingGameAttendeeGroup attendee){
        RacingGameMatchResult racingGameMatchResult = new RacingGameMatchResult();
        Car car = racingGameMatchResult.getWinner(attendee);
        System.out.println("우승자는: " + car.getName() + "입니다.");
    }

    private static String drawTrack(int position){
        StringBuilder track = new StringBuilder();
        for(int i=0; i<position; i++){
            track.append('-');
        }
        return track.toString();
    }

}
