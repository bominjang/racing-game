import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfCars = sc.nextInt();
        int tryTimes = sc.nextInt();

        RacingGame game = new RacingGame();
        List<Car> cars = new ArrayList<>();
        for(int i=0; i<numberOfCars; i++) {
            cars.add(new Car());
        }
        game.init(tryTimes);
        game.start(cars);
        game.print(cars);
    }
}
