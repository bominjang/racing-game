package ui;

import model.Attendee;

public class OutputView {

    public static void printResult(Attendee attendee){
        attendee.getCars().forEach(car -> System.out.println(drawTrack(car.getPosition())));
    }

    private static String drawTrack(int position){
        StringBuilder track = new StringBuilder();
        for(int i=0; i<position; i++){
            track.append('-');
        }
        return track.toString();
    }

}
