import java.util.List;

public class RacingGame {
    private int tryTimes;

    public void start(int tryTimes, List<Car> cars) {
        for (int i=0; i<tryTimes; i++) {
            repeat(cars);
        }
    }

    public void repeat(List<Car> cars) {
        for(Car car: cars){
            car.move(new NumberGenerator().generateRandomNumber());
        }
    }

    public void print(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.drawRacingRoad());
        }
    }
}
