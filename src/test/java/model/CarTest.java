package model;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CarTest {

    private Car car;

    @Test
    public void testMove() {
        //given
        Car car = new Car();
        //when
        car.move();
        //then
        assertThat(car.getPosition(), is(1));
    }

}