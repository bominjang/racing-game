package ui;

import java.util.Scanner;

public class InputView {

    public int askNumberOfCars(){
        System.out.println("자동차 대수는 몇 대 인가요?");
        return new Scanner(System.in).nextInt();
    }

    public int askCountOfAttempt(){
        System.out.println("시도할 횟수는 몇 회 인가요?");
        return new Scanner(System.in).nextInt();
    }

}
