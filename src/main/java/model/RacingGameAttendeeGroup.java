package model;

import util.ExtractRandom;

import java.util.ArrayList;
import java.util.List;

public class RacingGameAttendeeGroup {

    private List<Car> cars = new ArrayList<>();

    public RacingGameAttendeeGroup(String attendeeList) {
        addCars(attendeeList.split(","));
    }

    public List<Car> getCars() {
        return cars;
    }

    private List<Car> addCars(String[] attendeeList){
        for(int i=0; i<attendeeList.length; i++) {
            cars.add(new Car(attendeeList[i]));
        }
        return this.cars;
    }

    public void racing(int numberOfGames, int conditionToMove){
        for(Car car: cars){
            attemptMoving(car, numberOfGames, conditionToMove);
        }

    }

    private void attemptMoving(Car car, int numberOfGames, int conditionToMove){
        for(int i=0; i<numberOfGames; i++) {
           moveCarByRandomNumber(car, conditionToMove);
        }
    }

    private void moveCarByRandomNumber(Car car, int conditionToMove){
        if (ExtractRandom.getRandomNumber() >= conditionToMove)
            car.move();
    }



}
