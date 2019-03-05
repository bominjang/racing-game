package com.ccstudy.racing.dto;

import com.ccstudy.racing.model.Car;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarCollectionDtoTest {


    @Test
    public void 경주를_마친_자동차들을_줬을때_우승자_찾기() {
        //given
        List<Car> cars = Arrays.asList(createCar(3, "유성"),
                createCar(3, "수정"),
                createCar(1, "동규"));

        //when
        CarCollectionDto carCollectionDto = new CarCollectionDto(cars);
        String winners = carCollectionDto.getWinners();

        //then
        assertThat(winners).isEqualTo("유성,수정");

    }
    private Car createCar(int location, String name) {
        return new Car(location, name);
    }
}