package dto;

public class RacingGameInfo {

    private int conditionToMove;//전진조건
    private int numberOfAttempt;//도전횟수
    private String attendeeList;//참가자리스트

    public RacingGameInfo(int conditionToMove, int numberOfAttempt, String attendeeList) {
        checkInputValue(conditionToMove, numberOfAttempt);
        this.conditionToMove = conditionToMove;
        this.numberOfAttempt = numberOfAttempt;
        this.attendeeList = attendeeList;
    }

    public int getNumberOfAttempt() {
        return this.numberOfAttempt;
    }

    public int getConditionToMove() {
        return this.conditionToMove;
    }

    public String getAttendeeList() {
        return attendeeList;
    }

    private boolean checkInputValue(int conditionToMove, int numberOfAttempt){
        if(conditionToMove < 0 || numberOfAttempt < 0){
            throw new IllegalArgumentException();
        }
        return true;
    }
}
