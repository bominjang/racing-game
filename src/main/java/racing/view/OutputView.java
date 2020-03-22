package racing.view;

import racing.domain.Car;
import racing.domain.RacingApplication;
import racing.domain.RacingGame;

import java.util.List;

public class OutputView {
    public OutputView(){
        System.out.println("실행 결과");
    }

    public void outputRacingScore(List<Integer> carPosition){
        for(int i=0;i< RacingApplication.numberOfCar;i++){
            outputScoreForOne(carPosition.get(i));
            System.out.println("");
        }
    }
    private void outputScoreForOne(int score){
        for(int i=0;i<score;i++){
            System.out.println("-");
        }
    }

}