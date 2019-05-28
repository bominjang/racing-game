package model;

import java.util.ArrayList;
import java.util.List;

public class AttendeeGroup {

    private List<Car> cars = new ArrayList<>();

    public AttendeeGroup(String attendeeList) {
        addCars(attendeeList.split(","));
    }

    public List<Car> getCars() {
        return cars;
    }

    private List<Car> addCars(String[] attendeeList){
        for(int i=0; i<attendeeList.length; i++) {
            cars.add(new Car(attendeeList[i]));
        }
        return cars;
    }

}
