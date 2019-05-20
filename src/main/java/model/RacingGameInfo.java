package model;

import java.util.ArrayList;
import java.util.List;

public class RacingGameInfo {

    private int conditionToMove;//전진조건
    private int numberOfAttempt;//도전횟수
    private List<Car> cars;//참가자

    public RacingGameInfo(int conditionToMove, int numberOfAttempt, int numberOfCars) {
        this.conditionToMove = conditionToMove;
        this.numberOfAttempt = numberOfAttempt;
        this.cars = new ArrayList<>(numberOfCars);
        this.makeCar(numberOfCars);
    }

    public List<Car> getCars() {
        return this.cars;
    }

    public int getCountOfAttempt() {
        return this.numberOfAttempt;
    }

    public int getConditionToMove() {
        return this.conditionToMove;
    }

    private void makeCar(int numberOfCars){
        for(int i=0; i< numberOfCars; i++)
            cars.add(new Car());
    }

}
