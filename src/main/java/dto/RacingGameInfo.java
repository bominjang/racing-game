package dto;

public class RacingGameInfo {

    private int conditionToMove;//전진조건
    private int numberOfAttempt;//도전횟수
    private int numberOfCars;

    public int getCountOfAttempt() {
        return this.numberOfAttempt;
    }

    public int getConditionToMove() {
        return this.conditionToMove;
    }

    public int getNumberOfCars(){
        return this.numberOfCars;
    }

    public void setRacingGameInfo(int numberOfAttempt, int conditionToMove, int numberOfCars){
        this.numberOfAttempt=numberOfAttempt;
        this.conditionToMove=conditionToMove;
        this.numberOfCars=numberOfCars;
    }

}
