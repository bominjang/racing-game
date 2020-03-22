package racing.domain;

import racing.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private int numberOfChallenge;
    private int numberOfCar;
    private List<Car> carList;
    private OutputView outputView;

    RacingGame(int numberOfCar, int numberOfChallenge){
        this.numberOfCar = numberOfCar;
        this.numberOfChallenge = numberOfChallenge;
        carList = CarFactory.produceCar(numberOfCar);
        outputView = new OutputView();
    }

    public List<Integer> move(){
        List<Integer> carPosition = new ArrayList<>();
        for(int i=0;i<numberOfChallenge;i++){
            outputView.outputRacingScore(nthChallenge(carPosition));
        }
        return carPosition;
    }

    private List<Integer> nthChallenge(List<Integer> carPosition) {
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
