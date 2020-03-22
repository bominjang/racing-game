package racing.view;

import jdk.internal.util.xml.impl.Input;

public class RacingApplication {
    public static int numberOfCar;
    public static int numberOfChallenge;

    public static void main(String[] args) {
        numberOfCar = InputScanner.getNumberOfCar();
        numberOfChallenge = InputScanner.getNumberOfChallenge();
        RacingGame racingGame = new RacingGame(numberOfCar, numberOfChallenge);
    }
}
