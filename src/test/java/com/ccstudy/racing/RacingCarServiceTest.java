package com.ccstudy.racing;

import com.ccstudy.racing.model.Car;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class RacingCarServiceTest {

    @Test
    public void start() {
        RacingCarService racingCarService = new RacingCarService();

        List<Car> cars = racingCarService.race(new String[]{"유성","수정","동규","예은","찬인"}, 5);

        assertThat(cars.size()).isEqualTo(5);
        cars.forEach(this::check);
    }

    private void check(Car car) {
        assertThat(checkNumber(car.getLocation())).isTrue();
    }

    private boolean checkNumber(int number) {
        return number < 6 && number > 0;
    }
}