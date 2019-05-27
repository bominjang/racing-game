package dto;

public class RacingGameInfo {

    private int conditionToMove;//전진조건
    private int numberOfAttempt;//도전횟수
    private int numberOfCars;

    public RacingGameInfo(int conditionToMove, int numberOfAttempt, int numberOfCars) {
        if(!checkInputValue(conditionToMove, numberOfAttempt, numberOfCars))
        this.conditionToMove = conditionToMove;
        this.numberOfAttempt = numberOfAttempt;
        this.numberOfCars = numberOfCars;
    }

    public int getCountOfAttempt() {
        return this.numberOfAttempt;
    }

    public int getConditionToMove() {
        return this.conditionToMove;
    }

    public int getNumberOfCars(){
        return this.numberOfCars;
    }

    private boolean checkInputValue(int conditionToMove, int numberOfAttempt, int numberOfCars){
        if(conditionToMove < 0){
            return false;
        }
        if(numberOfAttempt < 0 ){
            return false;
        }
        if(numberOfCars < 0 ){
            return false;
        }
        return true;
    }
}
