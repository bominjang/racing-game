package org.ccstudy.racing;

import java.util.ArrayList;
import java.util.List;

//1. 주어진 횟수만큼 전진, 정지
//2. 0~9 난수 발생으로 4이상 전진 미만 정지
//3. 자동차 상태 출력
//입력은 자동차 대수, 횟수
public class Race {

    private int times;
    private List<Car> cars;
    private List<String> status;

    public Race(final int numberOfCars, final int times) {
        this.times = times;
        this.status = new ArrayList<>();
        this.cars = new ArrayList<>();
        setCars(numberOfCars);
    }

    public void run() {
        for (int i = 0; i < times; i++)
            oneTime();
        addPosition();
    }

    public List<String> getStatus() {
        return status;
    }

    public void addPosition() {
        for (Car car : cars)
            status.add(car.drawPosition());
    }


    private void setCars(final int numberOfCars) {
        for (int i = 0; i < numberOfCars; i++)
            cars.add(new Car());
    }

    private void oneTime() {
        for (Car car : cars)
            car.foward(NumberGenerator.generateRandomNumber());
    }

}
