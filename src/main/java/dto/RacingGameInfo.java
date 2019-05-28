package dto;

public class RacingGameInfo {

    private int conditionToMove;//전진조건
    private int numberOfAttempt;//도전횟수

    private String attendeeList;

    public RacingGameInfo(int conditionToMove, int numberOfAttempt, String attendeeList) {
        if(!checkInputValue(conditionToMove, numberOfAttempt)){
            System.out.println("잘못된 입력입니다.");
            return;
        }
        this.conditionToMove = conditionToMove;
        this.numberOfAttempt = numberOfAttempt;
        this.attendeeList = attendeeList;
    }

    public int getCountOfAttempt() {
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
            return false;
        }
        return true;
    }
}
