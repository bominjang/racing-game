import java.util.ArrayList;
import java.util.List;

public class RacingGame {
    private List<Car> cars;
    private int times;

    public RacingGame(){
        this.cars = new ArrayList<>();
    }

    public void init(int numCar, int tryCount){
        this.times = tryCount;
        for(int i=0; i<numCar; i++){
            cars.add(new Car());
        }
    }

    public void start(){
        for(Car car: cars){
            car.repeatUpTo(times);
        }
    }

    public void print(){
        for(Car car: cars){
            System.out.println(car.drawRacingRoad());
        }
    }

    public List<Car> getCars() {
        return cars;
    }


}
