package model;

import java.util.ArrayList;
import java.util.List;

public class AttendeeGroup {

    private List<Car> cars = new ArrayList<>();

    public AttendeeGroup(int numberOfCars) {
        addCars(numberOfCars);
    }

    public List<Car> getCars() {
        return cars;
    }

    private void addCars(int numberOfCars){
        for(int i=0; i<numberOfCars; i++) {
            cars.add(new Car());
        }
    }
}
