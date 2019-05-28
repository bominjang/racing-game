package ui;

import dto.RacingGameInfo;

import java.util.Scanner;

public class InputView {

    private static final int MOVE_CONDITION =4;//전진조건 설정

    public static RacingGameInfo askRacingGameInfo(){
        return new RacingGameInfo(askCountOfAttempt(), MOVE_CONDITION, askRacingAttendeeList());

    }

    private static String askRacingAttendeeList(){
        System.out.println("경주 할 자동차 이름을 입력하세요");
        return new Scanner(System.in).nextLine();
    }

    private static int askCountOfAttempt(){
        System.out.println("시도할 횟수는 몇 회 인가요?");
        return new Scanner(System.in).nextInt();
    }

}
