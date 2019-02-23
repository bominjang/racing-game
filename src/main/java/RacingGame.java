import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class RacingGame {
    private int longestRecord;
//    private Map<Integer, List<Car>> result;
    public List<Car> race(int tryTimes, List<Car> cars) {
        for (int i=0; i<tryTimes; i++) {
            repeat(cars);
        }
        return cars;
    }

    public List<Car> repeat(List<Car> cars) {
        for(Car car: cars){
            car.move(new NumberGenerator().generateRandomNumber());
        }
        return cars;
    }

    public List<Car> getWinner(List<Car> cars) {
        Collections.sort(cars);
        this.longestRecord = cars.get(0).getLocation();
        List<Car> winners = new ArrayList<>();
        for(Car car: cars) {
            findTieWinner(car, winners);
        }
        return winners;
    }

    public List<Car> findTieWinner(Car car, List<Car> ties) {
        if(car.getLocation() == longestRecord){
            ties.add(car);
        }
        return ties;
    }
}
