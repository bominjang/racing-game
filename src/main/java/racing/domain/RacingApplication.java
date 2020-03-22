package racing.domain;

import racing.view.InputScanner;

public class RacingApplication {
    private static int numberOfCar;
    private static int numberOfChallenge;

    public static void main(String[] args) {
        numberOfCar = InputScanner.getNumberOfCar();
        numberOfChallenge = InputScanner.getNumberOfChallenge();
        RacingGame racingGame = new RacingGame(numberOfCar, numberOfChallenge);
        racingGame.move();
    }
}
