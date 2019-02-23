package org.ccstudy.racing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class RaceService {

    private static final String SPLIT_REGEX = ",";
    private static final String APPEND_REGEX = ", ";

    public void run(final String carNames, final int times) {
        final List<Car> cars = makeCars(carNames);
        for (int i = 0; i < times; i++) {
            tryForward(cars);
        }
        result(cars);
    }

    public void result(List<Car> cars) {
        for (Car car : cars){
            car.drawPosition();
        }
        final List<Car> winCars = getWinCars(cars);
        System.out.println(getWinnersName(winCars) + "가 최종 우승하였습니다.");
    }

    private List<Car> getWinCars(List<Car> cars) {
        final int winDistance = cars.stream().mapToInt(car -> car.getPosition()).max().getAsInt();
        return cars.stream().filter(car -> car.getPosition() == winDistance).collect(Collectors.toList());
    }

    private String getWinnersName(List<Car> winCars) {
        return winCars.stream().map(car -> car.getName()).collect(Collectors.joining(APPEND_REGEX));
    }

    private List<Car> makeCars(final String carNames) {
        List<Car> cars = new ArrayList<>();
        final String[] nameArray = carNames.split(SPLIT_REGEX);
        for(String carName : nameArray){
            cars.add(new Car(carName));
        }
        return cars;
    }

    private void tryForward(List<Car> cars) {
        for (Car car : cars){
            car.foward(NumberGenerator.generateRandomNumber());
        }
    }

}
