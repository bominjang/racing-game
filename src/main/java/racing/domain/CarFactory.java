package racing.domain;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {
    public static List<Car> carList;
    public static List<Car> produceCar(int numberOfCar){
        carList = new ArrayList<>(numberOfCar);
        for(int i = 0; i<numberOfCar;i++){
            carList.add(new Car());
        }
        return carList;
    }
}