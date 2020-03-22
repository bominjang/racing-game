package racing.view;

import java.util.Scanner;

public class InputScanner {
    static Scanner scanner = new Scanner(System.in);

    public static int getNumberOfCar(){
        System.out.println("자동차 대수는 몇 대 인가요?");
        return scanner.nextInt();
    }

    public static int getNumberOfChallenge() {
        System.out.println("시도할 횟수는 몇 회 인가요?");
        return scanner.nextInt();
    }
}
