package org.ccstudy.racing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Race {

    private static final String REGEX = ",";
    private static final String APPEND_REGEX = ", ";

    private int times;
    private List<Car> cars;
    private List<String> status;
    private List<Car> winCars;

    public Race(final String carNames, final int times) {
        this.times = times;
        this.status = new ArrayList<>();
        this.cars = new ArrayList<>();
        this.winCars = new ArrayList<>();
        setCars(carNames);
    }

    public void run() {
        for (int i = 0; i < times; i++)
            oneTime();
        addPosition();
        setWinCars();
    }

    public List<String> getStatus() {
        return status;
    }

    public void addPosition() {
        for (Car car : cars)
            status.add(car.getPositionToString());
    }

    private void setWinCars() {
        int max = cars.stream().mapToInt(car -> car.getPosition()).max().getAsInt();
        winCars = cars.stream().filter(car -> car.getPosition() == max).collect(Collectors.toList());
    }

    public List<Car> getWinCars() {
        return winCars;
    }

    public void result() {
        for (Car car : winCars)
            car.drawPosition();

        System.out.println(getWinnersName() + "가 최종 우승하였습니다.");
    }

    private String getWinnersName() {
        String winnersName = "";
        for (Car car : winCars)
            winnersName += car.getName() + APPEND_REGEX;
        return winnersName.substring(0, winnersName.length() - APPEND_REGEX.length());
    }


    private void setCars(final String carNames) {
        String[] nameArray = carNames.split(REGEX);
        for (int i = 0; i < nameArray.length; i++)
            cars.add(new Car(nameArray[i]));
    }

    private void oneTime() {
        for (Car car : cars)
            car.foward(NumberGenerator.generateRandomNumber());
    }


}
