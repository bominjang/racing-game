package racing.view;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private int numberOfChallenge;
    private int numberOfCar;
    private List<Integer> carPosition = new ArrayList<>();
    private List<Car> carList;

    RacingGame(int numberOfCar, int numberOfChallenge){
        this.numberOfCar = numberOfCar;
        this.numberOfChallenge = numberOfChallenge;
        carList = CarFactory.produceCar(numberOfCar);
    }
    public List<Integer> move(){
        for(int i=0;i<numberOfCar;i++){
            int runVal=0;
            int newRun = 0;
            runVal = carList.get(i).runOrStay();
            newRun = carPosition.get(i)+runVal;
            carPosition.add(i,newRun);
        }
        return carPosition;
    }
}
