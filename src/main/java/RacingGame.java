import java.util.List;

public class RacingGame {
    public List<Car> race(int tryTimes, List<Car> cars) {
        for (int i=0; i<tryTimes; i++) {
            repeat(cars);
        }
        return cars;
    }

    public void repeat(List<Car> cars) {
        for(Car car: cars){
            car.move(new NumberGenerator().generateRandomNumber());
        }
    }
}
